package com.zobot.ai.spark.helpers

import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.spark.ml.classification.{DecisionTreeClassificationModel, DecisionTreeClassifier, GBTClassifier, RandomForestClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature._
import org.apache.spark.sql.DataFrame

object DecisionTreeHelpers {
  // Setup labels and features
  def indexLabels(data: DataFrame): StringIndexerModel = {
    new StringIndexer().setInputCol("label").setOutputCol("indexedLabel").fit(data)
  }

  def indexFeatures(data: DataFrame, maxCategories: Int): VectorIndexerModel = {
    new VectorIndexer().setInputCol("features").setOutputCol("indexedFeatures").setMaxCategories(maxCategories).fit(data)
  }

  // Initiate tree
  def makeDecisionTree = new DecisionTreeClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures")

  def makeRandomForest(numTrees: Int): RandomForestClassifier = {
    new RandomForestClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setNumTrees(numTrees)
  }

  def makeGradientBoostedClassifier(maxIterations: Int): GBTClassifier = {
    new GBTClassifier().setLabelCol("indexedLabel").setFeaturesCol("indexedFeatures").setMaxIter(maxIterations)
  }

  // Define transformation from indexed labels back to labels
  def indexedLabelsToLabels(labelIndexer: StringIndexerModel): IndexToString = {
    new IndexToString().setInputCol("prediction").setOutputCol("predictedLabel").setLabels(labelIndexer.labels)
  }

  // Create full model pipeline
  def decisionTreePipeline(labelIndexer: StringIndexerModel, featureIndexer: VectorIndexerModel,
                           decisionTree: Either[DecisionTreeClassifier, Either[RandomForestClassifier, GBTClassifier]],
                           labelConvertor: IndexToString): Pipeline = {
    val tree = decisionTree.fold(dt => dt, _.fold(rf => rf, gbt => gbt))
    new Pipeline().setStages(Array(labelIndexer, featureIndexer, tree.asInstanceOf, labelConvertor))
  }

  // Train and test pipeline
  def trainModel(pipeline: Pipeline, trainingData: DataFrame): PipelineModel = pipeline.fit(trainingData)

  def testModel(model: PipelineModel, testData: DataFrame): DataFrame = model.transform(testData)

  def getModelAccuracy(predictions: DataFrame): Double = {
    val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
    evaluator.evaluate(predictions)
  }

  // Use pipline to create tree model
  def generateTreeModel(trainedModel: PipelineModel, numStages: Int): DecisionTreeClassificationModel = {
    trainedModel.stages(numStages).asInstanceOf[DecisionTreeClassificationModel]
  }
}

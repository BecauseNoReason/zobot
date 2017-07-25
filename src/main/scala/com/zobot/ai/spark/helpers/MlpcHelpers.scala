package com.zobot.ai.spark.helpers

import org.apache.spark.ml.classification.{MultilayerPerceptronClassificationModel, MultilayerPerceptronClassifier}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.sql.DataFrame

object MlpcHelpers {
  case class NeuralNetworkLayers (
    featureLayerSize: Int,
    intermediateLayerSizes: List[Int],
    classLayerSize: Int
  )

  def layersToArray(layers: NeuralNetworkLayers): Array[Int] = {
    (layers.featureLayerSize :: layers.intermediateLayerSizes ::: List(layers.classLayerSize)).toArray
  }

  def createTrainer(layers: NeuralNetworkLayers, blockSize: Int, maxIterations: Int, seed: Option[Long]): MultilayerPerceptronClassifier = {
    val mlpcClassifier = new MultilayerPerceptronClassifier()
      .setLayers(layersToArray(layers))
      .setBlockSize(blockSize)
      .setMaxIter(maxIterations)
    seed match {
      case Some(n) => mlpcClassifier.setSeed(n)
      case None => mlpcClassifier
    }
  }

  def trainModel(trainer: MultilayerPerceptronClassifier, trainingData: DataFrame): MultilayerPerceptronClassificationModel = {
    trainer.fit(trainingData)
  }

  def testModel(model: MultilayerPerceptronClassificationModel, testData: DataFrame): DataFrame = model.transform(testData)

  def getModelAccuracy(testResults: DataFrame): Double = {
    val predictionAndLabels = testResults.select("prediction", "label")
    val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")
    evaluator.evaluate(predictionAndLabels)
  }
}

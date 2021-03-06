package com.zobot.ai.spark.helpers

import org.apache.spark.ml.classification.{LogisticRegression, LogisticRegressionModel}
import org.apache.spark.ml.linalg.Vector
import org.apache.spark.sql.{DataFrame, Row}

object LogisticRegressionHelpers {
  case class ModelTestResults (
    features: Vector,
    label: Double,
    probability: Vector,
    prediction: Double
  )

  def trainModel(estimator: LogisticRegression, trainingSet: DataFrame): LogisticRegressionModel = estimator.fit(trainingSet)

  def testModel(transformer: LogisticRegressionModel, testSet: DataFrame): LogisticRegressionModel = {
    transformer.transform(testSet).select("features", "label", "myProbability", "prediction").collect().foreach {
      case Row(features: Vector, label: Double, prob: Vector, prediction: Double) =>
        ModelTestResults(features, label, prob, prediction)
    }
    transformer
  }
}

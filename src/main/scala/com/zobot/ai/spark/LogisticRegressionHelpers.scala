package com.zobot.ai.spark

import org.apache.spark.ml.classification.{LogisticRegression, LogisticRegressionModel}
import org.apache.spark.ml.linalg.Vector
import org.apache.spark.sql.{DataFrame, Row}

case class ModelTestResults (
  features: Vector,
  label: Double,
  probability: Vector,
  prediction: Double
)

object SparkLogisticRegression {
  def train(estimator: LogisticRegression, trainingSet: DataFrame): LogisticRegressionModel = estimator.fit(trainingSet)

  def test(transformer: LogisticRegressionModel, testSet: DataFrame) = {
    transformer.transform(testSet).select("features", "label", "myProbability", "prediction").collect().foreach {
      case Row(features: Vector, label: Double, prob: Vector, prediction: Double) =>
        ModelTestResults(features, label, prob, prediction)
    }
    transformer
  }
}

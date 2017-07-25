package com.zobot.ai.spark

import com.zobot.ai.spark.helpers.SparkLogisticRegression
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.linalg.Vectors
import org.specs2.Specification

class TestLogisticRegression extends Specification {
  def is = s2"""
                Logistic Regression
                  can train model $testTrainLogisticRegressionModel
      """

  val context = new Context().spark

  def testTrainLogisticRegressionModel = {
    val model = SparkLogisticRegression.train(new LogisticRegression, context.createDataFrame(Seq(
      (1.0, Vectors.dense(0.0, 1.1, 0.1)),
      (0.0, Vectors.dense(2.0, 1.0, -1.0)),
      (0.0, Vectors.dense(2.0, 1.3, 1.0)),
      (1.0, Vectors.dense(0.0, 1.2, -0.5))
    )).toDF("label", "features"))

    model.must_==("tbc")
  }
}

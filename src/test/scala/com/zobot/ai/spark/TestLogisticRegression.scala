package com.zobot.ai.spark

import breeze.linalg.Matrix
import com.zobot.ai.spark.helpers.LogisticRegressionHelpers
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
    val model = LogisticRegressionHelpers.trainModel(new LogisticRegression, context.createDataFrame(Seq(
      (1.0, Vectors.dense(0.0, 1.1, 0.1)),
      (0.0, Vectors.dense(2.0, 1.0, -1.0)),
      (0.0, Vectors.dense(2.0, 1.3, 1.0)),
      (1.0, Vectors.dense(0.0, 1.2, -0.5))
    )).toDF("label", "features"))

    model.coefficientMatrix.toString().must_==("-19.086478256375067  16.278339464295065  -2.494930802874724  ")
  }
}

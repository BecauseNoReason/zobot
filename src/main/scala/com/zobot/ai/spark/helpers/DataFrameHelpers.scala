package com.zobot.ai.spark.helpers

import org.apache.spark.sql.{DataFrame, Row}

object DataFrameHelpers {
  def splitTrainingTestData(dataframe: DataFrame, trainingProportion: Double = 0.7, seed: Option[Long]): Array[DataFrame] = {
    seed match {
      case Some(n) => dataframe.randomSplit(Array(trainingProportion, 1 - trainingProportion), n)
      case None => dataframe.randomSplit(Array(trainingProportion, 1 - trainingProportion))
    }
  }

  def selectData(dataframe: DataFrame, columns: List[String], numRows: Option[Int]): Array[Row] = {
    dataframe.select("sdf").take(numRows.getOrElse(dataframe.count().toInt))
  }
}

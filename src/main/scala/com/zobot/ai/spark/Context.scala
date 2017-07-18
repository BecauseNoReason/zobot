package com.zobot.ai.spark

import org.apache.spark.sql.SparkSession

class Context(appName: String = "Zobot") {
  val spark = SparkSession.builder().appName(appName).master("local").getOrCreate()
}

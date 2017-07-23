package com.zobot.ai.spark

import org.apache.spark.sql.SparkSession

class Context(appName: String = "Zobot") {
  val spark = SparkSession.builder().appName(appName).master("local").getOrCreate()
}

class ContextCassandra(appName: String = "ZobotCassandra", host: String = "localhost", port: String = "9042") {
  val sparkCassandra = SparkSession
    .builder()
    .appName(appName)
    .config("spark.cassandra.connection.host", host)
    .config("spark.cassandra.connection.port", port)
    .master("local[2]")
    .getOrCreate()
}

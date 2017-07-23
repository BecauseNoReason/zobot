package com.zobot.ai.spark

import com.datastax.driver.core.Session
import com.datastax.spark.connector.cql.CassandraConnector

object IO {
  def cassSession(context: ContextCassandra): Session = {
    val connector = CassandraConnector.apply(context.sparkCassandra.sparkContext)
    connector.openSession()
  }

  def cassCreateTable(cassSession: Session, keyspace: String, tableName: String, columns: Map[String, String]) = {
    val columnsString = s"${columns.head._1} ${columns.head._2} PRIMARY KEY${columns.tail.foldLeft(""){(s, p) => s"$s ${p._1} ${p._2}"}}"
    cassSession.execute(s"CREATE TABLE $keyspace.$tableName($columnsString)")
  }
}

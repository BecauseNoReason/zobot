package com.zobot.ai.spark

import org.specs2.Specification

class TestCassandraIO extends Specification {
  def is = s2"""
                Cassandra IO
                  can connect to local Cassandra instance $testCassandraConnection
                  can create new table $testCassandraCreateTable
      """

  val cass = IO.cassSession(new ContextCassandra(host = "172.17.0.2"))

  def testCassandraConnection = {
    cass.getState.must_==("Connected")
  }

  def testCassandraCreateTable = {
    IO.cassCreateTable(cass, "activity", "test", Map("col1" -> "text", "col2" -> "UUID"))
    cass.execute("SELECT text FROM schema_columnfamilies WHERE keyspace_name='activity'").must_==("table details")
  }
}

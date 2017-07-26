package com.zobot.ai.spark

import org.specs2.Specification

class TestCassandraIO extends Specification {
  def is = s2"""
                Cassandra IO
                  can connect to local Cassandra instance $testCassandraConnection
                  can create new table $testCassandraCreateTable
      """

  // val cass = IO.cassSession(new ContextCassandra(host = "172.17.0.2"))

  def testCassandraConnection = ???

  def testCassandraCreateTable = ???
}

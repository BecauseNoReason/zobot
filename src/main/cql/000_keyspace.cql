CREATE KEYSPACE activity
WITH replication = {'class': 'NetworkTopologyStrategy', 'eu-west': '3'}  AND durable_writes = true;

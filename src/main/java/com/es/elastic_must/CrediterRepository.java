package com.es.elastic_must;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrediterRepository extends Neo4jRepository<Crediter,Long> {
}

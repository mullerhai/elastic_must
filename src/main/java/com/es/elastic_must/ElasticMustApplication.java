package com.es.elastic_must;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableNeo4jRepositories
@EnableWebMvc
public class ElasticMustApplication {


    public  static  void main(String[] args) {

        SpringApplication.run(ElasticMustApplication.class, args);
//        crediterRepository.findAll().forEach(ele -> ele.getName());
    }


}

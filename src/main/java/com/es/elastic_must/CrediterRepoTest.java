package com.es.elastic_must;

import org.neo4j.driver.v1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@EnableAutoConfiguration
public class CrediterRepoTest {

    @Autowired
    public CrediterRepository crediterRepository;



    public  void  querynode(){

        String host= "bolt://192.168.199.102:";
        String port ="7687";
        String user ="neo4j";
        String pwd ="geotmt";

        Driver driver = GraphDatabase.driver(host+port, AuthTokens.basic(user,pwd));
        System.out.print(driver.toString());
        Session session = driver.session();

        StatementResult result = session.run(" match (n:crediter) return n.name limit 30");

        while (result.hasNext()){
            Record record =  result.next();
            System.out.println(record.toString());
        }
        session.close();
        driver.close();
//        crediterRepository.findAll().forEach(ele -> ele.getName());
    }
}

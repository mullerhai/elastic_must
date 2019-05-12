package com.es.elastic_must;

import org.neo4j.driver.v1.*;


import static org.neo4j.driver.v1.Values.parameters;

public class neocon {


    public static void main(String [] args){
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
//        session.run( "CREATE (a:Person {name: {name}, title: {title}})",
//                parameters( "name", "Arthur001", "title", "King001" ) );
//
//        StatementResult result = session.run( "MATCH (a:Person) WHERE a.name = {name} " +
//                        "RETURN a.name AS name, a.title AS title",
//                parameters( "name", "Arthur001" ) );


    }
}

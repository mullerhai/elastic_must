package com.es.elastic_must;


import org.neo4j.driver.v1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
public class NeoController {


    @Autowired
    public CrediterRepository crediterRepository;




    @RequestMapping(value="/hoo")
    public  void  querynode(){

//        String host= "bolt://192.168.199.102:";
//        String port ="7687";
//        String user ="neo4j";
//        String pwd ="geotmt";
//
//        Driver driver = GraphDatabase.driver(host+port, AuthTokens.basic(user,pwd));
//        System.out.print(driver.toString());
//        Session session = driver.session();
//
//        StatementResult result = session.run(" match (n:crediter) return n.name limit 30");
//
//        while (result.hasNext()){
//            Record record =  result.next();
//            System.out.println(record.toString());
//        }
//        session.close();
//        driver.close();
        Iterable<Crediter> listcr= crediterRepository.findAll();
        Iterator <Crediter> liz =listcr.iterator();
        while (liz.hasNext()){
            Crediter cre =liz.next();
            System.out.print(cre.getName());
        }
    }
}

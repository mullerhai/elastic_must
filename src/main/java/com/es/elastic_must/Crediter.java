package com.es.elastic_must;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.io.Serializable;

@NodeEntity
public class Crediter implements Serializable {

    @Id @GeneratedValue
    private  Long id;
    private  String name;
    private  String phone;
    private  String lend;
    private  String id_card;
    private  String dayz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLend() {
        return lend;
    }

    public void setLend(String lend) {
        this.lend = lend;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getDayz() {
        return dayz;
    }

    public void setDayz(String dayz) {
        this.dayz = dayz;
    }

    @Override
    public String toString() {
        return "Crediter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", lend='" + lend + '\'' +
                ", id_card='" + id_card + '\'' +
                ", dayz='" + dayz + '\'' +
                '}';
    }
}

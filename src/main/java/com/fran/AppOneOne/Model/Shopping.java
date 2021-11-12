package com.fran.AppOneOne.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shopping {
    @Id
    private int id;
    private String name;
    private String address;

    public Shopping(){
    }
    public Shopping (int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    public Shopping (String name, String address){
        this.name=name;
        this.address=address;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

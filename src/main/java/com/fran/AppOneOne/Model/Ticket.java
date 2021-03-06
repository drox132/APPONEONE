package com.fran.AppOneOne.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
    @Id
    private int id;
    private String name;
    private int price;

    public Ticket() {
    }

    public Ticket(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Ticket(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

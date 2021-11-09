package com.fran.AppOneOne.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Person {

    @Id
    private int id;
    private String name;
    private int age;
    @Column(name = "sonsnumber")
    private int sonsnumber;
    private String email;

}

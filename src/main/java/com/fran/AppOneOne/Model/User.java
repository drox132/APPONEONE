package com.fran.AppOneOne.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    private int id;
    private String userName;
    private String password;

}

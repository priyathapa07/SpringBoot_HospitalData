package com.mh.trektrekker.daphehmis.user.entity;

import com.mh.trektrekker.daphehmis.enums.UserType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//this should have the same name as in form so that we can map the value
     we use modelAttribute

@Data //lombok; used to reduce code writing boilerplate code such as getter/setter/constructor

@Entity // hibernate and entity ko relation, this entity tells hibernate to make table on the basis of below defined user)

public class User { //table sanga map vayuo so we need ID for creating primary key

    @Id //(unique identifier vayena vaney compile error)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;
    private String email;
    private String mobileNumber;
    private String address;
    private UserType userType;


}

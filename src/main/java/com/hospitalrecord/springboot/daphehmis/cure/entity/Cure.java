package com.mh.trektrekker.daphehmis.cure.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class Cure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private int patientId;
    private int careBy;
    private int exmaineBy;
    private String dianosisDescription;
}

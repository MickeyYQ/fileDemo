package com.example.pojo;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity(name = "test")
public class Fivefold {

    @Id
    @GeneratedValue
    private String filenamea;
    private String filenameb;
    private String filenamec;
    private String filenamed;
    private String filenamee;
    private String filenamef;
    private String filenameg;
    private String filenameh;



}

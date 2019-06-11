package com.example.pojo;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity(name = "test")
public class Filefold {

    @Id
    @GeneratedValue
    private int id;
    private String filenamea;
    private String filenameb;
    private String filenamec;
    private String filenamed;
    private String filenamee;
    private String filenamef;
    private String filenameg;
    private String filenameh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilenamea() {
        return filenamea;
    }

    public void setFilenamea(String filenamea) {
        this.filenamea = filenamea;
    }

    public String getFilenameb() {
        return filenameb;
    }

    public void setFilenameb(String filenameb) {
        this.filenameb = filenameb;
    }

    public String getFilenamec() {
        return filenamec;
    }

    public void setFilenamec(String filenamec) {
        this.filenamec = filenamec;
    }

    public String getFilenamed() {
        return filenamed;
    }

    public void setFilenamed(String filenamed) {
        this.filenamed = filenamed;
    }

    public String getFilenamee() {
        return filenamee;
    }

    public void setFilenamee(String filenamee) {
        this.filenamee = filenamee;
    }

    public String getFilenamef() {
        return filenamef;
    }

    public void setFilenamef(String filenamef) {
        this.filenamef = filenamef;
    }

    public String getFilenameg() {
        return filenameg;
    }

    public void setFilenameg(String filenameg) {
        this.filenameg = filenameg;
    }

    public String getFilenameh() {
        return filenameh;
    }

    public void setFilenameh(String filenameh) {
        this.filenameh = filenameh;
    }
}

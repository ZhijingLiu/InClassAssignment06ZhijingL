package com.example.jenniferliu.inclassassignment06_zhijingl;

import java.io.Serializable;

/**
 * Created by jenniferliu on 2018/3/23.
 */

public class Animal implements Serializable {
    private String name;
    private int legs;
    private String information;
    private boolean hasFur;

    public Animal(String name, int legs, boolean hasFur, String information){
        this.name = name;
        this.legs = legs;
        this.information = information;
        this.hasFur = hasFur;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLegs(int legs){
        this.legs = legs;
    }

    public int getLegs(){
        return legs;
    }

    public void setInformation(String information){
        this.information = information;
    }

    public String getInformation(){
        return information;
    }

    public void setHasFur(boolean hasFur){
        this.hasFur = hasFur;
    }

    public boolean isHasFur(){
        return hasFur;
    }

    @Override
    public String toString(){
        return "Animal Type/Name: " + name + "\nNumber of Legs: " + legs + "\nDoes it have Fur? " + hasFur + "\nAny additional information: " + information;
    }
}

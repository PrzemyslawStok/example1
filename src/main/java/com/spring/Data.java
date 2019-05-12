package com.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    @Id
    @GeneratedValue
    Integer id;

    private Double X;
    private Double Y;

    public void setX(Double x){
        X = x;
    }

    public void setY(Double y){
        Y = y;
    }

    public Double getX(){
        return X;
    }

    public Double getY(){
        return Y;
    }

}

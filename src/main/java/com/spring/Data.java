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

    private Double Humidity;
    private Double Temperature;

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

    public void setHumidity(Double humidity){
        Humidity = humidity;
    }

    public void setTemperature(Double temperature){
        Temperature = temperature;
    }

    public Double getHumidity(){
        return Humidity;
    }

    public Double getTemperature(){
        return Temperature;
    }

}

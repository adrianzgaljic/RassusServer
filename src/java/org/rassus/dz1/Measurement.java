/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rassus.dz1;

/**
 *
 * @author adrianzgaljic
 */

public class Measurement {
    
    public String temperature;
    public String pressure;
    public String humidity;
    public String co;
    public String no2;
    public String so2;
    
    public Measurement(String temperature,String pressure,String humidity,String co,String no2,String so2){
        
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.co = co;
        this.no2 = no2;
        this.so2 = so2;
    }
    
    public String getTemperature(){
        return temperature;
    }
    
    public String getPressure(){
        return pressure;
    }
    
    public String getHumidity(){
        return humidity;
    }
    
    public String getCo(){
        return co;
    }
    
    public String getN2(){
        return no2;
    }
    
    public String getSo2(){
        return so2;
    }
    
    @Override
    public String toString(){
        return temperature + ", "
                + pressure + ", "
                + humidity + ", "
                + co + ", "
                + no2 + ", "
                + so2;
    }
    
}

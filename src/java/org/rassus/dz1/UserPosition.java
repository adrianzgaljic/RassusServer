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
public class UserPosition {

    private double latitude;
    private double longitude;

    public UserPosition(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public UserPosition(){};

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }
    
    @Override
    public String toString(){
        return Double.toString(latitude)+" "+Double.toString(longitude);
    }
    
    


}
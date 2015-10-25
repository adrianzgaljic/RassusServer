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
public class UserAddress {
    
    private String IPaddress = "raaaaaaa";
    private int port;
    
    public UserAddress(String IPaddress, int port){
        this.IPaddress = IPaddress;
        this.port = port;
    }
    
    public UserAddress(){
        
    }
            
    
    public String getIPaddress(){
        return this.IPaddress;
    }
    
    public int getPort(){
        return this.port;
    }
    public void setPort(int port){
        this.port = port;
    }
    
    @Override
    public String toString(){
       return this.IPaddress+" "+this.port;
        
    }
    
}

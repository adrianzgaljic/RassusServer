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
public class User {
    
    private String username;
    private UserPosition position;
    private String IPaddress;
    private int port;
    

    public User(String username, UserPosition position, String IPaddress, int port){
        this.username = username;
        this.position = position;
        this.IPaddress = IPaddress;
        this.port = port;
    }

   

    public String getUsername(){
        return username;
    }

    public UserPosition getPosition(){
        return position;
    }
    
    public String getIPaddress(){
        return IPaddress;
    }
    
    public int getPort(){
        return port;
    }


}

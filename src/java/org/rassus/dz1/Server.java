/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rassus.dz1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author adrianzgaljic
 */
@WebService(serviceName = "Server")
public class Server {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchNeighbour")
    public UserAddress searchNeighbour(@WebParam(name = "username") String username) {
        //TODO write your implementation code here:
        UserAddress ua =new UserAddress();
        ua.setPort(12);
        return ua;
    }
}

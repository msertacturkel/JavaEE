/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "HelloWS")
public class HelloWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "topla")
    public double topla(@WebParam(name = "sayi1") double sayi1, @WebParam(name = "sayi2") double sayi2) {
        //TODO write your implementation code here:
        return sayi1+sayi2;
    }
    
    
}

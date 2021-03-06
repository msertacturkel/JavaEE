
package org.csystem.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWS", targetNamespace = "http://ws.csystem.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWS {


    /**
     * 
     * @param sayi2
     * @param sayi1
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "topla", targetNamespace = "http://ws.csystem.org/", className = "org.csystem.ws.Topla")
    @ResponseWrapper(localName = "toplaResponse", targetNamespace = "http://ws.csystem.org/", className = "org.csystem.ws.ToplaResponse")
    @Action(input = "http://ws.csystem.org/HelloWS/toplaRequest", output = "http://ws.csystem.org/HelloWS/toplaResponse")
    public double topla(
        @WebParam(name = "sayi1", targetNamespace = "")
        double sayi1,
        @WebParam(name = "sayi2", targetNamespace = "")
        double sayi2);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws.csystem.org/", className = "org.csystem.ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws.csystem.org/", className = "org.csystem.ws.HelloResponse")
    @Action(input = "http://ws.csystem.org/HelloWS/helloRequest", output = "http://ws.csystem.org/HelloWS/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}

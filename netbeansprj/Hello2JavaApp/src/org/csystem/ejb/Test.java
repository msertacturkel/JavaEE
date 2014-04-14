package org.csystem.ejb;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.csystem.ejb.HelloSes2Remote;

/**
 *
 * @author Administrator
 */
public class Test {
    HelloSes2Remote helloSes2 = lookupHelloSes2Remote();

    public Test() {
        System.out.println(helloSes2.sayHello("Ugur"));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Test();
    }

    private  HelloSes2Remote lookupHelloSes2Remote() {
        try {
            Context c = new InitialContext();
            return (HelloSes2Remote) c.lookup("java:global/Hello2/Hello2-ejb/HelloSes2!org.csystem.ejb.HelloSes2Remote");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Administrator
 */
@Stateless
public class HelloSes2 implements HelloSes2Remote {

        public String sayHello(String ad) {
        return "merhaba "+ad;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}

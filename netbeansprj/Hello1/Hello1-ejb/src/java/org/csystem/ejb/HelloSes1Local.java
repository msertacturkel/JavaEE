/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.ejb;

import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface HelloSes1Local {

    String sayHello(String ad);
    
}

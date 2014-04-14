/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.ejb;

import javax.ejb.Remote;

/**
 *
 * @author Administrator
 */
@Remote
public interface Hello3SesRemote {

    double topla(double sayi1, double sayi2);
}

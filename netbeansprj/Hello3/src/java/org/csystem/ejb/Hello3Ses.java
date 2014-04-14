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
public class Hello3Ses implements Hello3SesRemote {

    @Override
    public double topla(double sayi1, double sayi2) {
        return sayi1+sayi2;
    }


}

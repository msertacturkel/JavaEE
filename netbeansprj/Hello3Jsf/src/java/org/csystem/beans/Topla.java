/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.csystem.ejb.Hello3SesRemote;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class Topla {

    @EJB
    private Hello3SesRemote hello3Ses;
    private double sayi1, sayi2;
    private double sonuc;

    /**
     * @return the sayi1
     */
    public double getSayi1() {
        return sayi1;
    }

    /**
     * @param sayi1 the sayi1 to set
     */
    public void setSayi1(double sayi1) {
        this.sayi1 = sayi1;
    }

    /**
     * @return the sayi2
     */
    public double getSayi2() {
        return sayi2;
    }

    /**
     * @param sayi2 the sayi2 to set
     */
    public void setSayi2(double sayi2) {
        this.sayi2 = sayi2;
    }

    /**
     * @return the sonuc
     */
    public double getSonuc() {
        return hello3Ses.topla(sayi1, sayi2);
    }

    /**
     * @param sonuc the sonuc to set
     */
    public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }

    public String git() {
        return null;
    }
}

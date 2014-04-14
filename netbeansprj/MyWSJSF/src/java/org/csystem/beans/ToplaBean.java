/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.csystem.ws.HelloWS;


/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class ToplaBean {

    private double sayi1, sayi2;
    private double sonuc;

    public ToplaBean() {
    }

    private double topla(double sayi1, double sayi2) {
        org.csystem.ws.HelloWS_Service service = new org.csystem.ws.HelloWS_Service();
        HelloWS port = service.getHelloWSPort();
        double sonuc = port.topla(sayi1, sayi2);
        return sonuc;
    }

    public String toplaAction() {
        sonuc = topla(sayi1, sayi2);
        return "son";
    }

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
        return sonuc;
    }

    /**
     * @param sonuc the sonuc to set
     */
    public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }
}

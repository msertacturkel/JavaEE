/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.csystem.ejb.HelloSes2Remote;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class Hello2Bean {
    @EJB
    private HelloSes2Remote helloSes2;

   private String ad;
   private String mesaj;
   
    public Hello2Bean() {
    }

    public String gitAction() {
        mesaj=helloSes2.sayHello(ad);//ejb cagriliyor
        return "son";
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the mesaj
     */
    public String getMesaj() {
        return mesaj;
    }

    /**
     * @param mesaj the mesaj to set
     */
    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
}


package org.csystem.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for topla complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="topla">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sayi1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sayi2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "topla", propOrder = {
    "sayi1",
    "sayi2"
})
public class Topla {

    protected double sayi1;
    protected double sayi2;

    /**
     * Gets the value of the sayi1 property.
     * 
     */
    public double getSayi1() {
        return sayi1;
    }

    /**
     * Sets the value of the sayi1 property.
     * 
     */
    public void setSayi1(double value) {
        this.sayi1 = value;
    }

    /**
     * Gets the value of the sayi2 property.
     * 
     */
    public double getSayi2() {
        return sayi2;
    }

    /**
     * Sets the value of the sayi2 property.
     * 
     */
    public void setSayi2(double value) {
        this.sayi2 = value;
    }

}

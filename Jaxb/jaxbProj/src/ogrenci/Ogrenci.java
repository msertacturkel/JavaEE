//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.11 at 12:56:54 PM EET 
//


package ogrenci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ad"/>
 *         &lt;element ref="{}soyad"/>
 *         &lt;element ref="{}dogTar"/>
 *         &lt;element ref="{}dogYer"/>
 *         &lt;element ref="{}veliAd"/>
 *         &lt;element ref="{}sinif"/>
 *       &lt;/sequence>
 *       &lt;attribute name="no" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ad",
    "soyad",
    "dogTar",
    "dogYer",
    "veliAd",
    "sinif"
})
@XmlRootElement(name = "ogrenci")
public class Ogrenci {

    @XmlElement(required = true)
    protected String ad;
    @XmlElement(required = true)
    protected String soyad;
    @XmlElement(required = true)
    protected String dogTar;
    @XmlElement(required = true)
    protected String dogYer;
    @XmlElement(required = true)
    protected String veliAd;
    @XmlElement(required = true)
    protected String sinif;
    @XmlAttribute(name = "no", required = true)
    protected byte no;

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyad(String value) {
        this.soyad = value;
    }

    /**
     * Gets the value of the dogTar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogTar() {
        return dogTar;
    }

    /**
     * Sets the value of the dogTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogTar(String value) {
        this.dogTar = value;
    }

    /**
     * Gets the value of the dogYer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogYer() {
        return dogYer;
    }

    /**
     * Sets the value of the dogYer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogYer(String value) {
        this.dogYer = value;
    }

    /**
     * Gets the value of the veliAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeliAd() {
        return veliAd;
    }

    /**
     * Sets the value of the veliAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeliAd(String value) {
        this.veliAd = value;
    }

    /**
     * Gets the value of the sinif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinif() {
        return sinif;
    }

    /**
     * Sets the value of the sinif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinif(String value) {
        this.sinif = value;
    }

    /**
     * Gets the value of the no property.
     * 
     */
    public byte getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     */
    public void setNo(byte value) {
        this.no = value;
    }

}
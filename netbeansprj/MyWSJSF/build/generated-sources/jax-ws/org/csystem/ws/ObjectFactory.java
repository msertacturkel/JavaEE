
package org.csystem.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.csystem.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Topla_QNAME = new QName("http://ws.csystem.org/", "topla");
    private final static QName _ToplaResponse_QNAME = new QName("http://ws.csystem.org/", "toplaResponse");
    private final static QName _Hello_QNAME = new QName("http://ws.csystem.org/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.csystem.org/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.csystem.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ToplaResponse }
     * 
     */
    public ToplaResponse createToplaResponse() {
        return new ToplaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Topla }
     * 
     */
    public Topla createTopla() {
        return new Topla();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Topla }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.csystem.org/", name = "topla")
    public JAXBElement<Topla> createTopla(Topla value) {
        return new JAXBElement<Topla>(_Topla_QNAME, Topla.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToplaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.csystem.org/", name = "toplaResponse")
    public JAXBElement<ToplaResponse> createToplaResponse(ToplaResponse value) {
        return new JAXBElement<ToplaResponse>(_ToplaResponse_QNAME, ToplaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.csystem.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.csystem.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}

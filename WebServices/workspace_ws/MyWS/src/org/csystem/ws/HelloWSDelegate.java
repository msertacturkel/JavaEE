package org.csystem.ws;

@javax.jws.WebService(targetNamespace = "http://ws.csystem.org/", serviceName = "HelloWSService", portName = "HelloWSPort", wsdlLocation = "WEB-INF/wsdl/HelloWSService.wsdl")
public class HelloWSDelegate {

	org.csystem.ws.HelloWS helloWS = new org.csystem.ws.HelloWS();

	public String sayHello(String mesaj) {
		return helloWS.sayHello(mesaj);
	}

}
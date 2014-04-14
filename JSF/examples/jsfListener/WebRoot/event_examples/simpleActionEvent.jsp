<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
  <html>
    <head>
      <title>Simple Action Event Example</title>
    </head>
    <body>
      <h:form>       
        <p>
          <h:commandButton value="Click Me!"
                           action="#{simpleactionevent_backing.simpleActionMethod}"
                           immediate="true"/>
        </p>
        <p>
          Observe the standard out after clicking.
        </p>
        <p>
          Toggle the value of the <strong>immediate</strong> attribute of the 
          button from <strong>true</strong> to <strong>false</strong> and observe 
          the effect from the output of the PhaseListener.
        </p>
      </h:form>
    </body>
  </html>
</f:view>

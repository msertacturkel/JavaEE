<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
  <html>
    <head>
      <title>MyActionListener Custom ActionListener Example</title>
    </head>
    <body>
      <h:form>       
        <p>
          <h:commandButton value="Click Me!" immediate="false">
            <f:actionListener type="com.jsfcompref.MyActionListener"/>
          </h:commandButton>
        </p>
        <p>
          Toggle the value of the <strong>immediate</strong> attribute of the 
          button from <strong>false</strong> to <strong>true</strong> and observe 
          the effect from the output of the PhaseListener.
        </p>
      </h:form>
    </body>
  </html>
</f:view>
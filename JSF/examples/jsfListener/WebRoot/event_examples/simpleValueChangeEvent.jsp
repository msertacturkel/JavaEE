<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
  <html>
    <head>
      <title>Simple ValueChangeListener Example</title>
    </head>
    <body>
      <h:form>       
        <p>
          <h:inputText valueChangeListener="#{simplevaluechangeevent_backing.simpleValueChangedListener}"
                       immediate="true" value="foo" />
          <h:commandButton value="Click Me!"/>
        </p>
        <p>
          Enter or change a value in the input field and observe the standard 
          out after clicking.
        </p>
        <p>
          Toggle the value of the <strong>immediate</strong> attribute of the 
          input field from <strong>true</strong> to <strong>false</strong> and observe 
          the effect from the output of the PhaseListener.
        </p>
      </h:form>
    </body>
  </html>
</f:view>

<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
  <html>
    <head>
      <title>MyValueChangeListener Example</title>
    </head>
    <body><h:form>
        <p>
          <h:inputText value="foo">
            <f:valueChangeListener type="com.jsfcompref.MyValueChangeListener"/>
          </h:inputText>
           
          <h:commandButton value="Click me!"/>
        </p>
        <p>
          Change the value of the input field, click on the button and observe
          the standard out after clicking. 
          <br/>
           Notice the valueChangeListener is not triggered when the value isn't
          changed.
        </p>
        <hr/>
        <p>Input field with autoSubmit JavaScript. Change the text and hit Tab
        to trigger PostBack. (Observe standard out again.)</p>
        <p>
          <h:inputText value="foo" onchange="this.form.submit();">
            <f:valueChangeListener type="com.jsfcompref.MyValueChangeListener"/>
          </h:inputText>
        </p>
      </h:form></body>
  </html>
</f:view>
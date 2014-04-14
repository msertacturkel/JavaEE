<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
  <html>
    <head>
      <title>Autozip Form Example</title>
    </head>
    <body>
    <h:form>
        <h2>Address Form</h2>
        <p>
          <h:panelGrid columns="3">
            <h:outputLabel value="Name:"/>
            <h:inputText id="inputname" required="true"  
                binding="#{autozip_backing.inputName}" 
                value="#{UserBean.name}"/>
            <h:message for="inputname"/>
            <h:outputLabel value="Zip Code:"/>
            <h:inputText id="inputzip"  binding="#{autozip_backing.inputZip}"
                         valueChangeListener="#{autozip_backing.autoZipListener}"
                         onchange="submit()" immediate="true"
                         value="#{UserBean.zip}" />
            <h:message for="inputzip"/>
            <h:outputLabel value="City:"/>
            <h:inputText id="inputcity" binding="#{autozip_backing.inputCity}"
                         immediate="true" value="#{UserBean.city}"/>
            <h:message for="inputcity"/>
            <h:outputLabel value="State:"/>
            <h:inputText id="inputstate" binding="#{autozip_backing.inputState}"
                         immediate="true" value="#{UserBean.state}"/>
            <h:message for="inputstate"/>
            <h:outputLabel value="Add more Info?"/>
            <h:selectBooleanCheckbox binding="#{autozip_backing.renderInfoBox}"
                                     immediate="true"
                                     valueChangeListener="#{autozip_backing.toggleMoreInfo}"
                                     onclick="submit();"
                                     value="#{autozip_backing.infoRendered}"/>
            <f:verbatim>&nbsp;</f:verbatim>
            <h:outputLabel value="More Info"
                           rendered="#{autozip_backing.infoRendered}"/>
            <h:inputTextarea id="moreinfo" binding="#{autozip_backing.moreInfo}"
                             rendered="#{autozip_backing.infoRendered}"/>
            <h:message for="moreinfo"
                       rendered="#{autozip_backing.infoRendered}"/>
            <h:commandButton value="Submit"/>
          </h:panelGrid>
        </p>
      </h:form></body>
  </html>
</f:view>
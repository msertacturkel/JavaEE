<%@ page contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<f:view>
  <html>
    <head>
      <title>Dependent List Example</title>
    </head>
    <body>
      <h:form>
        <p>
          Country:<h:selectOneMenu onchange="submit();"
                                   binding="#{Deplist_backing.inputCountry}"
                                   immediate="false">
            <f:selectItems value="#{CountriesMap}"/>
          </h:selectOneMenu>
        </p>
        <p>
          City:<h:selectOneMenu binding="#{Deplist_backing.inputCity}"
                                immediate="false">
            <f:selectItems value="#{Deplist_backing.cities}"/>
          </h:selectOneMenu>
        </p>
      </h:form>
    </body>
  </html>
</f:view>
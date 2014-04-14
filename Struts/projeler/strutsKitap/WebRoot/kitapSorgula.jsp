<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for KitapSorgulaForm form</title>
	</head>
	<body>
		<html:form action="/kitapSorgula">
			yazar : <html:text property="yazar"/><html:errors property="yazar"/><br/>
			kitapAd : <html:text property="kitapAd"/><html:errors property="kitapAd"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


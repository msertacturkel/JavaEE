<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for DenemeForm form</title>
	</head>
	<body>
		<html:form action="/deneme">
			ad : <html:text property="ad"/><html:errors property="ad"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


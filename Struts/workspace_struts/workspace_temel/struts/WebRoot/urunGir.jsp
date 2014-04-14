<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for UrunGirForm form</title>
	</head>
	<body>
		<html:form action="/urunGir">
			adet : <html:text property="adet"/><html:errors property="adet"/><br/>
			ad : <html:text property="ad"/><html:errors property="ad"/><br/>
			kod : <html:text property="kod"/><html:errors property="kod"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


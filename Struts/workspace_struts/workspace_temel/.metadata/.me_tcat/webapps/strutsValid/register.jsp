<%@ page language="java" pageEncoding="ISO-8859-9"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for RegisterForm form</title>
	</head>
	<body>
		<html:form action="/register">
		<html:errors property="hata"/><br/>
			password : <html:password property="password"/><html:errors property="password"/><br/>
			user : <html:text property="user"/><html:errors property="user"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


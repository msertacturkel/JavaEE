<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for KayitForm form</title>
	</head>
	<body>
		<html:form action="/kayit">
			<bean:message key="name.label"/> : <html:text property="ad"/><html:errors property="ad"/><br/>
			<bean:message key="surname.label"/> : <html:text property="soyad"/><html:errors property="soyad"/><br/>
			<html:submit><bean:message key="message.submit"/> </html:submit><html:cancel/>
		</html:form>
	</body>
</html>


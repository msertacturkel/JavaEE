<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for PersonelForm form</title>
	</head>
	<body>
		<html:form action="/personel">
			<bean:message key="personel.email"/> : <html:text property="email"/><html:errors property="email"/><br/>
			<bean:message key="personel.ad"/>: <html:text property="ad"/><html:errors property="ad"/><br/>
			<bean:message key="personel.soyad"/>: <html:text property="soyad"/><html:errors property="soyad"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


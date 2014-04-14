<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for KitapGirisForm form</title>
	</head>
	<body>
		<html:form action="/kitapGiris">
			yazar : <html:text property="yazar"/><html:errors property="yazar"/><br/>
			fiyat : <html:text property="fiyat"/><html:errors property="fiyat"/><br/>
			kitapAdi : <html:text property="kitapAdi"/><html:errors property="kitapAdi"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for UrunEkleForm form</title>
	</head>
	<body>
		<html:form action="/urunEkle">
			fiyat : <html:text property="fiyat"/><html:errors property="fiyat"/><br/>
			ad : <html:text property="ad"/><html:errors property="ad"/><br/>
			kategori : <html:select property="kategori"/><html:errors property="kategori"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


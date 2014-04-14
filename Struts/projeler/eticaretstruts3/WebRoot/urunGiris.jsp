<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for UrunGirisForm form</title>
	</head>
	<body>
		<html:form action="/urunGiris">
			fiyat : <html:text property="fiyat"/><html:errors property="fiyat"/><br/>
			urunKod : <html:text property="urunKod"/><html:errors property="urunKod"/><br/>
			urunAd : <html:text property="urunAd"/><html:errors property="urunAd"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


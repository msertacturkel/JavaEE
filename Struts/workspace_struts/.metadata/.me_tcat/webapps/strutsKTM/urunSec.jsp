<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
 
<html> 
	<head>
		<title>JSP for UrunSecForm form</title>
	</head>
	<body>
	buradayim
		<html:form action="/urunSec">
		
		<logic:iterate id="product" name="products">
			<bean:write name="product" property="productname"/>
			</logic:iterate>
			productName : <html:select property="productName">
			
			
			</html:select>
			
			<html:errors property="productName"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>


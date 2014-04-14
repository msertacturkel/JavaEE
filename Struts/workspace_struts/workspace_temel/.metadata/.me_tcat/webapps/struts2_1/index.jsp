<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>

<body>
	<s:form action="hello">
		<s:textfield name="ad" label="Ad" />
		<s:textfield name="soyad" label="Soyad" />
		<s:textfield name="yas" label="Yas" />		
		<s:submit label="gonder" />
	</s:form>

</body>
</html>

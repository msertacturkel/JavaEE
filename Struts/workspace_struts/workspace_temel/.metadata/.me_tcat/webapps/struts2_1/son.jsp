<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>

</head>

<body>
	<s:if test="yas>30">
Sen hala yasiyor musun?
</s:if>
	<s:else>
	Merhaba
	<s:property value="ad" />
		<s:property value="soyad" />
	</s:else>

</body>

</html>

<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSF 'son2.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<f:view>
		<h:outputText value="#{sehirlerBean.kodlar[0] }"
			rendered="#{sehirlerBean.kodlar[0] ne null}" />
		<br>
		<h:outputText value="#{sehirlerBean.kodlar[1] }"
			rendered="#{sehirlerBean.kodlar[1] ne null}" />
		<br>
		<h:outputText value="#{sehirlerBean.kodlar[2] }"
			rendered="#{sehirlerBean.kodlar[2] ne null}" />

	</f:view>
</body>
</html>
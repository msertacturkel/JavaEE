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

<title>My JSF 'ustCategoriEkle.jsp' starting page</title>

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
		<h:form>
			<h:panelGrid columns="3">
				<h:outputLabel value="ustCategoryName" />
				<h:inputText id="ustCategoryName"
					value="#{ustCategoryBean.ustCategoryName}" />
				<h:message for="ustCategoryName" />
				<h:outputLabel value="description" />
				<h:inputText id="description" value="#{ustCategoryBean.description}" />
				<h:message for="description" />
				<h:commandButton value="Kaydet" action="#{ustCategoryBean.kayitAction}" />
			</h:panelGrid>
		</h:form>

	</f:view>
</body>
</html>
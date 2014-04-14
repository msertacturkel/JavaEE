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

<title>My JSF 'urunEkle.jsp' starting page</title>

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
				<h:outputLabel value="urunAd" />
				<h:inputText id="urunAd" value="#{urunBean.urunAd}" />
				<h:message for="urunAd" />
				<h:outputLabel value="kisaAciklama" />
				<h:inputText id="kisaAciklama" value="#{urunBean.kisaAciklama}" />
				<h:message for="kisaAciklama" />
				<h:outputLabel value="uzunAciklama" />
				<h:inputTextarea rows="10" id="uzunAciklama" value="#{urunBean.uzunAciklama}" />
				<h:message for="uzunAciklama" />
				<h:outputLabel value="imageUrl" />
				<h:inputText id="imageUrl" value="#{urunBean.imageUrl}" />
				<h:message for="imageUrl" />
				<h:outputLabel value="urunKodu" />
				<h:inputText id="urunKodu" value="#{urunBean.urunKodu}" />
				<h:message for="urunKodu" />
				<h:commandButton value="Git" action="#{urunBean.kayitAction}" />
			</h:panelGrid>
			<h:selectOneMenu value="#{categoriesBean.categoriID}" style="position: absolute; left:300; top: 53">
				  <f:selectItems value="#{categoriesBean.categoriItems }"/>
				</h:selectOneMenu>
		</h:form>

	</f:view>
</body>
</html>
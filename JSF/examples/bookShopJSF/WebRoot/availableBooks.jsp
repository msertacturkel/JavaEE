<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<%
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>

<html>
<head>
<base href="<%=basePath%>">

<title>Welcome to Book Shop - List of Books</title>
<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<f:view>
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	  <tr>
	    <td height="40px"><div align="center" class="welcome">
			Welcome, <h:outputText value="#{userBean.username}"></h:outputText><br><br>These are all books at Book Shop...
		</div></td>
	  </tr>
	  <tr><td valign="top"><div align="center">
	<h:form id="bookList">
		<h:dataTable id="books" value="#{bookListBean.books}" var="book" border="0" rowClasses="evenColumn,oddColumn" cellpadding="2" cellspacing="1">
			<h:column headerClass="header">
				<f:facet name="header">
					<h:outputText value="Author" />
				</f:facet>
				<h:outputText styleClass="table" value="#{book.author}" />
			</h:column>
			<h:column headerClass="header">
				<f:facet name="header">
					<h:outputText value="Title" />
				</f:facet>
				<h:outputText styleClass="table" value="#{book.title}" />
			</h:column>
			<h:column headerClass="header">
				<f:facet name="header">
					<h:outputText value="Borrow" />
				</f:facet>
				<h:commandButton styleClass="button" id="borrow" action="info" actionListener="#{bookBean.oduncAl}" value="Borrow" disabled="#{!book.available}">
					<f:param id="borrowId" value="#{book.id}" />
					<f:param id="user" value="#{userBean.username}" />
				</h:commandButton>
			</h:column>
		</h:dataTable>
	</h:form>
	</div></td></tr></table>
</f:view>
</body>
</html>
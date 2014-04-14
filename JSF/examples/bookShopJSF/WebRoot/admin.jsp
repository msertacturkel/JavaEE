<%@ page language="java"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>

<html>
<head>
<base href="<%=basePath%>">

<title>Book Shop - Admin - List of Books</title>
<link rel="stylesheet" href="style.css" type="text/css">
</head>

<body>
<f:view>
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	  <tr>
	    <td height="40px"><div align="center" class="welcome">
			Welcome, Admin<br><br>These are all books at Book Shop...
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
					<h:outputText value="Available" />
				</f:facet>
				<h:outputText styleClass="table" value="#{book.owner}" />
			</h:column>
			<h:column headerClass="header">
				<f:facet name="header">
					<h:outputText value="Edit" />
				</f:facet>
				<h:commandLink id="Edit" action="editBook"
					actionListener="#{bookBean.selectBook}">
					<h:outputText value="Edit" />
					<f:param id="editId" name="id" value="#{book.id}" />
				</h:commandLink>
			</h:column>
			<h:column headerClass="header">
				<f:facet name="header">
					<h:outputText value="Delete" />
				</f:facet>
				<h:commandLink id="Delete" action="listBooks"
					actionListener="#{bookBean.deleteBook}">
					<h:outputText value="Delete" />
					<f:param id="deleteId" name="id" value="#{book.id}" />
				</h:commandLink>
			</h:column>
		</h:dataTable>

		<h:commandLink id="Add" action="editBook"
			actionListener="#{bookBean.initBook}">
			<h:outputText value="Add a book" />
		</h:commandLink>
	</h:form>
	</div></td></tr></table>
</f:view>
</body>
</html>

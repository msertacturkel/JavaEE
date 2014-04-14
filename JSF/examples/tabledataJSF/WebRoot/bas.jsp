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
		<style type="text/css">
.orders {
	border: thin solid black;
}

.ordersHeader {
	text-align: center;
	font-style: italic;
	color: Snow;
	background: Teal;
}

.oddColumn {
	height: 25px;
	text-align: center;
	background: red;
}

.evenColumn {
	text-align: center;
	background: PowderBlue;
}
</style>
		<base href="<%=basePath%>">

		<title>My JSF 'bas.jsp' starting page</title>

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
				<h:dataTable border="1" value="#{tableData.names}" var="name"
					styleClass="orders" headerClass="ordersHeader"
					columnClasses="oddColumn,evenColumn">

					<h:column>
						<h:outputText value="#{name.first} " />
					</h:column>
					<h:column>
						<h:outputText value="#{name.last}" />
					</h:column>
				</h:dataTable>
			</h:form>

		</f:view>
	</body>
</html>
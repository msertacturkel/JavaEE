<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Received Information</title>
</head>
<body>
<f:view>
	<h:form>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	  <tr>
	    <td>&nbsp;</td>
	  </tr>
	  <tr>
	    <td>&nbsp;</td>
	  </tr>
	  <tr>
	    <td><div align="center" style="font-family:Georgia; font-size:16px;">
      		<p>Congratulations...</p>
			<p>You successfully took on loan the book that named <span style="color:#C00"><b><h:outputText value="#{bookBean.book.title}" /></b></span> :)</p>
	    </div></td>
	  </tr>
	  <tr>
	    <td height="40" align="center"><h:commandButton value="Back to Home" action="back"></h:commandButton></td>
	  </tr>
	</table>
	</h:form>
</f:view>
</body>
</html>
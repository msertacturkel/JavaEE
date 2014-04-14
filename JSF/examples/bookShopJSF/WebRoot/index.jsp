<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
	<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Shop - Login</title>
</head>
<f:view>

<body>
	<h:form>
	<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
	  <tr>
	    <td><div align="center">
	      <table width="571" border="0" cellspacing="0" cellpadding="0">
	        <tr>
	          <td rowspan="3"><img src="images/Untitled-1_03.jpg" width="68" height="408"></td>
	          <td><img src="images/Untitled-1_04.jpg" width="160" height="174"></td>
	          <td rowspan="3"><img src="images/Untitled-1_05.jpg" width="343" height="408"></td>
	        </tr>
	        <tr>
	          <td height="164" valign="top" bgcolor="#E9E9E9"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	            <tr>
	              <td height="30"><h:inputText value="#{userBean.username}"></h:inputText></td>
	            </tr>
	            <tr>
	              <td height="30"><h:commandButton value="Login" action="login"></h:commandButton></td>
	            </tr>
	          </table></td>
	          </tr>
	        <tr>
	          <td height="70"><img src="images/Untitled-1_08.jpg" width="160" height="70"></td>
	          </tr>
	      </table>
	    </div></td>
	  </tr>
	</table>
	</h:form>
</body>
</f:view>
</html>
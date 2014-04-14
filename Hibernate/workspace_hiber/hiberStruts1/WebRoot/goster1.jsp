<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<html>


<body>
	<s:form>
		<table border="1">
		<s:iterator  var="customerName" value="custNames">
		<tr><td><s:property value="customerName"/></td></tr>	
		</s:iterator>
		</table>
	</s:form>
</body>
</html>

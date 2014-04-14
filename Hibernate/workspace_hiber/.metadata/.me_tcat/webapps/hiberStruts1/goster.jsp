<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>


<html>


<body>
	<s:form>

		<s:iterator var="customerName" value="custNames">
			<s:property value="customerName" /><br>
		</s:iterator>
		</table>
	</s:form>
</body>
</html>

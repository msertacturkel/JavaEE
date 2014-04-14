<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script type="text/javascript">
	function yaz(mesaj) {
		alert(mesaj);
	}
</script>

</head>
<%
	String str = "deneme jsp";
%>
<body>
	<input type="button" value=" bas " onclick="yaz('<%=str%>')" />
</body>
</html>

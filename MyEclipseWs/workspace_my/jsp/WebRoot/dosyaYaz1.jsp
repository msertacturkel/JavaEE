
<%@ page language="java" import="java.util.*,java.io.*" pageEncoding="ISO-8859-1"%>
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

<title>My JSP 'dosyaYaz.jsp' starting page</title>

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
	<%-- <%=request.getRealPath("/")%>--%>
	<%
		File f = new File(request.getRealPath("/"), "yaz.txt");
		FileOutputStream fo = new FileOutputStream(f);
		PrintStream pr = new PrintStream(fo);
		pr.println("deneme");
		fo.close();
	%>
	<h2>dosya yazildi..</h2>
	<!--<%=System.getProperty("user.dir")%>  -->
</body>
</html>

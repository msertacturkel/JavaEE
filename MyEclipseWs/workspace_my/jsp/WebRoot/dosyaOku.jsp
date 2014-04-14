
<%@ page language="java" import="java.util.*,java.io.*"
	pageEncoding="ISO-8859-1"%>
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

<title>My JSP 'dosyaOku.jsp' starting page</title>

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
<table border="1">
	<%
		File f = new File(request.getRealPath("/"), "sayi.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){
		  String str = sc.nextLine();
				Scanner sc1 = new Scanner(str);
				out.print("<tr>");
				while (sc1.hasNextInt()) {
					int sayi = sc1.nextInt();
					out.print("<td>"+sayi*sayi+"</td>");
				}
				out.println("</tr>");
		}
	%>
	</table>
</body>
</html>

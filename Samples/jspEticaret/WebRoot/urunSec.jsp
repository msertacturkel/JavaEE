<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>My JSP 'urunSec.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<jsp:useBean id="mybean" class="mypack.Urunler" />
<body>
	<form action="servlet/SepetDoldurServlet"> 
		dUrun Listesi 
		<table border="1">
			<c:forEach var="urun" items="${mybean.urunler}">
			<input type="hidden" name="urunKod" value="${urun.kod}"/>
				<tr>				
					<td>${urun.ad}</td>
					<td>${urun.fiyat}</td>						
					<td><a href="servlet/SepetDoldurServlet?kod=${urun.kod}" >urun sec</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
	Sectiginiz Urunler<br>
	<table border="1">
	<c:forEach var="urun" items="${sepet.urunler}">
        <tr><td> ${urun.ad}</td><td><a href="servlet/UrunSilServlet?kod=${urun.kod}" >sil</a></tr>
	</c:forEach>
	</table>
	
	
</body>
</html>

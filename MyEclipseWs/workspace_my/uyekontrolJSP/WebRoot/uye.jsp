<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'uye.jsp' starting page</title>
    
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

    <%  String id1=session.getId(); //su andaki sayfanin session id'si
        String id2=(String) session.getAttribute("id");//onceki sayfanin session id'si
        if( (id2==null)||(!id1.equals(id2))){
        session.setAttribute("bilgi", "giris hakkiniz yok");
        response.sendRedirect("uyedegil.jsp");
        }
    %>
    Merhaba uyemiz
  </body>
</html>

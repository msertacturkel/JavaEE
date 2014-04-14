<%-- 
    Document   : index
    Created on : Mar 2, 2014, 11:41:37 AM
    Author     : Administrator
--%>

<%@page import="org.csystem.ws.HelloWS"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%-- start web service invocation --%><hr/>
        <%
            org.csystem.ws.HelloWS_Service service = new org.csystem.ws.HelloWS_Service();
            HelloWS port = service.getHelloWSPort();
            double sonuc = port.topla(3, 5);
            out.println(sonuc);
        %>
        <%-- end web service invocation --%><hr/>
    </body>
</html>

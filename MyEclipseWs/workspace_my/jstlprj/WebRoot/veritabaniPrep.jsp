<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   

  </head>
  
  <body> 
    <sql:setDataSource driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/myeclipse" 
    user="classiccars" password="classiccars"/>
    <sql:query var="result">
    select * from Personel where
    ad=?
     <sql:param value="Utku"/>
    </sql:query>
   
    <c:forEach var="personel"  items="${result.rows}">
    ${personel.ad} ${personel.soyad} <br>
    </c:forEach>
  </body>
</html>

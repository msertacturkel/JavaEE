<%@ page language="java" pageEncoding="ISO-8859-9"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested" prefix="nested" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title>uye.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body><font size="5"><strong>&Uuml;r&uuml;n Listesi</strong></font><br><br>
  
  
  <table width="508" border="1" height="168">
<tbody><tr>
<td>&nbsp;&Uuml;r&uuml;n kod<br></td>
<td>&nbsp;Ýsmi</td>
<td>&nbsp;Miktarý</td>
<td>&nbsp;Fiyatý</td>
<td>&nbsp;Durum</td>
<td>&nbsp;A&ccedil;ýklama</td></tr>
<tr>
<td>&nbsp;elma1</td>
<td>&nbsp;Kirmizi&nbsp; renkli elma <br></td>
<td>&nbsp;</td>
<td>&nbsp;1</td>
<td>&nbsp;<html:link action="/alisVerisSepeti.do?kod=0">Sepete Ekle</html:link><br></td>
<td>&nbsp;Ayrýntý</td></tr>
<tr>
<td>&nbsp;port1</td>
<td>&nbsp;Portakal renkli<br></td>
<td>&nbsp;</td>
<td>&nbsp;2</td>
<td>&nbsp;<html:link action="/alisVerisSepeti.do?kod=1">Sepete Ekle</html:link></td>
<td>&nbsp;Ayrýntý</td></tr>
<tr>
<td>&nbsp;nar1</td>
<td>&nbsp;Kýrmýzý</td>
<td>&nbsp;</td>
<td>&nbsp;1</td>
<td>&nbsp;<html:link action="/alisVerisSepeti.do?kod=2">Sepete Ekle</html:link></td>
<td>&nbsp;Ayrýntý</td></tr>
</tbody></table><br><font size="5"><html:link action="/alisVerisSepeti.do?durum=1">Sepeti G&ouml;ster</html:link><br></font><br>
  </body>
</html:html>

<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles"
	prefix="tiles"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested"
	prefix="nested"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
<head>
<html:base />

<title>sonuc.jsp</title>

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
	<logic:present name="personelListesi">
	<table border="1">
		<logic:iterate id="personel" name="personelListesi">
		<tr>
			<td><bean:write name="personel" property="ad" /></td>
			<td><bean:write name="personel" property="soyad" /></td>
			<td><bean:write name="personel" property="maas" /></td>
		</tr>
		</logic:iterate>
		</table>
	</logic:present>
	<logic:notPresent  name="personelListesi">
	  Kayit bulunamadi
	</logic:notPresent>
</body>
</html:html>

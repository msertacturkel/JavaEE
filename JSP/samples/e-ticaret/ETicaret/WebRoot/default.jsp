<%@page import="com.eticaret.dao.CategoryBean"%>
<%@page import="com.eticaret.dao.EticaretDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<title>Page Title</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css" />
<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
	
	
	
	</script>
	
</head>
<body>

	<form>
		<div data-role="page">
		<div data-role="header">
		<button data-icon="home" style="text-align:left;">Anasayfa</button>
			<fieldset data-role="controlgroup" data-type="horizontal"
				data-mini="true" style="text-align:right;">
				<label for="select-more-2a" class="ui-hidden-accessible">More</label>
				<select name="select-more-2a" id="select-more-2a" onchange="alert('test');">
					<option value="">Seçenekler</option>
					<option value="#">Giriş Yap</option>
					<option value="#">Üye Ol</option>
					<option value="#">Şifre Hatırlat</option>
				</select>
			</fieldset>
			
				<div data-role="collapsible" data-collapsed="true" data-theme="b"
					data-content-theme="d">
					<h4>Kategoriler</h4>
					<ul data-role="listview">
						<jsp:useBean id="cat" class="com.eticaret.dao.CategoryBean"></jsp:useBean>
						<jsp:getProperty property="menuHtml" name="cat"/>
					</ul>
				</div>


			</div>
			<!-- /header -->

			<div data-role="content">
				<fieldset data-role="controlgroup" data-type="horizontal"
					data-mini="true">

					<input type="radio" name="radio-choice-b" id="radio-choice-c"
						value="list" checked="checked"> <label
						for="radio-choice-c">Çok Satanlar</label> <input type="radio"
						name="radio-choice-b" id="radio-choice-d" value="grid"> <label
						for="radio-choice-d">İndirimdekiler</label> <input type="radio"
						name="radio-choice-b" id="radio-choice-e" value="gallery">
					<label for="radio-choice-e">En Yeniler</label>
				</fieldset>
			</div>
			<!-- /content -->

			<div data-role="footer">
				<h4>Page Footer</h4>
			</div>
			<!-- /footer -->
		</div>
		<!-- /page -->
	</form>
</body>
</html>

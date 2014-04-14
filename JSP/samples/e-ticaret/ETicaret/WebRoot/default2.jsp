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


</head>
<body>

	<form>
		<div data-role="page">
<a href="#leftpanel3" data-role="button" data-inline="true" data-mini="true" data-corners="true" data-shadow="true" data-iconshadow="true" data-wrapperels="span" data-theme="c" class="ui-btn ui-shadow ui-btn-corner-all ui-mini ui-btn-inline ui-btn-up-c"><span class="ui-btn-inner"><span class="ui-btn-text">Overlay</span></span></a>
			<div data-role="header">
				
				<a href="#popupLogin" data-rel="popup" data-position-to="window"
					data-role="button" data-inline="true" data-icon="check"
					data-theme="e" data-transition="pop" class="ui-btn-right">Giriş</a>
				<div data-role="popup" id="popupLogin" data-theme="a"
					class="ui-corner-all">
					
						<div style="padding:10px 20px;">
							<h4>Lütfen üyelik bilgileri giriniz</h4>
							<label for="un" class="ui-hidden-accessible">Username:</label> <input
								type="text" name="user" id="un" value="" placeholder="Kullanıcı"
								data-theme="a"> <label for="pw"
								class="ui-hidden-accessible">Password:</label> <input
								type="password" name="pass" id="pw" value=""
								placeholder="şifre" data-theme="a">
							<button type="submit" data-theme="b" data-icon="check">Giriş</button>
						</div>
					
				</div>
				<h1>Sample e-ticaret</h1>
				
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

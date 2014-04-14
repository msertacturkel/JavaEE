<%@page import="com.eticaret.dao.SepetBean"%>
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

<script type="text/javascript">
	function doPostBack(catId) {
		document.getElementById("hdnCat").value = catId;
		document.forms["frm"].submit();
	}

	function sepeteEkle(prodId) {
		document.getElementById("hdnProd").value = prodId;
		
		document.forms["frm"].submit();
	}
</script>
</head>
<body>

	<form method="post" id="frm">
		<%
			String param1 = request.getParameter("catId");
			int catId = param1 == null || param1 =="" ? 0 : Integer.parseInt(param1);

			String param2 = request.getParameter("prodId");
			int prodId = param2 == null || param2 =="" ? 0 : Integer.parseInt(param2);
			System.out.println("@"+prodId);

			Object sessionObj = session.getAttribute("spt");

			SepetBean spt = null;

			if (sessionObj == null)
				spt = new SepetBean(prodId);
			else {
				spt = (SepetBean) sessionObj;
				spt.addProduct(prodId);
			}
			session.setAttribute("spt", spt);
		%>
		<input type="hidden" name="catId" id="hdnCat" value="" /> 
		<input type="hidden" name="prodId" id="hdnProd" value="" />

		<div data-role="page" class="jqm-demos ui-responsive-panel"
			id="panel-fixed-page1" data-url="panel-fixed-page1">
			<div data-role="header" data-theme="b" data-position="fixed">
				<h1>e-ticaret sample</h1>
				<a href="#nav-panel" data-icon="bars" data-iconpos="notext">Menu</a>
				<a href="#add-form" data-icon="gear" data-iconpos="notext">Add</a>
			</div>
			<!-- /header -->
			<div data-role="content" class="jqm-content">

				<div style="float: left;">
					<select name="select-choice-mini" id="select-choice-mini"
						data-mini="true" data-inline="true">
						<option value="standard">Fiyata göre artan</option>
						<option value="rush">Fiyata göre azalan</option>
						<option value="express">Çok satılana göre</option>
						<option value="overnight">Puanına göre</option>
					</select>
				</div>

				<div style="float: right;">
					<a href="#popupLogin" data-rel="popup" data-position-to="window"
						data-role="button" data-inline="true" data-icon="check"
						data-theme="e" data-transition="pop" class="ui-btn-right">Sepetim</a>
					<div data-role="popup" id="popupLogin" data-theme="e"
						class="ui-corner-all">

						<div style="padding:10px 20px;">
							<h2>
								Sepetime tıklanınca burada <br>sepet görüntülenecek
							</h2>
						</div>

					</div>
				</div>

				<jsp:useBean id="prod" class="com.eticaret.dao.ProductBean"></jsp:useBean>
				<jsp:setProperty property="categoryId" name="prod"
					value="<%=catId%>" />
				<jsp:getProperty property="menuHtml" name="prod" />


				<!--  <div data-demo-html="#panel-fixed-page1" data-demo-css="true">
				
				
				
				
				</div>-->
				<!--/demo-html -->
			</div>
			<!-- /content -->
			<div data-role="footer" data-position="fixed" data-theme="b">
				<h4>Fixed footer</h4>
			</div>
			<!-- /footer -->

			<div data-role="panel" data-position-fixed="true" data-theme="c"
				id="nav-panel">
				<ul data-role="listview" data-theme="c" class="nav-search">
					<li data-icon="delete"><a href="#" data-rel="close">Kategoriler</a></li>
					<jsp:useBean id="cat" class="com.eticaret.dao.CategoryBean"></jsp:useBean>
					<jsp:getProperty property="menuHtml" name="cat" />
				</ul>
			</div>
			<!-- /panel -->
			<div data-role="panel" data-position="right"
				data-position-fixed="true" data-display="overlay" data-theme="b"
				id="add-form">
				<div data-role="collapsible-set" data-theme="c"
					data-content-theme="d">
					<div data-role="collapsible">
						<h3>Sisteme Giriş</h3>
						<h5>Lütfen üyelik bilgilerinizi giriniz.</h5>
						<input type="text" name="name" id="name" value=""
							data-clear-btn="true" data-mini="true" placeholder="Kullanıcı">
						<input type="password" name="password" id="password" value=""
							data-clear-btn="true" autocomplete="off" data-mini="true"
							placeholder="Şifre">
						<div class="ui-grid-a">
							<div class="ui-block-a">
								<a href="#" data-rel="close" data-role="button" data-theme="c"
									data-mini="true">Vazgeç</a>
							</div>
							<div class="ui-block-b">
								<a href="#" data-rel="close" data-role="button" data-theme="b"
									data-mini="true">Giriş</a>
							</div>
						</div>
					</div>
					<div data-role="collapsible">
						<h3>Yeni Üye</h3>
						<p>I'm the collapsible content for section 2</p>
					</div>
					<div data-role="collapsible">
						<h3>Şifre Hatırlatma</h3>
						<p>I'm the collapsible content for section 3</p>
					</div>
				</div>
			</div>
			<!-- /panel -->
		</div>
	</form>
</body>
</html>

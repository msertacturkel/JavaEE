package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.eticaret.dao.SepetBean;
import com.eticaret.dao.CategoryBean;
import com.eticaret.dao.EticaretDao;
import java.util.*;

public final class default3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Page Title</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.css\" />\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction doPostBack(catId) {\r\n");
      out.write("\t\tdocument.getElementById(\"hdnCat\").value = catId;\r\n");
      out.write("\t\tdocument.forms[\"frm\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction sepeteEkle(prodId) {\r\n");
      out.write("\t\tdocument.getElementById(\"hdnProd\").value = prodId;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.forms[\"frm\"].submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form method=\"post\" id=\"frm\">\r\n");
      out.write("\t\t");

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
		
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"catId\" id=\"hdnCat\" value=\"\" /> \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"prodId\" id=\"hdnProd\" value=\"\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<div data-role=\"page\" class=\"jqm-demos ui-responsive-panel\"\r\n");
      out.write("\t\t\tid=\"panel-fixed-page1\" data-url=\"panel-fixed-page1\">\r\n");
      out.write("\t\t\t<div data-role=\"header\" data-theme=\"b\" data-position=\"fixed\">\r\n");
      out.write("\t\t\t\t<h1>e-ticaret sample</h1>\r\n");
      out.write("\t\t\t\t<a href=\"#nav-panel\" data-icon=\"bars\" data-iconpos=\"notext\">Menu</a>\r\n");
      out.write("\t\t\t\t<a href=\"#add-form\" data-icon=\"gear\" data-iconpos=\"notext\">Add</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /header -->\r\n");
      out.write("\t\t\t<div data-role=\"content\" class=\"jqm-content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"float: left;\">\r\n");
      out.write("\t\t\t\t\t<select name=\"select-choice-mini\" id=\"select-choice-mini\"\r\n");
      out.write("\t\t\t\t\t\tdata-mini=\"true\" data-inline=\"true\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"standard\">Fiyata göre artan</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"rush\">Fiyata göre azalan</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"express\">Çok satılana göre</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"overnight\">Puanına göre</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"float: right;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#popupLogin\" data-rel=\"popup\" data-position-to=\"window\"\r\n");
      out.write("\t\t\t\t\t\tdata-role=\"button\" data-inline=\"true\" data-icon=\"check\"\r\n");
      out.write("\t\t\t\t\t\tdata-theme=\"e\" data-transition=\"pop\" class=\"ui-btn-right\">Sepetim</a>\r\n");
      out.write("\t\t\t\t\t<div data-role=\"popup\" id=\"popupLogin\" data-theme=\"e\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"ui-corner-all\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"padding:10px 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\tSepetime tıklanınca burada <br>sepet görüntülenecek\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      com.eticaret.dao.ProductBean prod = null;
      synchronized (_jspx_page_context) {
        prod = (com.eticaret.dao.ProductBean) _jspx_page_context.getAttribute("prod", PageContext.PAGE_SCOPE);
        if (prod == null){
          prod = new com.eticaret.dao.ProductBean();
          _jspx_page_context.setAttribute("prod", prod, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetProperty(_jspx_page_context.findAttribute("prod"), "categoryId",
catId);
      out.write("\r\n");
      out.write("\t\t\t\t");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.eticaret.dao.ProductBean)_jspx_page_context.findAttribute("prod")).getMenuHtml())));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!--  <div data-demo-html=\"#panel-fixed-page1\" data-demo-css=\"true\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>-->\r\n");
      out.write("\t\t\t\t<!--/demo-html -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /content -->\r\n");
      out.write("\t\t\t<div data-role=\"footer\" data-position=\"fixed\" data-theme=\"b\">\r\n");
      out.write("\t\t\t\t<h4>Fixed footer</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /footer -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div data-role=\"panel\" data-position-fixed=\"true\" data-theme=\"c\"\r\n");
      out.write("\t\t\t\tid=\"nav-panel\">\r\n");
      out.write("\t\t\t\t<ul data-role=\"listview\" data-theme=\"c\" class=\"nav-search\">\r\n");
      out.write("\t\t\t\t\t<li data-icon=\"delete\"><a href=\"#\" data-rel=\"close\">Kategoriler</a></li>\r\n");
      out.write("\t\t\t\t\t");
      com.eticaret.dao.CategoryBean cat = null;
      synchronized (_jspx_page_context) {
        cat = (com.eticaret.dao.CategoryBean) _jspx_page_context.getAttribute("cat", PageContext.PAGE_SCOPE);
        if (cat == null){
          cat = new com.eticaret.dao.CategoryBean();
          _jspx_page_context.setAttribute("cat", cat, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.eticaret.dao.CategoryBean)_jspx_page_context.findAttribute("cat")).getMenuHtml())));
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /panel -->\r\n");
      out.write("\t\t\t<div data-role=\"panel\" data-position=\"right\"\r\n");
      out.write("\t\t\t\tdata-position-fixed=\"true\" data-display=\"overlay\" data-theme=\"b\"\r\n");
      out.write("\t\t\t\tid=\"add-form\">\r\n");
      out.write("\t\t\t\t<div data-role=\"collapsible-set\" data-theme=\"c\"\r\n");
      out.write("\t\t\t\t\tdata-content-theme=\"d\">\r\n");
      out.write("\t\t\t\t\t<div data-role=\"collapsible\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Sisteme Giriş</h3>\r\n");
      out.write("\t\t\t\t\t\t<h5>Lütfen üyelik bilgilerinizi giriniz.</h5>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"name\" id=\"name\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-clear-btn=\"true\" data-mini=\"true\" placeholder=\"Kullanıcı\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-clear-btn=\"true\" autocomplete=\"off\" data-mini=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Şifre\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ui-grid-a\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ui-block-a\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" data-rel=\"close\" data-role=\"button\" data-theme=\"c\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-mini=\"true\">Vazgeç</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"ui-block-b\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" data-rel=\"close\" data-role=\"button\" data-theme=\"b\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-mini=\"true\">Giriş</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div data-role=\"collapsible\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Yeni Üye</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>I'm the collapsible content for section 2</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div data-role=\"collapsible\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Şifre Hatırlatma</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>I'm the collapsible content for section 3</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /panel -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

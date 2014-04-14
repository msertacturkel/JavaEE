package web;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/PersonelBilgiSakla")
public class PersonelBilgiSakla extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonelBilgiSakla() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String ad=request.getParameter("ad");
		String soyad=request.getParameter("soyad");		
		Cookie c1=new Cookie("ad", ad);
		Cookie c2=new Cookie("soyad", soyad);
		c1.setMaxAge(60*60);
		c2.setMaxAge(60*60);
		response.addCookie(c1);
		response.addCookie(c2);
		response.sendRedirect("PersonelBilgiServlet");
	}

}

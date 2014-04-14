package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonelBilgiServlet
 */
@WebServlet("/PersonelBilgiServlet")
public class PersonelBilgiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonelBilgiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //MIME
		java.io.PrintWriter out=response.getWriter();
		Cookie[] cooks = request.getCookies();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		String ad=null;
		String soyad=null;
		if(cooks!=null){
			for (int i = 0; i < cooks.length; i++) {
				String name = cooks[i].getName();
				String value = cooks[i].getValue();
				if(name.equalsIgnoreCase("ad")) ad=value;
				if(name.equalsIgnoreCase("soyad")) soyad=value;
			}
			out.println("Merhaba "+ad+" "+soyad);
			out.println("<br>Bu kisi sen degilsen degisiklik yap");
		}
		
		out.println("<form action='PersonelBilgiSakla' method='post'>");
		out.println(" Ad: <input type='text' name='ad'><br>");
		out.println(" Soyad:<input type='text' name='soyad'><br>");
		out.println(" <input type='submit' value='gonder'><input type='reset' value='sil'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

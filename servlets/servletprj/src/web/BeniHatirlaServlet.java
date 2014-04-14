package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BeniHatirlaServlet
 */
@WebServlet("/BeniHatirlaServlet")
public class BeniHatirlaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeniHatirlaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //MIME
		java.io.PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>");
		out.println("<html xmlns='http://www.w3.org/1999/xhtml'>");
		out.println("<head>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
		out.println("<title>Untitled Document</title>");
		out.println("</head>");
		out.println("");
		out.println("<body>");
		out.println("<form method='post' action='RenkSaklaServlet'>");
		out.println("  <p>Remember My Desicion With Cookie</p>");
		out.println("  <p>Red ");
		out.println("    <input type='radio' name='renkler'  value='red' />");
		out.println("    <label for='red'></label>");
		out.println("  </p>");
		out.println("  <p>Green ");
		out.println("    <input type='radio' name='renkler'  value='green' />");
		out.println("    <label for='green'></label>");
		out.println("  </p>");
		out.println("  <p>Blue ");
		out.println("    <input type='radio' name='renkler' value='blue' />");
		out.println("    <label for='blue'></label>");
		out.println("  </p>");
		out.println("  <p>");
		out.println("    <input type='submit' value='Gonder' />");
		out.println("    <input type='reset'  value='Sil' />");
		out.println("    <br />");
		out.println("  </p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}

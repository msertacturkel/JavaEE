package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TabloServ
 */
@WebServlet("/TabloServ")
public class TabloServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TabloServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //MIME
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>");
		out.println("<html xmlns='http://www.w3.org/1999/xhtml'>");
		out.println("<head>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1' />");
		out.println("<title>Untitled Document</title>");
		out.println("</head>");
		out.println("");
		out.println("<body>");
		out.println("<table width='200' border='2'>");
		out.println("  <tr>");
		out.println("    <th scope='row'>&nbsp;</th>");
		out.println("    <td>&nbsp;</td>");
		out.println("    <td>&nbsp;</td>");
		out.println("  </tr>");
		out.println("  <tr>");
		out.println("    <th scope='row'>&nbsp;</th>");
		out.println("    <td>&nbsp;</td>");
		out.println("    <td>&nbsp;</td>");
		out.println("  </tr>");
		out.println("  <tr>");
		out.println("    <th scope='row'>&nbsp;</th>");
		out.println("    <td>&nbsp;</td>");
		out.println("    <td>&nbsp;</td>");
		out.println("  </tr>");
		out.println("</table>");
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

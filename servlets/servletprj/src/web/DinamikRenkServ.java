package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DinamikRenkServ
 */
@WebServlet("/DinamikRenkServ")
public class DinamikRenkServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DinamikRenkServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		java.io.PrintWriter out = response.getWriter();
		String renkler[] = { "blue", "white", "red", "green", "yellow" };
		int i = (int) (Math.random() * (renkler.length));
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet sayfasi</title>");
		out.println("</head>");
		out.println("<body bgcolor=\"" + renkler[i] + "\">");
		out.println("Deneme");
		out.println("</body>");
		out.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

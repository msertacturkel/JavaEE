package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String islem = request.getParameter("islem");
		if (islem.equals("urunsec")) {
			RequestDispatcher disp = request
					.getRequestDispatcher("/urunSec.jsp");
			disp.forward(request, response);
		}
		if (islem.equals("urunekle")) {
			RequestDispatcher disp = request
					.getRequestDispatcher("/urunEkle.jsp");
			disp.forward(request, response);
		}

	}

}

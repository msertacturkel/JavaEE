import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypack.Sepet;
import mypack.Urun;
import mypack.Urunler;

public class UrunSilServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String kod = request.getParameter("kod");
		Urunler urunler = new Urunler();
		HttpSession session = request.getSession();
		Sepet sepet = (Sepet) session.getAttribute("sepet");
		// sepet onceden olusturulmus mu?
		if (sepet == null) {
			Sepet sep1 = new Sepet();
			sepet = sep1;
			
		}

		for (Urun urun : urunler.getUrunler()) {			
			if (urun.getKod().equals(kod))
				sepet.sil(urun);
			
		}
		session.setAttribute("sepet", sepet);
		RequestDispatcher disp = request
				.getRequestDispatcher("/urunSec.jsp");
		disp.forward(request, response);

	}

}

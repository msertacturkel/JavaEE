package framework;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet {

	public ActionServlet() {

	}// constr

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		fonk(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		fonk(req, resp);
	}

	private void fonk(HttpServletRequest req, HttpServletResponse resp) {
		Enumeration params = req.getParameterNames();

		String actkey = ResourceBundle.getBundle(
				"csystem.resource/ApplicationResources").getString("action1");
		String formkey = ResourceBundle.getBundle(
				"csystem.resource/ApplicationResources").getString("form1");
		try {
			Action action = (Action) Class.forName(actkey).newInstance();
			ActionForm form = (ActionForm) Class.forName(formkey).newInstance();
			Class cls = form.getClass();

			Method[] methods = cls.getMethods();
			int index = 0;
			HashMap<String, Method> setMeths = new HashMap<String, Method>();
			for (int i = 0; i < methods.length; i++) {
				Method method = methods[i];
				if (method.getName().startsWith("set")) {
					String str = method.getName().substring(3, 4).toLowerCase()
							.concat(method.getName().substring(4));
					setMeths.put(str, method);
				}// if
			}// for
			while (params.hasMoreElements()) {
				String temp = (String) params.nextElement();
				Set<String> methKeys = setMeths.keySet();
				for (String metName : methKeys) {
					if (metName.equals(temp)) {

						setMeths.get(metName).invoke(form,
								req.getParameter(temp));
						System.out.println(temp);
					}
				}

			}

			action.execute(form, req, resp);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
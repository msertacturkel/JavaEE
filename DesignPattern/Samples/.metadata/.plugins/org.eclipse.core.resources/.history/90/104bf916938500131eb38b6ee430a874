package org.csystem.struts;

import java.util.ResourceBundle;

import myactions.MyAction;

public class ActionServlet {

	public ActionServlet() {
		// TODO Auto-generated constructor stub
		try {
			String sinifAd = ResourceBundle.getBundle("myresource/action").getString("action1");		
			Class cls = Class.forName(sinifAd);
			Action my = (Action)cls.newInstance();
			my.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

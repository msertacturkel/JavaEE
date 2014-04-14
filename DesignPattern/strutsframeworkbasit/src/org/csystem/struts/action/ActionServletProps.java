package org.csystem.struts.action;

import java.util.ResourceBundle;

public class ActionServletProps {

	public ActionServletProps() {

	}

	public void execute() {

		String actionName = ResourceBundle.
				getBundle("myresource/action")
				.getString("action");
		try {
			Action action = (Action) Class.forName(actionName).newInstance();
			action.execute();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

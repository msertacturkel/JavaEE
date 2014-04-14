package org.csystem.struts.action;

import java.io.IOException;
import java.util.ResourceBundle;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ActionServlet {

	public ActionServlet() {

	}

	public void execute() {

		SAXBuilder sb = new SAXBuilder();
		Document doc;
		
			
		try {
			doc = sb.build("web-inf/struts-config.xml");
			Element root = doc.getRootElement();			
			String actionName = root.getChild("action-mappings")
					.getChild("action").getAttribute("type").getValue();
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
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

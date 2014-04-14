package org.csystem.struts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import myactions.MyAction;

public class ActionServlet {

	public ActionServlet() {
		// TODO Auto-generated constructor stub
		try {
			SAXBuilder sb = new SAXBuilder();
			Document doc;
			doc = sb.build("web-inf/struts-config.xml");
			Element root = doc.getRootElement();
			String actionName = root.getChild("action-mappings")
					.getChild("action").getAttribute("type").getValue();

			Class cls = Class.forName(actionName);
			Action my = (Action) cls.newInstance();
			my.execute();
			String messageResources = root.getChild("message-resources")
					.getAttribute("parameter").getValue();
			System.out.println(messageResources);			
			String path = messageResources.replace(".", "\\");
			
			FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+File.separator+"src"+File.separator+path+".properties");
			Properties props=new Properties();
			props.load(fi);
			Set<Object> keys = props.keySet();
			for (Object key : keys) {
				System.out.println(key+"\t"+props.getProperty((String)key));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
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

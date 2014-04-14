import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class DOMOku {

	public DOMOku() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db;
		try {
			db = dbf.newDocumentBuilder();
			Document doc = db.parse("siparis1.xml");			
			Node node = (Node) doc;
			nodeDolas(node);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void nodeDolas(Node node) {
		if (node.getNodeType() == Node.TEXT_NODE) {
		
			String s = ((Text) node).getData();
			if (s.length() != 0)
				System.out.println(s);
		}
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++)
			nodeDolas(list.item(i));
	}

	public static void main(String[] args) {
		new DOMOku();

	}

}

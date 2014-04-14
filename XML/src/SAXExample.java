import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;
public class SAXExample {
	public static void main(String[] args) {		
		try {			
			SAXParserFactory factory = SAXParserFactory.newInstance();		
			SAXParser parser = factory.newSAXParser();
			SAXHandler tsh = new SAXHandler();
			parser.parse("siparis1.xml",tsh);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

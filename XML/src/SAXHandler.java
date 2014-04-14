import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
public class SAXHandler extends DefaultHandler{	
	@Override
	public void startDocument() throws SAXException {
			System.out.println("Dokuman okunmaya basladi");
	}	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Dokuman okumasi bitti");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {		
		if(qName.equals("urunadi"))
		{		
		System.out.println("<" +qName + ">");
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("urunadi"))
		{		
		System.out.println("</" +qName + ">");
		}
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String s = new String(ch,start,length);
		System.out.println(s.trim());
	}	
}

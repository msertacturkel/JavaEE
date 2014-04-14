import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLOlustur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		try {
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			Element kokEleman = doc.createElement("ogrenci-kayit");
			doc.appendChild(kokEleman);
			//ogrenci elemani olusturuluyor(root'a eklenecek)
			Element ogrenci = doc.createElement("ogrenci");
			// ogrenci numarasi ogrenci elemanina attribute olarak eklenecek
			Attr ogrenciNo = doc.createAttribute("no");
			ogrenciNo.setValue("1");
			ogrenci.setAttributeNode(ogrenciNo);//ogrenci elemanina eklendi
			//ogrenci elemanina gelecek ad olusturuluyor
			Element ad=doc.createElement("ad");
			ad.appendChild(doc.createTextNode("Ahmet"));//ad elemanina deger atandi(text node)
			ogrenci.appendChild(ad);//ad elemani ogrenci elemaninin altina ekleniyors
			kokEleman.appendChild(ogrenci);//ogrenci elemani root'a ekleniyor
			
			//Elde edilen dom ekran veya dosyaya yaziliyor
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(System.out);
			transformer.transform(source, result);

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

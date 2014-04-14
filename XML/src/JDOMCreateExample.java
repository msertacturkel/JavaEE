

import java.io.FileOutputStream;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

public class JDOMCreateExample {

	public static void main(String[] args) {
		
		Document doc = new Document();
		Element calisanlar = new Element("calisanlar");
		Element calisan = new Element("calisan");
		Element ad = new Element("ad");
		Element soyad = new Element("soyad");
		
		
		ad.setText("Ahmet");
		soyad.setText("Demirelli");
		
		calisan.addContent(ad);
		calisan.addContent(soyad);
		
		calisanlar.addContent(calisan);
		doc.addContent(calisanlar);
		
		XMLOutputter out = new XMLOutputter();
		try
		{
		out.output(doc, new FileOutputStream("sonuc.xml"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

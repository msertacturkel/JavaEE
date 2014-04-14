import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ogr.Ogrenci;
import ogr.OgrenciKayit;


public class OgrenciOkuJAXB {

	public static void main(String[] args) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance("ogr");
			// create an Unmarshaller
			Unmarshaller u = jc.createUnmarshaller();

			OgrenciKayit ogrenciKayit = (OgrenciKayit) u
					.unmarshal(new FileInputStream("ogrenci-kayit.xml"));
						
			List<Ogrenci> ogrenciler = ogrenciKayit.getOgrenci();
			for (Ogrenci ogrenci : ogrenciler) {
				System.out.println(ogrenci.getAd());
			}

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

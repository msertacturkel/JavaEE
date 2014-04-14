import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
public class XMLSchemaValidation {
	public static void main(String[] args) {
		try {
			SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Source schemasource = new StreamSource("Okul.xsd");
			Source xmlsource = new StreamSource("Okul.xml");
			Schema schema =  sf.newSchema(schemasource);
			Validator vldtr =  schema.newValidator();
			vldtr.validate(xmlsource);
			System.out.println("valide edildi");	
			
		} catch (Exception e) {
			System.out.println("Hata");
			System.out.println(e.getMessage());			
		}
	}
}

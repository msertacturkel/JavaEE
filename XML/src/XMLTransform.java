
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMLTransform {


	public static void main(String[] args) {
		try
		{
		TransformerFactory tf = TransformerFactory.newInstance();
		Source xslfile = new StreamSource("cdcatalog.xsl");
		Transformer transformer = tf.newTransformer(xslfile);
		Source xmlfile = new StreamSource("cdcatalog.xml");
		Result output = new StreamResult("abc.html");
		
		transformer.transform(xmlfile, output);
		System.out.println("bitti");
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

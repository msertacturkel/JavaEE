import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class JDOMExample {
	public static void main(String[] args) {
		try
		{
			
		SAXBuilder sb = new SAXBuilder();
		Document doc = sb.build("siparis1.xml");
	    Element root = 	doc.getRootElement();
    
	   System.out.println(root.getName()); 
	    List sp =  root.getChildren("siparis");
	    for(int i=0;i<sp.size();i++)
	    {
	    	 Element siparis =(Element)sp.get(i);
	    	 System.out.println(siparis.getChildText("urunadi"));
	    	 //System.out.println(siparis.getChildText("miktar"));
	    }
	    
	    System.out.println(root.getQualifiedName());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}


import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;
import org.csystem.ws.HelloWS;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String arg[]) {
        System.out.println(topla(4,6));
    }

    private static  double topla(double sayi1, double sayi2) {
        org.csystem.ws.HelloWS_Service service = new org.csystem.ws.HelloWS_Service();
        HelloWS port = service.getHelloWSPort();
        double sonuc = port.topla(sayi1, sayi2);
        return sonuc;
    }
}

import java.util.Properties;
import java.util.Set;


public class SistemProps {

	public static void main(String[] args) {
		Properties props = System.getProperties();

		Set<Object> keys = props.keySet();
		for (Object key : keys) {
			System.out.println(key+"\t"+props.getProperty((String)key));
		}
	}

}

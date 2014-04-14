import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MetodOkuma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("MyAction");

			Method[] methods = cls.getMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i].getName());

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

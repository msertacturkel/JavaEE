import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MetodCalistirma {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class cls;
		try {
			cls = Class.forName("MyAction");
			MyAction act = (MyAction) (cls.newInstance());
			Method[] methods = cls.getMethods();
			for (int i = 0; i < methods.length; i++) {				
				Method meth = methods[i];
				if (meth.getName().startsWith("set"))
					meth.invoke(act, "deneme");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

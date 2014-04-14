import java.lang.reflect.Method;

public class MetodCalistirmaJSF {

	public static void main(String[] args) {
		Class cls;
		try {
			cls = Class.forName("MyActionF");
			MyActionF act = (MyActionF) (cls.newInstance());
			Method[] methods = cls.getMethods();
			for (int i = 0; i < methods.length; i++) {
				Method meth = methods[i];
				Class[] params = meth.getParameterTypes();
				Class[] except = meth.getExceptionTypes();
				if (params.length == 3) {
					if (params[0].getName().equals(
							"javax.faces.context.FacesContext")
							& params[1].getName().equals(
									"javax.faces.component.UIComponent")
							& params[2].getName().equals("java.lang.Object")
							& except[0].getName().equals(
									"javax.faces.validator.ValidatorException"))
						System.out.println(meth.getName());
				}
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
		}

	}

}

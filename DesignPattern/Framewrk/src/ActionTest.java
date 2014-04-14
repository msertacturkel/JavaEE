import java.util.ResourceBundle;

import mypack.Action;


public class ActionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	try {
		String actkey = ResourceBundle.getBundle(
				"csystem.resource/ApplicationResources").getString("action");		
		Action act=(Action)	Class.forName(actkey).newInstance(); 
		act.execute();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

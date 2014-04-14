package framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public abstract class Action {

	public abstract void execute(ActionForm form,
			HttpServletRequest request, HttpServletResponse response);

}

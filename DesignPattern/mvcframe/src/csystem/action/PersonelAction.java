package csystem.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import csystem.form.PersonelForm;

import framework.Action;
import framework.ActionForm;

public class PersonelAction extends Action {

	
	public void execute(ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		PersonelForm per=(PersonelForm)form;
		System.out.println(per.getAd());
		System.out.println(per.getSoyad());
		System.out.println(per.getEmail());
		
	}

}

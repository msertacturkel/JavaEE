package org.csystem.bean;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class UserBean {
	private String printMsgFromSpring;
	@Inject
	public UserBo userBo;

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String getPrintMsgFromSpring() {
		return userBo.getMessage();
		//return "deneme";
	}


}

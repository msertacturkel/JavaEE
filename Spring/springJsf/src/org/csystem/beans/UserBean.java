package org.csystem.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("session")
public class UserBean {
	private String printMsgFromSpring;
	@Inject
	public UserBo userBo;

	public String getPrintMsgFromSpring() {
		return userBo.getMessage();
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

}

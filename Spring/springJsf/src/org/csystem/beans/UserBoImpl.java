package org.csystem.beans;

import javax.inject.Named;

@Named
public class UserBoImpl implements UserBo {

	@Override
	public String getMessage() {
		return "JSF 2 + Spring Integration";
	}

}

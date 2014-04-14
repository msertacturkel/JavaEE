package shop;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// ------------------ Properties --------------------------------
	private String username;

	// ------------------ Constructor -------------------------------
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}

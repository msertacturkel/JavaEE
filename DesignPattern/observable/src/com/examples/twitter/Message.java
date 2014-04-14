package com.examples.twitter;

import java.sql.Timestamp;
import java.util.Calendar;

/**
 * Message with a body text, a sender and a time stamp when message has been sent
 * @author The Dark Lord
 * 
 */
public class Message {
	public Message() {
		this.textBody = "";
		this.sender = "(noname)";
		this.dateSent = new Timestamp(Calendar.getInstance().getTime().getTime());
	}

	public Message(String textBody, String sender) {
		this.textBody = textBody;
		this.sender = sender;
		this.dateSent = new Timestamp(Calendar.getInstance().getTime().getTime());
	}

	public Message(String textBody, String sender, Timestamp dateSent) {
		this.textBody = textBody;
		this.sender = sender;
		this.dateSent = dateSent;
	}
	
	@SuppressWarnings("deprecation")
	private String getDateText() {
		Timestamp now = new Timestamp(Calendar.getInstance().getTime().getTime());
		
		if (now.getYear() > dateSent.getYear())
			return (now.getYear() - dateSent.getYear()) + "Y";
		
		if (now.getMonth() > dateSent.getMonth())
			return (now.getMonth() - dateSent.getMonth()) + "M";
		
		if (now.getDay() > dateSent.getDay())
			return (now.getDay() - dateSent.getDay()) + "D";
		
		if (now.getHours() > dateSent.getHours())
			return (now.getHours() - dateSent.getHours()) + "h";
		
		if (now.getMinutes() > dateSent.getMinutes())
			return (now.getMinutes() - dateSent.getMinutes()) + "m";
		
		if (now.getSeconds() > dateSent.getSeconds())
			return (now.getSeconds() - dateSent.getSeconds()) + "s";
		
		return "now";
	}

	@Override
	public String toString() {
		return textBody + " by " + sender + " @ " + getDateText();
	}

	public String getTextBody() {
		return textBody;
	}

	public void setTextBody(String textBody) {
		this.textBody = textBody;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Timestamp getDateSent() {
		return dateSent;
	}

	public void setDateSent(Timestamp dateSent) {
		this.dateSent = dateSent;
	}

	private String textBody;
	private String sender;
	private Timestamp dateSent;

}

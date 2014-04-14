package com.examples.twitter;

import java.util.ArrayList;
import java.util.Iterator;

import com.examples.observer.Observable;
import com.examples.observer.Observer;

/**
 * Contact which is both subject (observable) and observer
 * 
 * @author The Dark Lord
 * 
 */
public class Contact implements Observable, Observer, Iterable<Message> {

	private String name;
	private ArrayList<Message> messages;
	private ArrayList<Contact> observingContacts;

	@Override
	public void update(Object data) {
		addMessage((Message) data);
	}

	@Override
	public void registerObserver(Observer observer) {
		observingContacts.add((Contact) observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observingContacts.remove(observer);
	}

	@Override
	public void notifyObservers(Object data) {
		for (Contact notifiedContact : observingContacts) {
			notifiedContact.update(data);
		}
	}

	/**
	 * Adds a new message with specified text body
	 * 
	 * @param textBody
	 *            text body of the message
	 */
	public void tweet(String textBody) {
		Message message = new Message(textBody, name);
		addMessage(message);
		notifyObservers(message);
	}

	/**
	 * Adds the specified message to messages
	 * 
	 * @param message
	 */
	public void addMessage(Message message) {
		messages.add(message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Contact can be iterated by it's messages
	 */
	@Override
	public Iterator<Message> iterator() {
		return messages.iterator();
	}

	public Contact(String name) {
		this.name = name;
		this.messages = new ArrayList<Message>();
		this.observingContacts = new ArrayList<Contact>();
	}

}

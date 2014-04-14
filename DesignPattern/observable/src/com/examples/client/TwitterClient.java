package com.examples.client;

import java.util.ArrayList;

import com.examples.twitter.Contact;
import com.examples.twitter.Message;

/**
 * Client of mock twitter project
 * 
 * @author The Dark Lord
 * 
 */
public class TwitterClient {

	public static void main(String[] args) {
		ArrayList<Contact> session = new ArrayList<Contact>(); // List of
																// contacts in
																// current
																// session

		// Creating contacts

		Contact harold = new Contact("Harold");
		Contact jennifer = new Contact("Jennifer");
		Contact hussein = new Contact("Hussein");
		Contact aliyyah = new Contact("Aliyyah");
		Contact yigit = new Contact("Yigit");

		// Adding contacts to current session

		session.add(harold);
		session.add(jennifer);
		session.add(hussein);
		session.add(aliyyah);
		session.add(yigit);

		// Registering Harold, Jennifer, Hussein and Aliyyah as 'Observers' of
		// Yigit, e.g. now they follow Yigit

		yigit.registerObserver(harold);
		yigit.registerObserver(jennifer);
		yigit.registerObserver(hussein);
		yigit.registerObserver(aliyyah);

		// Some random tweets

		try {
			jennifer.tweet("I am bored today");
			Thread.sleep(1000);
			hussein.tweet("I'll be there in a minute...");
			Thread.sleep(1000);
			yigit.tweet("Hi everyone! It's a nice shiny day out there!");
			Thread.sleep(1000);
			jennifer.tweet("It is ok!");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Print walls

		System.out.println("Everyone follows Yigit...");
		System.out.println();

		printWalls(session);

		// Remove Harold and Aliyyah from Yigit's observers list, e.g. now
		// Harold and Aliyyah unfollowed Yigit
		yigit.removeObserver(harold);
		yigit.removeObserver(aliyyah);

		try {
			yigit.tweet("Harold and Aliyyah cannot receive what I write, so I'm cool"); // New
																						// tweet
																						// for
																						// notification
																						// test
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Print walls again

		System.out
				.println("Harold and Aliyyah unfollowed Yigit. How mean of them!");
		System.out.println();

		printWalls(session);
	}

	/**
	 * Prints walls of all contacts in the given session
	 * 
	 * @param session
	 *            list of contacts
	 */
	public static void printWalls(ArrayList<Contact> session) {
		for (Contact contact : session) {
			System.out.println(contact.getName() + "'s wall:");
			for (Message message : contact) {
				System.out.println(message);
			}
			System.out.println();
		}
	}

}

/**
 * 
 */
package com.examples.observer;

/**
 * Implementing this interface allows an object to be observed by Observer
 * objects
 * 
 * @author The Dark Lord
 * @see Observer
 * 
 */
public interface Observable {
	/**
	 * Registers an observer to the observable object
	 * 
	 * @param observer
	 */
	void registerObserver(Observer observer);

	/**
	 * Removes a registered observer from the observable object
	 * 
	 * @param observer
	 */
	void removeObserver(Observer observer);

	/**
	 * Notifies all of the observers registered to the observable object
	 * 
	 * @param data
	 */
	void notifyObservers(Object data);
}

/**
 * 
 */
package com.examples.observer;

/**
 * Implementing this interface allows an object to become an observer of an
 * observable object
 * 
 * @author The Dark Lord
 * 
 */
public interface Observer {
	/**
	 * This method is called when observer gets updated, e.g. notified
	 * 
	 * @param data
	 *            update parameter
	 */
	public void update(Object data);
}

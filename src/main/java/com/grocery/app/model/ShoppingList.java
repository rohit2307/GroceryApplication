/**
 * 
 */
package com.grocery.app.model;

/**
 * @author Praveena
 *
 */
public class ShoppingList {

	private String title;
	
	public ShoppingList() {}

	/**
	 * @param title
	 */
	public ShoppingList(String title) {
		super();
		this.title = title;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}

package myiceface;

public class InventoryItem {
	// slock number
	int stock;
	// model or type of inventory
	String model;
	// description of item
	String description;
	// number of miles on odometer
	int odometer;
	// price of car in Canadian dollars
	int price;

	/**
	 * Creates a new instance of InventoryItem.
	 * 
	 * @param stock
	 *            stock number.
	 * @param model
	 *            model or type of inventory.
	 * @param description
	 *            description of item.
	 * @param odometer
	 *            number of miles on odometer.
	 * @param price
	 *            price of care in Canadian dollars.
	 */
	public InventoryItem(int stock, String model, String description,
			int odometer, int price) {
		this.stock = stock;
		this.model = model;
		this.description = description;
		this.odometer = odometer;
		this.price = price;
	}

	/**
	 * Gets the stock number of this iventory item.
	 * 
	 * @return stock number.
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Gets the model number of this iventory item.
	 * 
	 * @return model number.
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Gets the description of the this iventory item.
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the odometer reading from this iventory item.
	 * 
	 * @return odometer reading.
	 */
	public int getOdometer() {
		return odometer;
	}

	/**
	 * Gets the price of this item in Canadian Dollars.
	 * 
	 * @return price.
	 */
	public int getPrice() {
		return price;
	}

}

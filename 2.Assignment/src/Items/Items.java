
package Items;

import java.util.*;

/**
 * This class name is Items.Items Class containing the items in this application.
 * This class is a superclass.
 * @author Damla Unal
 */
public class Items {
	
	/**
	 * item_id is holding items id.
	 */
	public static int static_item_id=1 ;
	public int item_id;
	/**
	 * price is a Items's property.
	 */
	private String price;


	/**
	 * The constructor.
	 * When creating Items object, this constructor is running.
	 *  static_item_id is increasing.
	 *  @param price  item's cost.
	 */
	
	public Items(String price) {
		this.price=price;
		this.item_id=static_item_id;
		static_item_id++;
		
	}

	/**
	 * Returns item_id.
	 * @return item_id
	 */
	public int getItem_id() {
		return this.item_id;
	}

	/**
	 * Sets a value to attribute item_id.
	 * @param newItem_id
	 */
	public void setItem_id(int newItem_id) {
		this.item_id = newItem_id;
	}

	/**
	 * Returns price.
	 * @return price
	 */
	public String getPrice() {
		return this.price;
	}

	/**
	 * Sets a value to attribute price.
	 * @param newPrice
	 */
	public void setPrice(String newPrice) {
		this.price = newPrice;
	}
	
}

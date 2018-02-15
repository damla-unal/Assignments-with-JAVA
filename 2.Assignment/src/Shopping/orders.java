
package Shopping;

/**
 * orders is in Shopping package.
 * This class is containing orders's property.
 * 
 * @author Damla Unal
 */
public class orders {
	/**
	 * orderDate is order's property.
	 */
	public String orderDate;

	/**
	 * totalCost is order's property.
	 */
	public int totalCost;

	/**
	 * purchasedItems is order's property.
	 */
	public String purchasedItems ;

	/**
	 * The constructor.
	 */
	public orders() {
		
	}

	/**
	 * Returns orderDate.
	 * @return orderDate
	 */
	public String getOrderDate() {
		return this.orderDate;
	}

	/**
	 * Sets a value to attribute orderDate.
	 * @param newOrderDate
	 */
	public void setOrderDate(String newOrderDate) {
		this.orderDate = newOrderDate;
	}

	/**
	 * Returns totalCost.
	 * @return totalCost
	 */
	public Integer getTotalCost() {
		return this.totalCost;
	}

	/**
	 * Sets a value to attribute totalCost.
	 * @param newTotalCost
	 */
	public void setTotalCost(Integer newTotalCost) {
		this.totalCost = newTotalCost;
	}

	/**
	 * Returns purchasedItems.
	 * @return purchasedItems
	 */
	public String getPurchasedItems() {
		return this.purchasedItems;
	}

	/**
	 * Sets a value to attribute purchasedItems.
	 * @param newPurchasedItems
	 */
	public void setPurchasedItems(String newPurchasedItems) {
		this.purchasedItems = newPurchasedItems;
	}

}

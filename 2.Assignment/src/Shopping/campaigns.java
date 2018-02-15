
package Shopping;
/**
 *  campaigns is in Shopping package.
 *  This class is containing campaigns's property.
 * 
 * @author Damla Unal
 */
public class campaigns {
	/**
	 * startDate is a campaign's property.
	 */
	public String startDate ;

	/**
	 * endDate is a campaign's property..
	 */
	public String endDate ;

	/**
	 * item_Type is a campaign's property.
	 */
	public String item_Type ;

	/**
	 * discount_rate is a campaign's property..
	 */
	public String discount_rate ;

	/**
	 * The constructor has 4 parameter.
	 * It is creating new campaigns object.
	 * @param startDate Campaign's Start Date.
	 * @param endDate Campaign's End Date.
	 * @param itemtype item type.
	 * @param rate Discount rate.
	 */
	public campaigns(String startDate, String endDate, String itemtype,String rate) {
		this.startDate=startDate;
		this.endDate=endDate;
		this.item_Type=itemtype;
		this.discount_rate=rate;
		
	}

	/**
	 * Returns startDate.
	 * @return startDate
	 */
	public String getStartDate() {
		return this.startDate;
	}

	/**
	 * Sets a value to attribute startDate.
	 * @param newStartDate
	 */
	public void setStartDate(String newStartDate) {
		this.startDate = newStartDate;
	}

	/**
	 * Returns endDate.
	 * @return endDate
	 */
	public String getEndDate() {
		return this.endDate;
	}

	/**
	 * Sets a value to attribute endDate.
	 * @param newEndDate
	 */
	public void setEndDate(String newEndDate) {
		this.endDate = newEndDate;
	}

	/**
	 * Returns item_Type.
	 * @return item_Type
	 */
	public String getItem_Type() {
		return this.item_Type;
	}

	/**
	 * Sets a value to attribute item_Type.
	 * @param newItem_Type
	 */
	public void setItem_Type(String newItem_Type) {
		this.item_Type = newItem_Type;
	}

	/**
	 * Returns discount_rate.
	 * @return discount_rate
	 */
	public String getDiscount_rate() {
		return this.discount_rate;
	}

	/**
	 * Sets a value to attribute discount_rate.
	 * @param newDiscount_rate
	 */
	public void setDiscount_rate(String newDiscount_rate) {
		this.discount_rate = newDiscount_rate;
	}

}

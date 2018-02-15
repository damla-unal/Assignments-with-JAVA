
package Items;

import Items.electronic;

/**
 * tv is a electronic.
 * This class is containing tv's property.
 * 
 * @author Damla Unal
 */
public class tv extends electronic {
	/**
	 *screenSize is a tv's property.
	 */
	private String screenSize ;

	/**
	 * The constructor 6 parameter.
	 * It is creating new tv object.
	 *@param cost item's price.
	 *@param manufacturer Manufacturer.
	 *@param brand item's brand.
	 *@param maxVolt Max Volt.
	 *@param maxWatt Max Watt.
	 *@param screenSize Screen Size.
	 */
	public tv(String cost, String manufacturer,String brand,String maxVolt,String maxWatt,String screenSize) {
		super(cost,manufacturer,brand,maxVolt,maxWatt);
		setScreenSize(screenSize);
		
	}

	/**
	 * Returns screenSize.
	 * @return screenSize
	 */
	public String getScreenSize() {
		return this.screenSize;
	}

	/**
	 * Sets a value to attribute screenSize.
	 * @param newScreenSize
	 */
	public void setScreenSize(String newScreenSize) {
		this.screenSize = newScreenSize;
	}

}

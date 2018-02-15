
package Items;

import Items.electronic;

/**
 *  smartphone is a electronic.
 *  This class is containing smartphone's property.
 * 
 * @author Damla Unal
 */
public class smartphone extends electronic {
	/**
	 * screenType is a smartphone's property.
	 */
	private String screenType;

	/**
	 * The constructor has 6 parameter.
	 * It is creating new smartphone object.
	 * @param cost item's price.
	 * @param manufacturer Manufacturer.
	 * @param brand item's brand.
	 * @param maxVolt Max Volt.
	 * @param maxWatt Max Watt.
	 * @param screenType Screen Type.
	 */
	public smartphone(String cost, String manufacturer,String brand,String maxVolt,String maxWatt,String screenType) {
		super(cost,manufacturer,brand,maxVolt,maxWatt);
		setScreenType(screenType);
	}

	/**
	 * Returns screenType.
	 * @return screenType
	 */
	public String getScreenType() {
		return this.screenType;
	}

	/**
	 * Sets a value to attribute screenType.
	 * @param newScreenType
	 */
	public void setScreenType(String newScreenType) {
		this.screenType = newScreenType;
	}

}

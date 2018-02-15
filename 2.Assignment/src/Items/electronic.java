
package Items;

import Items.Items;

/**
 * electronic is a Items.
 * electronic is a Items's subclass.
 * 
 * @author Damla Unal
 */
public class electronic extends Items {
	/**
	 * manufacturer is a electronic's property.
	 */
	private String manufacturer;

	/**
	 *brand is a electronic's property.
	 */
	private String brand ;

	/**
	 * maxVolt is a electronic's property.
	 */
	private String maxVolt;

	/**
	 * maxWatt is a electronic's property.
	 */
	private String maxWatt;

	/**
	 * The constructor has 5 parameter.
	 * It is creating new electronic object.
	 *@param  price item's price.
	 *@param manufacturer Manufacturer.
	 *@param brand item's brand.
	 *@param maxVolt Max Volt.
	 *@param maxWatt Max Watt.
	 */
	public electronic(String price,String manufacturer,String brand,String maxVolt,String maxWatt ) {
		super(price);
		setManufacturer(manufacturer);
		setBrand(brand);
		setMaxVolt(maxVolt);
		setMaxWatt(maxWatt);	
	}

	/**
	 * Returns manufacturer.
	 * @return manufacturer
	 */
	public String getManufacturer() {
		return this.manufacturer;
	}

	/**
	 * Sets a value to attribute manufacturer.
	 * @param newManufacturer
	 */
	public void setManufacturer(String newManufacturer) {
		this.manufacturer = newManufacturer;
	}

	/**
	 * Returns brand.
	 * @return brand
	 */
	public String getBrand() {
		return this.brand;
	}

	/**
	 * Sets a value to attribute brand.
	 * @param newBrand
	 */
	public void setBrand(String newBrand) {
		this.brand = newBrand;
	}

	/**
	 * Returns maxVolt.
	 * @return maxVolt
	 */
	public String getMaxVolt() {
		return this.maxVolt;
	}

	/**
	 * Sets a value to attribute maxVolt.
	 * @param newMaxVolt
	 */
	public void setMaxVolt(String newMaxVolt) {
		this.maxVolt = newMaxVolt;
	}

	/**
	 * Returns maxWatt.
	 * @return maxWatt
	 */
	public String getMaxWatt() {
		return this.maxWatt;
	}

	/**
	 * Sets a value to attribute maxWatt.
	 * @param newMaxWatt
	 */
	public void setMaxWatt(String newMaxWatt) {
		this.maxWatt = newMaxWatt;
	}

}

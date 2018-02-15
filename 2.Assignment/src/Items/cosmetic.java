
package Items;

import java.nio.channels.NetworkChannel;

import Items.Items;

/**
 * cosmetic is a Item's subclass.
 * it's parent Items.
 * 
 * @author Damla Unal
 */
public class cosmetic extends Items {
	/**
	 * cosmetic has a expiration_date.
	 */
	private String expiration_date;

	/**
	 * cosmetic has a weight.
	 */
	private String weight;

	/**
	 * cosmetic has a organic
	 */
	private String organic ;

	/**
	 * cosmetic has a manufacturer.
	 */
	private String manufacturer;

	/**
	 * cosmetic has a brand.
	 */
	private String brand;

	/**
	 * The constructor has 6 parameter.
	 * its creating new cosmetic object.
	 * @param price item's price.
	 * @param manufacturer Manufacturer.
	 * @param brand item's brand.
	 * @param organic is item organic or not organic.
	 * @param exp_date Expiration Date.
	 * @param weight item's weight.
	 */
	public cosmetic(String price,String manufacturer,String brand,String organic,String exp_date,String weight) {
		super(price);
		setExpiration_date(exp_date);
		setWeight(weight);
		setOrganic(organic);
		setManufacturer(manufacturer);
		setBrand(brand);
	}

	/**
	 * Returns expiration_date.
	 * @return expiration_date
	 */
	public String getExpiration_date() {
		return this.expiration_date;
	}

	/**
	 * Sets a value to attribute expiration_date.
	 * @param newExpiration_date
	 */
	public void setExpiration_date(String newExpiration_date) {
		this.expiration_date = newExpiration_date;
	}

	/**
	 * Returns weight.
	 * @return weight
	 */
	public String getWeight() {
		return this.weight;
	}

	/**
	 * Sets a value to attribute weight.
	 * @param newWeight
	 */
	public void setWeight(String newWeight) {
		this.weight = newWeight;
	}

	/**
	 * Returns organic.
	 * @return organic
	 */
	public String getOrganic() {
		return this.organic;
	}

	/**
	 * Sets a value to attribute organic.
	 * newOrganic can be Yes or No.
	 * @param newOrganic
	 */
	public void setOrganic(String newOrganic) {
		if(newOrganic.equals("1")){
			newOrganic="Yes";
		}
		else{
			newOrganic="No";
		}
		this.organic = newOrganic;
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

}

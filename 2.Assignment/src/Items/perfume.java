
package Items;

import Items.cosmetic;

/**
 * perfume is a cosmetic.
 * This class is containing perfume's property.
 * 
 * @author Damla Unal
 */
public class perfume extends cosmetic {
	/**
	 * lastingduration is perfume's property.
	 */
	private String lastingduration;

	/**
	 * The constructor has 7 parameters.
	 * It is creating new perfume object.
	 * @param cost item's price.
	 * @param manufacturer Manufacturer.
	 * @param brand item's brand.
	 * @param isOrganic is item organic or not organic.
	 * @param expirationYear Expiration Date.
	 * @param weight item's weight. 
	 * @param lastingDuration Lasting Duration.
	 */
	public perfume(String cost, String manufacturer,String brand,String isOrganic,String expirationYear,String weight,String lastingDuration) {
		
		super(cost,manufacturer,brand,isOrganic,expirationYear,weight);
		setLastingduration(lastingDuration);
		
	}

	/**
	 * Returns lastingduration.
	 * @return lastingduration
	 */
	public String getLastingduration() {
		return this.lastingduration;
	}

	/**
	 * Sets a value to attribute lastingduration.
	 * @param newLastingduration
	 */
	public void setLastingduration(String newLastingduration) {
		this.lastingduration = newLastingduration;
	}

}

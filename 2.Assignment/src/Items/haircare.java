
package Items;

import Items.cosmetic;

/**
 * haircare is a cosmetic.
 * haircare is cosmetic's subclass
 * 
 * @author Damla Unal
 */
public class haircare extends cosmetic {
	/**
	 * isMedicated is a haircare's property.
	 */
	private String isMedicated;

	/**
	 * The constructor has 7 parameter.
	 * It is creating new haircare objects.
	 * @param cost item's price.
	 * @param manufacturer Manufacturer.
	 * @param brand items brand.
	 * @param isOrganic is item organic or not organic.
	 * @param expirationYear Expiration Date.
	 * @param weight item's weight.
	 * @param isMedicated is item medicated or not medicated.
	 */
	public haircare(String cost, String manufacturer,String brand,String isOrganic,
			String expirationYear,String weight,String isMedicated) {
		super(cost,manufacturer,brand,isOrganic,expirationYear,weight);
		setIsMedicated(isMedicated);
		
	}

	/**
	 * Returns isMedicated.
	 * @return isMedicated
	 */
	public String getIsMedicated() {
		return this.isMedicated;
	}

	/**
	 * Sets a value to attribute isMedicated. 
	 * @param newIsMedicated
	 * newIsMedicated can be Yes or No.
	 */
	public void setIsMedicated(String newIsMedicated) {
		if(newIsMedicated.equals("1")){
			newIsMedicated="Yes";
		}
		else{
			newIsMedicated="No";
		}
		this.isMedicated = newIsMedicated;
	}

}

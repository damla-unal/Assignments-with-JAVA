package Items;

import Items.cosmetic;

/**
 * skincare is a cosmetic.
 * This class is containing skincare's property.
 * 
 * @author Damla Unal
 */
public class skincare extends cosmetic {
	/**
	 *babysensetive is a skincare's property.
	 */
	private String babysensetive;

	/**
	 * The constructor has 7 parameter.
	 * It is creating new skincare object.
	 * @param cost item's price.
	 * @param manufacturer Manufacturer.
	 * @param brand item's brand.
	 * @param isOrganic is item organic or not organic.
	 * @param expirationYear Expiration Date.
	 * @param weight item's weight.
	 * @param babySensetive is item baby sensetive or not.
	 */
	public skincare(String cost, String manufacturer,String brand,String isOrganic,String expirationYear,String weight,String babySensetive) {
		super(cost,manufacturer,brand,isOrganic,expirationYear,weight);
		setBabysensetive(babySensetive);
	}

	/**
	 * Returns babysensetive.
	 * @return babysensetive
	 */
	public String getBabysensetive() {
		return this.babysensetive;
	}

	/**
	 * Sets a value to attribute babysensetive.
	 * @param babySensetive2
	 */
	public void setBabysensetive(String babySensetive2) {
		if(babySensetive2.equals("1")){
			babySensetive2="Yes";
		}
		else{
			babySensetive2="No";
		}
		this.babysensetive = babySensetive2;
	}

}

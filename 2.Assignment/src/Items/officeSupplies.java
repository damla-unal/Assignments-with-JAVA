
package Items;

import java.util.ArrayList;

import Items.Items;

/**
 * officeSupplies is a Items.
 * This class officeSupplies's property.
 * 
 * @author Damla Unal
 */
public class officeSupplies extends Items {
	/**
	 * releaseDate is officeSupplies property.
	 */
	private String releaseDate;

	/**
	 * coverTitle is officeSupplies property.
	 */
	private String coverTitle;

	/**
	 * The constructor has 3 parameter.
	 * It is creating new officeSupplies object.
	 * @param price item's price.
	 * @param releaseDate Release Date.
	 * @param coverTitle Cover Title.
	 */
	public officeSupplies(String price,String releaseDate,String coverTitle) {
		super(price);
		setCoverTitle(coverTitle);
		setReleaseDate(releaseDate);
	}
	
	/**
	 * Returns releaseDate.
	 * @return releaseDate
	 */
	public String getReleaseDate() {
		return this.releaseDate;
	}

	/**
	 * Sets a value to attribute releaseDate.
	 * @param releasedate2
	 */
	public void setReleaseDate(String releasedate2) {
		this.releaseDate = releasedate2;
	}

	/**
	 * Returns coverTitle.
	 * @return coverTitle
	 */
	public String getCoverTitle() {
		return this.coverTitle;
	}

	/**
	 * Sets a value to attribute coverTitle.
	 * @param newCoverTitle
	 */
	public void setCoverTitle(String newCoverTitle) {
		this.coverTitle = newCoverTitle;
	}

}

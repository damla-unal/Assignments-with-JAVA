
package Items;

import Items.computer;

/**
 * tablet is a computer.
 * This class is containing tablet's property.
 * 
 * @author Damla Unal
 */
public class tablet extends computer {
	/**
	 *dimension is tablet's property.
	 */
	private String dimension;

	/**
	 * The constructor has 10 parameter.
	 * It is creating new tablet object.
	 * @param cost item's price.
	 * @param manufacturer Manufacturer.
	 * @param brand item's brand.
	 * @param maxVolt Max Volt.
	 * @param maxWatt Max Watt.
	 * @param operatingSystem Operating System.
	 * @param cpuType CPU Type.
	 * @param ramCapacity RAM Capacity.
	 * @param hddCapacity HDD Capacity.
	 * @param dimension Dimension.
	 */
	public tablet(String cost, String manufacturer,String brand,String maxVolt,String maxWatt,
			String operatingSystem,String cpuType,String ramCapacity,String hddCapacity,String dimension) {
		super(cost,manufacturer,brand,maxVolt,maxWatt,operatingSystem,cpuType,ramCapacity,hddCapacity);
		setDimension(dimension);
	}

	/**
	 * Returns dimension.
	 * @return dimension
	 */
	public String getDimension() {
		return this.dimension;
	}

	/**
	 * Sets a value to attribute dimension.
	 * @param dimension2
	 */
	public void setDimension(String dimension2) {
		this.dimension = dimension2;
	}

}

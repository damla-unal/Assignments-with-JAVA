
package Items;

import Items.computer;

/**
 * desktop is a computer.It is a subclass.
 * desktop's parent is a computer.
 * @author Damla Unal
 */
public class desktop extends computer {
	/**
	 * desktop has a boxcolor.
	 */
	private String boxcolor;

	/**
	 * The constructor has 10 parameter.
	 * Its creating new desktop objects.
	 * @param cost item's price.
	 * @param manufacturer Manufacturer.
	 * @param brand item's brand.
	 * @param maxVolt Max Volt.
	 * @param maxWatt Max Watt.
	 * @param operatingSystem Operating System.
	 * @param cpuType CPU Type.
	 * @param ramCapacity RAM Capacity.
	 * @param hddCapacity HDD Capacity.
	 * @param boxColor Box Color.
	 */
	public desktop(String cost, String manufacturer,String brand,String maxVolt,String maxWatt,
			String operatingSystem,String cpuType,String ramCapacity,String hddCapacity,String boxColor) {
		super(cost,manufacturer,brand,maxVolt,maxWatt,operatingSystem,cpuType,ramCapacity,hddCapacity);
		setBoxcolor(boxColor);
		
	}
	/**
	 * Returns boxcolor.
	 * @return boxcolor
	 */
	public String getBoxcolor() {
		return this.boxcolor;
	}

	/**
	 * Sets a value to attribute boxcolor.
	 * @param newBoxcolor
	 */
	public void setBoxcolor(String newBoxcolor) {
		this.boxcolor = newBoxcolor;
	}

}

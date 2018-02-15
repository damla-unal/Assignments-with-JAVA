
package Items;

import Items.computer;

/**
 * laptop is a computer.
 * It's parent is computer.
 * This class is containing laptop's property.
 * 
 * @author Damla Unal
 */
public class laptop extends computer {
	/**
	 * HDMIsupport is a laptop's property.
	 */
	private String HDMIsupport;

	/**
	 * The constructor has 10 parameter.
	 * @param cost item's price.
	 * @param manufacturer Manufacturer.
	 * @param brand item's brand.
	 * @param maxVolt Max Volt.
	 * @param maxWatt Max Watt.
	 * @param operatingSystem Operating System.
	 * @param cpuType CPU Type.
	 * @param ramCapacity RAM Capacity.
	 * @param hddCapacity HDD Capacity.
	 */
	public laptop(String cost, String manufacturer,String brand,String maxVolt,String maxWatt,
			String operatingSystem,String cpuType,String ramCapacity,String hddCapacity,String HDMISupport) {
		super(cost,manufacturer,brand,maxVolt,maxWatt,operatingSystem,cpuType,ramCapacity,hddCapacity);
		setHDMIsupport(HDMISupport);
		
	}

	/**
	 * Returns HDMIsupport.
	 * @return HDMIsupport
	 */
	public String getHDMIsupport() {
		return this.HDMIsupport;
	}

	/**
	 * Sets a value to attribute HDMIsupport. 
	 * @param newHDMIsupport
	 */
	public void setHDMIsupport(String newHDMIsupport) {
		if(newHDMIsupport.equals("1")){
			newHDMIsupport="Yes";
		}
		else{
			newHDMIsupport="No";
		}
		this.HDMIsupport = newHDMIsupport;
	}

}

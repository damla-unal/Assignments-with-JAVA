
package Items;

import Items.electronic;

/**
 * computer is a electronic.At the same time computer is a superclass,its child desktop,tablet..
 * 
 * @author Damla Unal
 */
public class computer extends electronic {
	/**
	 *  computer's operatingSystem .
	 */
	private String operatingSystem ;

	/**
	 * computer's CPUtype.
	 */
	private String CPUtype;

	/**
	 * computer's ramCapacity.
	 */
	public String ramCapacity;

	/**
	 * computer's HDDcapacity.
	 */
	private String HDDcapacity;


	/**
	 * The constructor has 9 parameter.
	 * @param cost price.
	 * @param manufacturer manufacturer.
	 * @param brand brand.
	 * @param maxVolt Max Volt.
	 * @param maxWatt Max Watt.
	 * @param o_system Operating System.
	 * @param cputype CPU Type.
	 * @param ramcapacity RAM Capacity.
	 * @param hddcapacity HDD Capacity.
	 * Firstly super(cost,manufacturer,brand,maxVolt,maxWatt) running. Then creating computer objects.
	 */
	public computer(String cost,String manufacturer,String brand,String maxVolt,String maxWatt,String o_system,String cputype,
			String ramcapacity,String hddcapacity) {

		super(cost,manufacturer,brand,maxVolt,maxWatt);
		setOperatingSystem(o_system);
		setCPUtype(cputype);
		setRamCapacity(ramcapacity);
		setHDDcapacity(hddcapacity);	
	}

	/**
	 * Returns operatingSystem.
	 * @return operatingSystem
	 */
	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	/**
	 * Sets a value to attribute operatingSystem. 
	 * @param newOperatingSystem
	 */
	public void setOperatingSystem(String newOperatingSystem) {
		this.operatingSystem = newOperatingSystem;
	}

	/**
	 * Returns CPUtype.
	 * @return CPUtype
	 */
	public String getCPUtype() {
		return this.CPUtype;
	}

	/**
	 * Sets a value to attribute CPUtype. 
	 * @param newCPUtype
	 */
	public void setCPUtype(String newCPUtype) {
		this.CPUtype = newCPUtype;
	}

	/**
	 * Returns ramCapacity.
	 * @return ramCapacity
	 */
	public String getRamCapacity() {
		return this.ramCapacity;
	}

	/**
	 * Sets a value to attribute ramCapacity.
	 * @param newRamCapacity
	 */
	public void setRamCapacity(String newRamCapacity) {
		this.ramCapacity = newRamCapacity;
	}

	/**
	 * Returns HDDcapacity.
	 * @return HDDcapacity
	 */
	public String getHDDcapacity() {
		return this.HDDcapacity;
	}

	/**
	 * Sets a value to attribute HDDcapacity.
	 * @param newHDDcapacity
	 */
	public void setHDDcapacity(String newHDDcapacity) {
		this.HDDcapacity = newHDDcapacity;
	}

}

/**
 * This class's name Location.
 * 
 * @author Damla Unal
 */
public class Location {
	/**
	 * Location's property longlude.
	 */
	public double longlude;
	/**
	 * Location's property attidude.
	 */
	public double attidude;

	/**
	 * That Location's constructor.
	 * @param longlude
	 * @param attidude
	 */
	public Location(double longlude,double attidude){
		setLonglude(longlude);
		setAttidude(attidude);
	}
	
	/**
	 * Returns longlude.
	 * @return longlude
	 */
	public double getLonglude() {
		return this.longlude;
	}

	/**
	 * Sets a value to attribute longlude.
	 * @param newLonglude
	 */
	public void setLonglude(double newLonglude) {
		this.longlude = newLonglude;
	}
	/**
	 * Returns attidude.
	 * @return attidude
	 */
	public double getAttidude() {
		return this.attidude;
	}

	/**
	 * Sets a value to attribute attidude.
	 * @param newAttidude
	 */
	public void setAttidude(double newAttidude) {
		this.attidude = newAttidude;
	}

}

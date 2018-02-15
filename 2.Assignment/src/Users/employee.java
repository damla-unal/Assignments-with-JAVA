
package Users;

import java.util.ArrayList;

import Items.Items;
import Items.book;
import Items.cd_dvd;
import Items.desktop;
import Items.haircare;
import Items.laptop;
import Items.perfume;
import Items.skincare;
import Items.smartphone;
import Items.tablet;
import Items.tv;
import Users.Users;

/**
 * employee is a user.
 * This class is containing employee's property and methods.
 * 
 * @author Damla Unal
 */
public class employee extends Users {
	/**
	 *  salary is a employee's property.
	 */
	public String salary ;

	/**
	 * The constructor has 3 parameter.
	 * It is creating new employee object.
	 * @param name employee's name.
	 * @param email employee's email.
	 * @param date_birth employee's date of birth.
	 */
	public employee(String name,String email,String date_birth) {
		super(name,email,date_birth);
	}
	

	/**
	 * SHOWITEMSLOWONSTOCK.
	 * @param name
	 * @param maxStock
	 */
	public void SHOWITEMSLOWONSTOCK(String name, int maxStock) {

	}

	/**
	 * SHOWITEMSLOWONSTOCK.
	 */
	public void SHOWITEMSLOWONSTOCK() {
	}

	/**
	 * LISTITEM , Service providers or employees can list the existing items with their information in detail.
	 * @param itemList It is a ArrayList.its contains items.
	 */
	public void LISTITEM(ArrayList<Items>itemList ) {
			for(Items str:itemList){
			
			if(str instanceof book)	{
				
					System.out.println("-------------------------------------------------");
					System.out.println("Type: Book ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Release Date: "+((book)str).getReleaseDate());
					System.out.println("Title: "+((book)str).getCoverTitle());
					System.out.println("Publishe: "+((book)str).getPublisherName());
					System.out.println("Authors: "+((book)str).getAuthors());
					System.out.println("Page: "+((book)str).pageNumber+" pages");
			}
			else if(str instanceof cd_dvd)	{
					System.out.println("-------------------------------------------------");
					System.out.println("Type: CDDVD ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Release Date: "+((cd_dvd)str).getReleaseDate());
					System.out.println("Title: "+((cd_dvd)str).getCoverTitle());
					System.out.println("Songs: "+((cd_dvd)str).getSongs());
					System.out.println("Composer: "+((cd_dvd)str).getComposerName());
				}
				
			else if(str instanceof desktop){
					System.out.println("-------------------------------------------------");
					System.out.println("Type: Desktop ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Manufacturer: "+((desktop)str).getManufacturer());
					System.out.println("Brand: "+((desktop)str).getBrand());
					System.out.println("Max Volt: "+((desktop)str).getMaxVolt()+" V.");
					System.out.println("Max Watt: "+((desktop)str).getMaxWatt()+" W.");
					System.out.println("Operating System: "+((desktop)str).getOperatingSystem());
					System.out.println("CPU Type: "+((desktop)str).getCPUtype());
					System.out.println("RAM Capacity: "+((desktop)str).getRamCapacity()+" GB");
					System.out.println("HDD Capacity: "+((desktop)str).getHDDcapacity()+" GB");
					System.out.println("Box Color: "+((desktop)str).getBoxcolor());
				}
				
			else if(str instanceof laptop){
					System.out.println("-------------------------------------------------");
					System.out.println("Type: Laptop ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Manufacturer: "+((laptop)str).getManufacturer());
					System.out.println("Brand: "+((laptop)str).getBrand());
					System.out.println("Max Volt: "+((laptop)str).getMaxVolt()+" V.");
					System.out.println("Max Watt: "+((laptop)str).getMaxWatt()+" W.");
					System.out.println("Operating System: "+((laptop)str).getOperatingSystem());
					System.out.println("CPU Type: "+((laptop)str).getCPUtype());
					System.out.println("RAM Capacity: "+((laptop)str).getRamCapacity()+" GB");
					System.out.println("HDD Capacity: "+((laptop)str).getHDDcapacity()+" GB");
					System.out.println("HDMI support: "+((laptop)str).getHDMIsupport());	
				}
			else if(str instanceof tablet){
					System.out.println("-------------------------------------------------");
					System.out.println("Type: Tablet ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Manufacturer: "+((tablet)str).getManufacturer());
					System.out.println("Brand: "+((tablet)str).getBrand());
					System.out.println("Max Volt: "+((tablet)str).getMaxVolt()+" V.");
					System.out.println("Max Watt: "+((tablet)str).getMaxWatt()+" W.");
					System.out.println("Operating System: "+((tablet)str).getOperatingSystem());
					System.out.println("CPU Type: "+((tablet)str).getCPUtype());
					System.out.println("RAM Capacity: "+((tablet)str).getRamCapacity()+" GB");
					System.out.println("HDD Capacity: "+((tablet)str).getHDDcapacity()+" GB");
					System.out.println("Dimension: "+((tablet)str).getDimension()+" in.");
				}
				
			else if(str instanceof tv){
					System.out.println("-------------------------------------------------");
					System.out.println("Type: TV ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Manufacturer: "+((tv)str).getManufacturer());
					System.out.println("Brand: "+((tv)str).getBrand());
					System.out.println("Max Volt: "+((tv)str).getMaxVolt()+" V.");
					System.out.println("Max Watt: "+((tv)str).getMaxWatt()+" W.");
					System.out.println("Screen Size: "+((tv)str).getScreenSize()+" \"");
				}
			else if(str instanceof smartphone){
					System.out.println("-------------------------------------------------");
					System.out.println("Type: SmartPhone ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Manufacturer: "+((smartphone)str).getManufacturer());
					System.out.println("Brand: "+((smartphone)str).getBrand());
					System.out.println("Max Volt: "+((smartphone)str).getMaxVolt()+" V.");
					System.out.println("Max Watt: "+((smartphone)str).getMaxWatt()+" W.");
					System.out.println("Screen Type: "+((smartphone)str).getScreenType());
				}
			else if(str instanceof haircare){	
					System.out.println("-------------------------------------------------");
					System.out.println("Type: HairCare ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Manufacturer: "+((haircare)str).getManufacturer());
					System.out.println("Brand: "+((haircare)str).getBrand());
					System.out.println("Organic: "+((haircare)str).getOrganic());
					System.out.println("Expiration Date: "+((haircare)str).getExpiration_date());
					System.out.println("Weight: "+((haircare)str).getWeight()+" g.");
					System.out.println("Medicated: "+((haircare)str).getIsMedicated());
				}
			else if(str instanceof perfume){	
					System.out.println("-------------------------------------------------");
					System.out.println("Type: Perfume ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Manufacturer: "+((perfume)str).getManufacturer());
					System.out.println("Brand: "+((perfume)str).getBrand());
					System.out.println("Organic: "+((perfume)str).getOrganic());
					System.out.println("Expiration Date: "+((perfume)str).getExpiration_date());
					System.out.println("Weight: "+((perfume)str).getWeight()+" g.");
					System.out.println("Lasting Duration: "+((perfume)str).getLastingduration()+" min");
				}
		
			else if(str instanceof skincare){
					System.out.println("-------------------------------------------------");
					System.out.println("Type: SkinCare ");
					System.out.println("Item ID: "+((Items)str).item_id);
					System.out.println("Price: "+Double.parseDouble(((Items)str).getPrice())+" $");
					System.out.println("Manufacturer: "+((skincare)str).getManufacturer());
					System.out.println("Brand: "+((skincare)str).getBrand());
					System.out.println("Organic: "+((skincare)str).getOrganic());
					System.out.println("Expiration Date: "+((skincare)str).getExpiration_date());
					System.out.println("Weight: "+((skincare)str).getWeight()+" g.");
					System.out.println("Baby Sensetive: "+((skincare)str).getBabysensetive());
					
				}
			}
	}

	/**
	 * SHOWVIP.
	 */
	public void SHOWVIP() {
		
	}

	/**
	 * Returns salary.
	 * @return salary
	 */
	public String getSalary() {
		return this.salary;
	}

	/**
	 * Sets a value to attribute salary.
	 * @param newSalary
	 */
	public void setSalary(String newSalary) {
		this.salary = newSalary;
	}

	public String toString(){
		return "Name: "+getName()+"Email: "+getEmail()+" Date of birth :"+getDate_birth()+"Salary : "+salary;
	}
}

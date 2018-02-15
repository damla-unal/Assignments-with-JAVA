
package Users;

import java.util.ArrayList;
import java.util.Arrays;

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
import Users.employee;

/**
 * technician is a employee.
 * This class is containing technician's property and methods
 * 
 * @author Damla Unal
 */
public class technician extends employee {

	protected static String senior;

	/**
	 * The constructor is creating new technician object.
	 * @param t_name technician name.
	 * @param t_mail technician mail.
	 * @param t_bdate technician birth of date.
	 * @param t_salary technician salary.
	 * @param isSenior is technician senior or not.
	 */
	public technician(String t_name, String t_mail, String t_bdate, String t_salary, String isSenior) {
		super(t_name, t_mail, t_bdate);
		setSalary(t_salary);
		setSenior(isSenior);

	}

	/**
	 * Returns senior.
	 * 
	 * @return senior
	 */
	public String getSenior() {
		return this.senior;
	}

	/**
	 * Sets a value to attribute senior.
	 * 
	 * @param isSenior
	 */
	public static void setSenior(String isSenior) {
		senior = isSenior;
	}

	/**
	 * SHOWORDERS.
	 * 
	 * @param t_name
	 */
	public void SHOWORDERS(String t_name) {

	}

	/**
	 * DISPITEMOF, A technician can display sub-items.
	 * @param itemList Its ArrayList. its contains items.
	 * @param itemType item Type.
	 */
	public void DISPITEMOF(ArrayList<Items>itemList,String itemType) {
		String[] type = itemType.split(":");
		for (String i : type) {
			if (i.equals("BOOK")) {
				for (Items str : itemList) {
					if (str instanceof book) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: BOOK ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Release Date: " + ((book) str).getReleaseDate());
						System.out.println("Title: " + ((book) str).getCoverTitle());
						System.out.println("Publishe: " + ((book) str).getPublisherName());
						System.out.println("Authors: " + ((book) str).getAuthors());
						System.out.println("Page: " + ((book) str).pageNumber + " pages");
					}
				}
			}
			if (i.equals("CDDVD")) {
				for (Items str : itemList) {
					if (str instanceof cd_dvd) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: CDDVD ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Release Date: " + ((cd_dvd) str).getReleaseDate());
						System.out.println("Title: " + ((cd_dvd) str).getCoverTitle());
						System.out.println("Songs: " + ((cd_dvd) str).getSongs());
						System.out.println("Composer: " + ((cd_dvd) str).getComposerName());
					}
				}
			}
			if (i.equals("DESKTOP")) {
				for (Items str : itemList) {
					if (str instanceof desktop) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: Desktop ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Manufacturer: " + ((desktop) str).getManufacturer());
						System.out.println("Brand: " + ((desktop) str).getBrand());
						System.out.println("Max Volt: " + ((desktop) str).getMaxVolt() + " V.");
						System.out.println("Max Watt: " + ((desktop) str).getMaxWatt() + " W.");
						System.out.println("Operating System: " + ((desktop) str).getOperatingSystem());
						System.out.println("CPU Type: " + ((desktop) str).getCPUtype());
						System.out.println("RAM Capacity: " + ((desktop) str).getRamCapacity() + " GB");
						System.out.println("HDD Capacity: " + ((desktop) str).getHDDcapacity() + " GB");
						System.out.println("Box Color: " + ((desktop) str).getBoxcolor());
					}
				}
			}
			if (i.equals("LAPTOP")) {
				for (Items str : itemList) {
					if (str instanceof laptop) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: Laptop ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Manufacturer: " + ((laptop) str).getManufacturer());
						System.out.println("Brand: " + ((laptop) str).getBrand());
						System.out.println("Max Volt: " + ((laptop) str).getMaxVolt() + " V.");
						System.out.println("Max Watt: " + ((laptop) str).getMaxWatt() + " W.");
						System.out.println("Operating System: " + ((laptop) str).getOperatingSystem());
						System.out.println("CPU Type: " + ((laptop) str).getCPUtype());
						System.out.println("RAM Capacity: " + ((laptop) str).getRamCapacity() + " GB");
						System.out.println("HDD Capacity: " + ((laptop) str).getHDDcapacity() + " GB");
						System.out.println("HDMI support: " + ((laptop) str).getHDMIsupport());
					}
				}
			}
			if (i.equals("TABLET")) {
				for (Items str : itemList) {
					if (str instanceof tablet) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: Tablet ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Manufacturer: " + ((tablet) str).getManufacturer());
						System.out.println("Brand: " + ((tablet) str).getBrand());
						System.out.println("Max Volt: " + ((tablet) str).getMaxVolt() + " V.");
						System.out.println("Max Watt: " + ((tablet) str).getMaxWatt() + " W.");
						System.out.println("Operating System: " + ((tablet) str).getOperatingSystem());
						System.out.println("CPU Type: " + ((tablet) str).getCPUtype());
						System.out.println("RAM Capacity: " + ((tablet) str).getRamCapacity() + " GB");
						System.out.println("HDD Capacity: " + ((tablet) str).getHDDcapacity() + " GB");
						System.out.println("Dimension: " + ((tablet) str).getDimension() + " in.");
					}
				}
			}
			if (i.equals("TV")) {
				for (Items str : itemList) {
					if (str instanceof tv) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: TV ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Manufacturer: " + ((tv) str).getManufacturer());
						System.out.println("Brand: " + ((tv) str).getBrand());
						System.out.println("Max Volt: " + ((tv) str).getMaxVolt() + " V.");
						System.out.println("Max Watt: " + ((tv) str).getMaxWatt() + " W.");
						System.out.println("Screen Size: " + ((tv) str).getScreenSize() + " \"");
					}
				}
			}
			if (i.equals("SMARTPHONE")) {
				for (Items str : itemList) {
					if (str instanceof smartphone) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: SmartPhone ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Manufacturer: " + ((smartphone) str).getManufacturer());
						System.out.println("Brand: " + ((smartphone) str).getBrand());
						System.out.println("Max Volt: " + ((smartphone) str).getMaxVolt() + " V.");
						System.out.println("Max Watt: " + ((smartphone) str).getMaxWatt() + " W.");
						System.out.println("Screen Type: " + ((smartphone) str).getScreenType());
					}
				}
			}
			if (i.equals("HAIRCARE")) {
				for (Items str : itemList) {
					if (str instanceof haircare) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: HairCare ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Manufacturer: " + ((haircare) str).getManufacturer());
						System.out.println("Brand: " + ((haircare) str).getBrand());
						System.out.println("Organic: " + ((haircare) str).getOrganic());
						System.out.println("Expiration Date: " + ((haircare) str).getExpiration_date());
						System.out.println("Weight: " + ((haircare) str).getWeight() + " g.");
						System.out.println("Medicated: " + ((haircare) str).getIsMedicated());
					}
				}
			}
			if (i.equals("PERFUME")) {
				for (Items str : itemList) {
					if (str instanceof perfume) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: Perfume ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Manufacturer: " + ((perfume) str).getManufacturer());
						System.out.println("Brand: " + ((perfume) str).getBrand());
						System.out.println("Organic: " + ((perfume) str).getOrganic());
						System.out.println("Expiration Date: " + ((perfume) str).getExpiration_date());
						System.out.println("Weight: " + ((perfume) str).getWeight() + " g.");
						System.out.println("Lasting Duration: " + ((perfume) str).getLastingduration() + " min");
					}
				}
			}
			if (i.equals("SKINCARE")) {
				for (Items str : itemList) {
					if (str instanceof skincare) {
						System.out.println("-------------------------------------------------");
						System.out.println("Type: SkinCare ");
						System.out.println("Item ID: " + ((Items) str).item_id);
						System.out.println("Price: " + Double.parseDouble(((Items) str).getPrice()) + " $");
						System.out.println("Manufacturer: " + ((skincare) str).getManufacturer());
						System.out.println("Brand: " + ((skincare) str).getBrand());
						System.out.println("Organic: " + ((skincare) str).getOrganic());
						System.out.println("Expiration Date: " + ((skincare) str).getExpiration_date());
						System.out.println("Weight: " + ((skincare) str).getWeight() + " g.");
						System.out.println("Baby Sensetive: " + ((skincare) str).getBabysensetive());
					}
				}
			}
		}
	}

	/**
	 * ADDITEM,  Only technicians are authorized to add new items to the system.
	 * @param itemList its a ArrayList. its contains items.
	 * @param a_itemtype its a array.
	 */
	public void ADDITEM(ArrayList<Items> itemList, String[] a_itemtype) {
		String[] types = { "BOOK", "CDDVD", "DESKTOP", "LAPTOP", "TABLET", "TV", "SMARTPHONE", "HAIRCARE", "SKINCARE",
				"PERFUME" };
		boolean condition = true;

		for (int i = 0; i < types.length; i++) {
			if (a_itemtype[0].equals(types[i])) {
				switch (a_itemtype[0]) {
				case "BOOK":
					itemList.add(new book(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5],
							a_itemtype[6]));
					break;
				case "CDDVD":
					itemList.add(new cd_dvd(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5]));
					break;
				case "DESKTOP":
					itemList.add(new desktop(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5],
							a_itemtype[6], a_itemtype[7], a_itemtype[8], a_itemtype[9], a_itemtype[10]));
					break;
				case "LAPTOP":

					itemList.add(new laptop(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5],
							a_itemtype[6], a_itemtype[7], a_itemtype[8], a_itemtype[9], a_itemtype[10]));
					break;
				case "TABLET":
					itemList.add(new tablet(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5],
							a_itemtype[6], a_itemtype[7], a_itemtype[8], a_itemtype[9], a_itemtype[10]));
					break;
				case "TV":
					itemList.add(new tv(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5],
							a_itemtype[6]));

					break;
				case "SMARTPHONE":
					itemList.add(new smartphone(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4],
							a_itemtype[5], a_itemtype[6]));

					break;
				case "HAIRCARE":
					itemList.add(new haircare(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5],
							a_itemtype[6], a_itemtype[7]));

					break;
				case "SKINCARE":
					itemList.add(new perfume(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5],
							a_itemtype[6], a_itemtype[7]));
					break;
				case "PERFUME":
					itemList.add(new skincare(a_itemtype[1], a_itemtype[2], a_itemtype[3], a_itemtype[4], a_itemtype[5],
							a_itemtype[6], a_itemtype[7]));
					break;

				}

				condition = false;
			}

		}
		if (condition)
			System.out.println("No item type " + a_itemtype[0] + " found");

	}
	public String toString(){
		return "Name: "+getName()+"Email: "+getEmail()+" Date of birth :"+getDate_birth()+"Salary : "+salary+"Senior :"+getSenior();
	}

}


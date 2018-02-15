import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
import Shopping.campaigns;
import Users.admin;
import Users.customer;
import Users.technician;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Items> itemList=new ArrayList<Items>();
		ArrayList<Integer> shoppingCart =  new ArrayList<Integer>();
		ArrayList<campaigns> campaings=  new ArrayList<campaigns>();

		ArrayList<admin> adminList =  new ArrayList<admin>();
		ArrayList<customer> customerList =  new ArrayList<customer>();
		ArrayList<technician> techList =  new ArrayList<technician>();
		 String[] arguman={args[0],args[1],args[2]};
		
		 
		userreading(arguman[0],adminList, customerList, techList);
		itemsreading(arguman[1],itemList);
		commandsreading(arguman[2],adminList, customerList, techList,itemList,shoppingCart,campaings);
	}
	/**
	 * The method read user.txt and apply methods
	 * @param arguman user.txt
	 * @param adminList its a arrayList.Its contains admin's property.
	 * @param customerList its a arrayList.Its contains customer's property.
	 * @param techList its a arrayList.Its contains technician's property.
	 */
	public static void userreading(String arguman,ArrayList<admin>adminList,ArrayList<customer>customerList,ArrayList<technician>techList){
		try 
		{       
			 Scanner scanner = new Scanner(new File(arguman));
	
			 while(scanner.hasNextLine())
			 {       
				 String line = scanner.nextLine();	
				 String[] s_line=line.split("	");
				 switch (s_line[0])
				 {
					 case "ADMIN":
						 adminList.add(new admin(s_line[1],s_line[2],s_line[3],s_line[4],s_line[5]));
						 break;
					 case "CUSTOMER":
						 customerList.add(new customer(s_line[1],s_line[2],s_line[3],s_line[4],s_line[5]));
						 break;
					 case "TECH" :
						 techList.add(new technician(s_line[1],s_line[2],s_line[3],s_line[4],s_line[5])); 
						 break;
				 }
			 }scanner.close();
		}catch(Exception e){
		System.out.println("hata : "+e.getMessage());
		}
	}
	/**
	 * items reading read item.txt and apply methods
	 * @param arguman item.txt
	 * @param itemList its a arrayList.Its contains items.
	 */
	public static void itemsreading(String arguman,ArrayList<Items> itemList){
		try 
		{       
			 Scanner scanner = new Scanner(new File(arguman));
			 
			 while(scanner.hasNextLine())
			 {       
				 String line = scanner.nextLine();	
				 String[] s_line=line.split("	");
				 switch (s_line[0])
				 {
				 case "BOOK":
			    	  itemList.add(new book(s_line[1],s_line[2],s_line[3],s_line[4],
			    			  s_line[5],s_line[6]));
			    	  break;
				 case "CDDVD":
					 itemList.add(new cd_dvd(s_line[1],s_line[2],s_line[3],s_line[4],
							 s_line[5]));
					
					 break;
			     case "DESKTOP" :
			    	 itemList.add(new desktop(s_line[1],s_line[2],s_line[3],s_line[4],
			    			  s_line[5],s_line[6],s_line[7],s_line[8],s_line[9],s_line[10]));
			    	  
			    	  break;
			     case "LAPTOP" :
			    	 itemList.add(new laptop(s_line[1],s_line[2],s_line[3],s_line[4],
			    			  s_line[5],s_line[6],s_line[7],s_line[8],s_line[9],s_line[10]));
			    	  
			    	  break;
			     case "TABLET" :
			    	 itemList.add(new tablet(s_line[1],s_line[2],s_line[3],s_line[4],
			    			  s_line[5],s_line[6],s_line[7],s_line[8],s_line[9],s_line[10]));
			    	  
			    	  break;
			     case "TV":
			    	 itemList.add(new tv(s_line[1],s_line[2],s_line[3],s_line[4],
			    			  s_line[5],s_line[6]));	
			    	  
			    	  break;
			     case "SMARTPHONE" :
			    	 itemList.add(new smartphone(s_line[1],s_line[2],s_line[3],s_line[4],
								 s_line[5],s_line[6]));
			    	  
			    	  break;
			     case "HAIRCARE" :
			    	 itemList.add(new haircare(s_line[1],s_line[2],s_line[3],s_line[4],
								 s_line[5],s_line[6],s_line[7])); 
			    	  
			    	  break;
				 case "PERFUME" :
					 itemList.add(new perfume(s_line[1],s_line[2],s_line[3],s_line[4],s_line[5],s_line[6],s_line[7])); 
			    	  
			    	  break;
			 	 case "SKINCARE" : 
			 		itemList.add(new skincare(s_line[1],s_line[2],s_line[3],s_line[4],
				 				s_line[5],s_line[6],s_line[7]));
			    	 
			    	  break;
				 }
			 }scanner.close();
		}catch(Exception e){
			System.out.println("hata : "+e.getMessage());
		}
		
	}
	
	/**
	 * commands reading , this method is reading commands.txt and running methods.
	 * @param arguman commands.txt
	 * @param adminList its a arrayList.Its contains admin's property.
	 * @param customerList its a arrayList.Its contains customer's property.
	 * @param techList its a arrayList.Its contains technician's property.
	 * @param itemList its a arrayList.Its contains items.
	 * @param shoppingCart its a arrayList.Its contains orders.
	 * @param campaings its a arrayList.Its contains campaigns.
	 */
	public static void commandsreading(String arguman,ArrayList<admin>adminList,ArrayList<customer>customerList,ArrayList<technician>techList,ArrayList<Items> itemList,
			ArrayList<Integer>shoppingCart,ArrayList<campaigns>campaings){
		try {
			Scanner scanner = new Scanner(new File(arguman));

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] s_line = line.split("	");
				switch (s_line[0]) {
				case "ADDCUSTOMER":
					boolean durum = true;
					for (int i = 0; i < adminList.size(); i++) {
						if (((adminList.get(i)).getName()).equals(s_line[1])) {
							adminList.get(i).ADDCUSTOMER(customerList, s_line[2], s_line[3], s_line[4], s_line[5],
									s_line[6]);
							durum = false;
						}
					}
					if (durum)
						System.out.println("No admin person named" + s_line[1] + "exists! ");

					break;
				case "SHOWCUSTOMER":
					boolean durum1 = true;
					for (int i = 0; i < adminList.size(); i++) {
						if (((adminList.get(i)).getName()).equals(s_line[1])) {
							adminList.get(i).SHOWCUSTOMER(customerList, s_line[2]);
							durum1 = false;
						}
					}
					if (durum1)
						System.out.println("No admin person named" + s_line[1] + "exists! ");
					break;
				case "SHOWCUSTOMERS":
					boolean durum2 = true;
					for (int i = 0; i < adminList.size(); i++) {
						if (((adminList.get(i)).getName()).equals(s_line[1])) {
							adminList.get(i).SHOWCUSTOMERS(customerList);
							durum2 = false;
						}
					}
					if (durum2)
						System.out.println("No admin person named" + s_line[1] + "exists! ");
					break;
				case "ADDTOCART":
					int c_id = Integer.parseInt(s_line[1]);
					int i_id = Integer.parseInt(s_line[2]);
					boolean durum3 = true;
					boolean durums = true;
					for (int i = 0; i < customerList.size(); i++) {
						if (customerList.get(i).customerid == c_id) {
							for (int x = 0; x < itemList.size(); x++) {
								if (((Items) itemList.get(x)).item_id == i_id) {
									customerList.get(i).ADDTOCART(shoppingCart, i_id);
									System.out.println("The item " + ((Items) itemList.get(x)).item_id
											+ " has been succesfully added to your cart");
									durums = false;
								}
							}
							if (durums) {
								System.out.println("Invalid item ID");
							}
							durum3 = false;
						}
					}
					if (durum3) {
						System.out.println("No customer with ID number " + c_id + " exist!");
					}
					break;
				case "ORDER":

					break;
				case "SHOWADMININFO":
					boolean durum5 = true;
					for (int i = 0; i < adminList.size(); i++) {
						if (((adminList.get(i)).getName()).equals(s_line[1])) {
							adminList.get(i).SHOWADMININFO(adminList, s_line[1]);
							durum5 = false;
						}
					}
					if (durum5)
						System.out.println("No admin person named " + s_line[1] + " exists! ");
					break;
				case "CREATECAMPAIGN":
					boolean durum6 = true;
					for (int i = 0; i < adminList.size(); i++) {
						if (((adminList.get(i)).getName()).equals(s_line[1])) {
							adminList.get(i).CREATECAMPAING(campaings, s_line[2], s_line[3], s_line[4], s_line[5]);
							durum6 = false;
						}
					}
					if (durum6)
						System.out.println("No admin person named " + s_line[1] + " exists! ");
					break;
				case "SHOWCAMPAIGNS":
					int c_id4 = Integer.parseInt(s_line[1]);
					boolean durum7 = true;
					for (int i = 0; i < customerList.size(); i++) {
						if (customerList.get(i).customerid == c_id4) {
							customerList.get(i).SHOWCAMPAINGS(campaings);
							durum7 = false;
						}
					}
					if (durum7)
						System.out.println("No customer with ID number " + c_id4 + " exist!");
					break;
				case "DEPOSITMONEY":
					int c_id0 = Integer.parseInt(s_line[1]);
					double load_amount1 = Double.parseDouble(s_line[2]);
					boolean durum8 = true;
					for (int i = 0; i < customerList.size(); i++) {
						if (customerList.get(i).customerid == c_id0) {
							customerList.get(i).DEPOSITMONEY(load_amount1);
							durum8 = false;
						}
					}
					if (durum8)
						System.out.println("No customer with ID number " + s_line[1] + " exists! ");
					break;
				case "CHPASS":
					int c_id1 = Integer.parseInt(s_line[1]);
					boolean durum9 = true;
					for (int i = 0; i < customerList.size(); i++) {
						if (customerList.get(i).customerid == c_id1) {
							if (customerList.get(i).getC_password().equals(s_line[2])) {
								customerList.get(i).CHPASS(s_line[1], s_line[2]);
								durum9 = false;
								break;
							}
							if (durum9) {
								System.out.println(
										"The given password does not match the current password.Please try again.");
								break;
							}
						} else {
							System.out.println("No customer with ID number " + s_line[1] + " exists!");
							break;
						}
					}
					break;
				case "EMPTYCART":
					int c_id3 = Integer.parseInt(s_line[1]);
					boolean durum10 = true;
					for (int i = 0; i < customerList.size(); i++) {
						if (customerList.get(i).customerid == c_id3) {
							customerList.get(i).EMPTYCART(shoppingCart);
							durum10 = false;
						}
					}
					if (durum10) {
						System.out.println("No customer with ID " + s_line[1] + " exists!");
					}
					break;
				case "SHOWORDERS":

					break;
				case "SHOWITEMSLOWONSTOCK":

					break;
				case "SHOWVIP":

					break;
				case "ADDADMIN":
					boolean durum14 = true;
					for (int i = 0; i < adminList.size(); i++) {
						if (((adminList.get(i)).getName()).equals(s_line[1])) {
							adminList.get(i).ADDADMIN(adminList, s_line[2], s_line[3], s_line[4], s_line[5], s_line[6]);
							durum14 = false;
						}
					}
					if (durum14)
						System.out.println("No admin person named" + s_line[1] + "exists! ");
					break;
				case "ADDTECH":
					boolean durum15 = true;
					for (int i = 0; i < adminList.size(); i++) {
						if (((adminList.get(i)).getName()).equals(s_line[1])) {
							adminList.get(i).ADDTECH(techList, s_line[2], s_line[3], s_line[4], s_line[5], s_line[6]);
							durum15 = false;
						}
					}
					if (durum15)
						System.out.println("No admin person named" + s_line[1] + "exists! ");

					break;
				case "ADDITEM":
					boolean durum16 = true;
					String[] array = s_line[2].split(":");
					for (int i = 0; i < techList.size(); i++) {
						if (((techList.get(i)).getName()).equals(s_line[1])) {
							techList.get(i).ADDITEM(itemList, array);
							durum16 = false;
						}
					}
					if (durum16)
						System.out.println("No technician person named " + s_line[1]);
					break;
				case "LISTITEM":
					boolean durum17 = true;
					for (int i = 0; i < techList.size(); i++) {
						if (((techList.get(i)).getName()).equals(s_line[1])) {
							techList.get(i).LISTITEM(itemList);
							durum17 = false;
						}
					}
					if (durum17) {
						boolean cond1 = true;
						for (int j = 0; j < adminList.size(); j++) {
							if (((adminList.get(j)).getName()).equals(s_line[1])) {
								adminList.get(j).LISTITEM(itemList);
								cond1 = false;
							}
						}
						if (cond1)
							System.out.println("No admin or technician person named " + s_line[1] + " exists!");
					}
					break;
				case "DISPITEMSOF":
					boolean durum18 = true;
					for (int i = 0; i < techList.size(); i++) {
						if (((techList.get(i)).getName()).equals(s_line[1])) {
							techList.get(i).DISPITEMOF(itemList, s_line[2]);
							durum18=false;
						}
					}if(durum18) System.out.println("No technician person named "+s_line[1]+" exists !");
					break;
				}
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("hata : " + e.getMessage());
		}
	}
}
			 
		
		


package Users;
import java.util.ArrayList;
import java.util.List;

import Items.*;
import Shopping.*;

import Users.Users;

/**
 * costumer is a user.
 * This class is containing customer's propertys and methods.
 * 
 * @author Damla Unal
 */
public class customer extends Users {
	enum Status{
		Gold,
		Classic,
		Silver
	}
	/**
	 * costumerID is a customer's property.
	 */
	private static int staticcustomerID=1;
	public int customerid;

	/**
	 * c_password is a customer's property.
	 */
	private String c_password ;

	/**
	 * balance is a customer's property.
	 */
	protected static String balance;

	/**
	 *  status is a customer's property.
	 */
	protected Status status;

	/**
	 * order_history is a customer's property.
	 */
	private String order_history ;

	/**
	 * DISCOUNT_RATE is a customer's property.
	 */
	public static int DISCOUNT_RATE ;

	/**
	 * The constructor has 5 parameter.
	 * It is creating new customer object.
	 * When its running every time,increasing staticcustomerID ,
	 * @param c_name customer's name.
	 * @param c_mail customer's mail.
	 * @param c_bdate customers birth of date.
	 * @param c_balance customers balance.
	 * @param c_pass customer's password.
	 */
	public customer(String c_name, String c_mail, String c_bdate, String c_balance,
			String c_pass){
		super(c_name,c_mail,c_bdate);
		customer.balance=c_balance;
		this.c_password=c_pass;
		this.customerid=staticcustomerID;
		this.status=Status.Classic;
		staticcustomerID++;
	}
	/**
	 * CHPASS, Passwords are checked by admins who are authorized to add new customers, then customers can change their passwords.
	 * @param old_pass customer's old password.
	 * @param new_pass customer's new password.
	 */
	public void CHPASS(String old_pass, String new_pass) {
		this.c_password=new_pass;
		System.out.println("The password has been successfully changed");
	}
		  
	/**
	 * DEPOSITMONEY,  Before placing a new order they can deposit money into their accounts if it does not have sufficient amount for purchase.
	 * @param load_amount money of loading amount.
	 */
	public void DEPOSITMONEY(double load_amount) {
		
		double i_balance = Double.parseDouble(balance);
		i_balance += load_amount;
	}

	/**
	 * SHOWCAMPAINGS,  Customers may prefer to buy items that have a sale campaign. They can  display campaigns
	 * @param  campaings It is a ArrayList.its contains campaigns.
	 */
	public void SHOWCAMPAINGS(ArrayList<campaigns>campaings) {
		if(campaings.isEmpty()){
			System.out.println("No campaign has been created so far!");
		}
		else{
			System.out.println("Active campaigns: ");
			for(int i=0; i<campaings.size();i++)
			System.out.println(campaings.get(i).discount_rate+"% sale of "+campaings.get(i).item_Type+" until "+campaings.get(i).endDate);
		}
	}

	/**
	 * ADDTOCART , if customerID is right, customers can add item their cart.
	 * @param shoppingCart It is a ArrayList.its contains order.
	 * @param item_id item ID.
	 */
	public void ADDTOCART(ArrayList<Integer>shoppingCart,int item_id) {
		shoppingCart.add(item_id);
	}

	/**
	 * EMPTYCART, if customerID is right, customers can discharge their cart.
	 * @param shoppingCart It is a ArrayList.its contains order.
	 */
	public void EMPTYCART(ArrayList<Integer>shoppingCart) {
		
		if(!shoppingCart.isEmpty()){
			shoppingCart.clear();
			System.out.println("The cart has been emptied.");
		}
	}

	/**
	 * ORDER.
	 */
	public void ORDER() {
		
	}

	/**
	 * Returns c_password.
	 * @return c_password
	 */
	public String getC_password() {
		return this.c_password;
	}

	/**
	 * Returns balance.
	 * @return balance
	 */
	public static String getBalance() {
		return balance;
	}

	/**
	 * Sets a value to attribute balance.
	 * @param newBalance
	 */
	public static void setBalance(String newBalance) {
		balance = newBalance;
	}

	/**
	 * Returns order_history.
	 * @return order_history
	 */
	public String getOrder_history() {
		return this.order_history;
	}

	/**
	 * Sets a value to attribute order_history.
	 * @param newOrder_history
	 */
	public void setOrder_history(String newOrder_history) {
		this.order_history = newOrder_history;
	}

	/**
	 * Returns DISCOUNT_RATE.
	 * @return DISCOUNT_RATE
	 */
	public static Integer getDISCOUNT_RATE() {
		return DISCOUNT_RATE;
	}

	/**
	 * Sets a value to attribute DISCOUNT_RATE.
	 * @param newDISCOUNT_RATE
	 */
	public static void setDISCOUNT_RATE(Integer newDISCOUNT_RATE) {
		DISCOUNT_RATE = newDISCOUNT_RATE;
	}
	public String toString(){
		return "Name: "+getName()+"Email: "+getEmail()+" Date of birth :"+getDate_birth()+"ID :"+customerid+"Status :"+status;
	}

}

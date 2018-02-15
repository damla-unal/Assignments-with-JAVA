
package Users;

import Users.employee;

import java.util.ArrayList;

import Shopping.campaigns;
import Users.*;


/**
 * admin is a User. It is a Users's subclass.
 * This class is containing admin's property ad methods.
 * 
 * @author Damla Unal
 */
public class admin extends employee {
	/**
	 *  a_password is a admin's property.
	 */
	protected String a_password;

	/**
	 * The constructor has 5 parameter .
	 * It is creating new admin object.
	 * @param a_name admin name.
	 * @param a_mail  admin's mail.
	 * @param a_bdate admin's birth of date.
	 * @param a_salary admin's salary.
	 * @param a_pass admin's password.
	 */
	public admin(String a_name, String a_mail, String a_bdate, String a_salary,String a_pass ) {
		super(a_name,a_mail,a_bdate);
		salary=a_salary;
		setA_password(a_pass);	
	}

	/**
	 * ADDCUSTOMER is producing new customer,if user is a admin.
	 * @param customer It is a ArrayList. its contains customers property.
	 * @param c_name customer's name.
	 * @param c_mail customer's mail.
	 * @param c_bdate customer's birth of date.
	 * @param i_balance customer's balance.
	 * @param c_pass customer's password.
	 */
	public void ADDCUSTOMER(ArrayList<customer>customer,String c_name, String c_mail, String c_bdate, String i_balance,String c_pass) {
		
			customer.add(new customer(c_name, c_mail, c_bdate, i_balance, c_pass));
			
	}

	/**
	 * ADDADMIN is producing new admin,if user is a admin.
	 * @param admin It is a ArrayList. its contains admins property.
	 * @param newa_name  new admin name.
	 * @param newa_mail new admin mail.
	 * @param newa_bdate new admin birth of date.
	 * @param newa_salary new admin salary.
	 * @param newa_pass new admin passwords.
	 */
	public void ADDADMIN(ArrayList<admin>admin,String newa_name, String newa_mail, String newa_bdate, String newa_salary,String newa_pass) {
		admin.add(new admin(newa_name,newa_mail,newa_bdate,newa_salary,newa_pass));	
	}

	/**
	 * ADDTECH is producing new technician , if user is a admin.
	 * @param tech It is a ArrayList. its contains technicians property.
	 * @param newt_name new technician name.
	 * @param newt_mail new technician mail.
	 * @param newt_bdate new technician birth of date.
	 * @param newt_salary new technician salary.
	 * @param isSenior is technician senior or not.
	 */
	public void ADDTECH(ArrayList<technician>tech, String newt_name, String newt_mail, String newt_bdate, String newt_salary,String isSenior) {
			tech.add(new technician(newt_name,newt_mail,newt_bdate,newt_salary,isSenior));
		}
		
	/**
	 *SHOWCUSTOMER, An admin person can also show the customers which are recorded so far.
	 * The displayed customer records : name, ID, email, date of birth, and status.
	 * @param customer It is a ArrayList. its contains customers property.
	 * @param c_id costumer's ID.
	 */
	public void SHOWCUSTOMER(ArrayList<customer>customer,String c_id) {
		int c_id1=Integer.parseInt(c_id);
		for(int i=0;i<customer.size();i++){
			if(c_id1==customer.get(i).customerid){
				System.out.println("Customer name :"+customer.get(i).getName()+"	ID: "+customer.get(i).customerid+"	E-mail:"+customer.get(i).getEmail()+
						"	Date of Birth : "+customer.get(i).getDate_birth()+"	Status: "+customer.get(i).status)	;
			}
		}
	}
	/**
	 *SHOWCUSTOMERS, admin is also authorized to list all customer info for customers who are recorded in the system.
	 * @param customer It is a ArrayList. its contains customers property.
	 */
	public void SHOWCUSTOMERS(ArrayList<customer>customer) {
		for(int i=0;i<customer.size();i++){
			System.out.println("Customer name :"+customer.get(i).getName()+"	ID: "+customer.get(i).customerid+"	E-mail:"+customer.get(i).getEmail()+
					"	Date of Birth : "+customer.get(i).getDate_birth()+"	Status: "+customer.get(i).status);
		}
	}

	/**
	 * SHOWADMININFO, Admin can also display their information, if user is a admin.
	 * @param admin It is a ArrayList. its contains admins property.
	 * @param a_name admin name.
	 */
	public void SHOWADMININFO(ArrayList<admin>admin,String a_name) {
		System.out.println("----------- Admin info -----------");
		for(int i=0;i<admin.size();i++){
			if(((admin.get(i)).getName()).equals(a_name)){
				System.out.println("Admin name: "+admin.get(i).getName());
				System.out.println("Admin e-mail: "+admin.get(i).getEmail());
				System.out.println("Admin date of birth: "+admin.get(i).getDate_birth());
			}
		}
		
	}

	/**
	 * CREATECAMPAING, admins are allowed to launch a new campaign.
	 * @param campaings It is a ArrayList. its contains campaigns.
	 * @param startDate campaign's Start Date.
	 * @param endDate campaign's End Date.
	 * @param itemtype item Type.
	 * @param rate Discount Rate.
	 */
	public void CREATECAMPAING(ArrayList<campaigns>campaings,String startDate,String endDate, String itemtype, String rate) {
		int i_rate=Integer.parseInt(rate);
		if(i_rate<=50){
		campaings.add(new campaigns(startDate,endDate,itemtype,rate));
		}
		else{
			System.out.println("Campaign was not created. Discount rate exceeds maximum rate of %50");
		}
	}
	/**
	 * Returns a_password.
	 * @return a_password
	 */
	public String getA_password() {
		return this.a_password;
	}

	/**
	 * Sets a value to attribute a_password.
	 * @param newA_password
	 */
	public void setA_password(String newA_password) {
		this.a_password = newA_password;
	}

	public String toString(){
			return "Name: "+getName()+"Email: "+getEmail()+" Date of birth :"+getDate_birth()+"Salary : "+salary+"Password: "+getA_password();
		}
}

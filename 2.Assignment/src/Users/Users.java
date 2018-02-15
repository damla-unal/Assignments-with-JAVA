package Users;

/**
 * Users is a superclass.
 * 
 * @author Damla Unal
 */
public class Users {
	/**
	 * name is Users property.
	 */
	private String name ;

	/**
	 * email is Users property.
	 */
	private String email;

	/**
	 *  date_birt is Users property.
	 */
	private String date_birth ;

	/**
	 * The constructor create new Users object.
	 * @param name user's name.
	 * @param email user's mail.
	 * @param date_birth user's date of birth.
	 */
	public Users(String name,String email,String date_birth) {
		this.name=name;
		this.email=email;
		this.date_birth=date_birth;
	}

	/**
	 * Returns name.
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name.
	 * @param newName
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Returns e-mail.
	 * @return e-mail
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets a value to attribute e-mail.
	 * @param newEmail
	 */
	public void setEmail(String newEmail) {
	    this.email = newEmail;
	}

	/**
	 * Returns date_birth.
	 * @return date_birth
	 */
	public String getDate_birth() {
		return this.date_birth;
	}

	/**
	 * Sets a value to attribute date_birth.
	 * @param newDate_birth
	 */
	public void setDate_birth(String newDate_birth) {
		this.date_birth = newDate_birth;
	}

	public String toString(){
		return "Name: "+getName()+"Email: "+getEmail()+" Date of birth :"+getDate_birth();
	}
	
}

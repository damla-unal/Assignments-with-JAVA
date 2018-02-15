import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


/**
 * This class is name User. It has propertys and methods.
 * 
 * @author Damla Unal
 */
public class User {

	/**
	 * lastLogin is Users's property .
	 */
	public Date lastLogin;

	/**
	 * password is Users's property .
	 */
	private String password;

	/**
	 * schoolGraduated is Users's property.
	 */
	public String schoolGraduated;

	/**
	 * username is Users's property.
	 */
	public String username;

	/**
	 * UserID is Users's property.
	 */
	public static int staticUserID = 1;
	public int userId;

	/**
	 * name is Users's property.
	 */
	public String name;

	/**
	 * signedin is Users's property.
	 */
	public boolean signedin;

	/**
	 * Description of the property dateOfBirth.
	 */
	public LocalDate dateOfBirth = null;
	private ArrayList<User> friendsList = new ArrayList<User>();
	private ArrayList<User> blocedList = new ArrayList<User>();
	private ArrayList<Post> postList = new ArrayList<Post>();
	private ArrayList<TextPost> TextpostList = new ArrayList<TextPost>();
	private ArrayList<ImagePost> ImagepostList = new ArrayList<ImagePost>();
	private ArrayList<VideoPost> VideopostList = new ArrayList<VideoPost>();
	private ArrayList<String> taggedfriend = new ArrayList<String>();

	public User(String name, String username, String password, LocalDate date, String school) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.dateOfBirth = date;
		this.schoolGraduated = school;
		this.userId = staticUserID;
		staticUserID++;

	}

	/**
	 * Returns lastLogin.
	 * 
	 * @return lastLogin
	 */
	public Date getLastLogin() {
		return this.lastLogin;
	}

	/**
	 * Sets a value to attribute lastLogin.
	 * 
	 * @param newLastLogin
	 */
	public void setLastLogin(Date newLastLogin) {
		this.lastLogin = newLastLogin;
	}

	/**
	 * Returns schoolGraduated.
	 * 
	 * @return schoolGraduated
	 */
	public String getSchoolGraduated() {
		return this.schoolGraduated;
	}

	/**
	 * Sets a value to attribute schoolGraduated.
	 * 
	 * @param newSchoolGraduated
	 */
	public void setSchoolGraduated(String newSchoolGraduated) {
		this.schoolGraduated = newSchoolGraduated;
	}

	/**
	 * Returns username.
	 * 
	 * @return username
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 * Sets a value to attribute username.
	 * 
	 * @param newUsername
	 */
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}

	/**
	 * Returns name.
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name.
	 * 
	 * @param newName
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Returns signedin.
	 * 
	 * @return signedin
	 */
	public boolean getSignedin() {
		return this.signedin;
	}

	/**
	 * Sets a value to attribute signedin.
	 * 
	 * @param newSignedin
	 */
	public void setSignedin(Boolean newSignedin) {
		this.signedin = newSignedin;
	}

	/**
	 * Returns dateOfBirth.
	 * 
	 * @return dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * Sets a value to attribute dateOfBirth.
	 * 
	 * @param newDateOfBirth
	 */
	public void setDateOfBirth(LocalDate newDateOfBirth) {
		this.dateOfBirth = newDateOfBirth;
	}

	/**
	 * this method is listing users.
	 */
	public void LISTUSERS() {
		for (int i = 0; i < UserCollection.userList.size(); i++) {
			System.out.println("Name: " + UserCollection.userList.get(i).name + "\nUsername: "
					+ UserCollection.userList.get(i).getUsername() + "\nDate of Birth: "
					+ UserCollection.userList.get(i).getDateOfBirth() + "\nSchool: "
					+ UserCollection.userList.get(i).schoolGraduated);
			System.out.println("------------------------------------------");
		}
	}

	/**
	 * CHPASS is changing password.
	 * 
	 * @param old_pass
	 * @param new_pass
	 */
	public void CHPASS(String old_pass, String new_pass) {
		boolean durum1 = true;
		for (int i = 0; i < UserCollection.userList.size(); i++) {
			if (UserCollection.userList.get(i).password.equals(old_pass)) {
				UserCollection.userList.get(i).password = new_pass;
				durum1 = false;
			}
		}
		if (durum1)
			System.out.println("Password mismatch! Please, try again ");
	}

	/**
	 * UPDATEPROFILE is update user's profile.
	 * 
	 * @param name
	 * @param birth
	 * @param school
	 */
	public void UPDATEPROFILE(String name, LocalDate birth, String school) {
		for (int i = 0; i < UserCollection.userList.size(); i++) {
			if (UserCollection.userList.get(i).getName().equals(name)) {
				UserCollection.userList.get(i).setName(name);
				UserCollection.userList.get(i).setDateOfBirth(birth);
				;
				UserCollection.userList.get(i).setSchoolGraduated(school);
			}

		}
		System.out.println("Your user profile has been succesfully updated.");
	}

	/**
	 * adding friend user's friendlist.
	 * 
	 * @param userName
	 */
	public void ADDFRIEND(String userName) {
		boolean durum1 = true;
		for (int i = 0; i < UserCollection.userList.size(); i++) {
			if (UserCollection.userList.get(i).getUsername().equals(userName)) {
				durum1 = false;
				if (getFriendsList().contains(UserCollection.userList.get(i))) {
					System.out.println("This user is already in your friend list !");
				} else {
					setFriendsList(UserCollection.userList.get(i));
					System.out.println(userName + " has been succesfully added to your friend list.");
				}

			}
		}
		if (durum1)
			System.out.println("No such user!");
	}

	/**
	 * A user can also remove a user from his friend list.
	 * 
	 * @param userName
	 */
	public void REMOVEFRIEND(String userName) {
		boolean durum1 = true;
		for (int i = 0; i < friendsList.size(); i++) {
			if (friendsList.get(i).getUsername().equals(userName)) {
				friendsList.remove(i);
				System.out.println(userName + " has been succesfully removed to your friend list.");
				durum1 = false;
			}
		}
		if (durum1)
			System.out.println("No such friend!");
	}

	/**
	 * Users should be able to lists their friends, blocked or not.
	 */
	public void LISTFRIENDS() {
		if (friendsList.isEmpty()) {
			System.out.println("You haven't added any friends yet!");
		} else {
			for (int i = 0; i < friendsList.size(); i++) {
				System.out.println("Name: " + friendsList.get(i).name + "\nUsername: "
						+ friendsList.get(i).getUsername() + "\nDate of Birth: " + friendsList.get(i).getDateOfBirth()
						+ "\nSchool: " + friendsList.get(i).schoolGraduated);
				System.out.println("------------------------------------------");
			}
		}
	}

	/**
	 * users to block other users given a username as the argument.
	 * 
	 * @param userName
	 */
	public void BLOCK(String userName) {
		boolean durum1 = true;
		for (int i = 0; i < UserCollection.userList.size(); i++) {
			if (UserCollection.userList.get(i).getUsername().equals(userName)) {
				setBlocedList(UserCollection.userList.get(i));
				System.out.println(userName + " has been succesfully blocked");
				durum1 = false;
			}
		}
		if (durum1)
			System.out.println("No such user!");
	}

	/**
	 * a user to unblock another user who has been blocked by him.
	 * 
	 * @param userName
	 */
	public void UNBLOCK(String userName) {
		boolean durum1 = true;
		for (int i = 0; i < getBlocedList().size(); i++) {
			if (getBlocedList().get(i).getUsername().equals(userName)) {
				getBlocedList().remove(i);
				System.out.println(userName + " has been succesfully ublocked.");
				durum1 = false;
			}
		}
		if (durum1)
			System.out.println("No such user in your blocked users list !");
	}

	/**
	 * users should be able to lists all users whom they have blocked, both
	 * friends and non-friends.
	 */
	public void SHOWBLOCKEDUSERS() {
		if (getBlocedList().isEmpty()) {
			System.out.println("You haven't blocked any users yet !");
		} else {
			for (int i = 0; i < getBlocedList().size(); i++) {
				System.out.println(
						"Name: " + getBlocedList().get(i).name + "\nUsername: " + getBlocedList().get(i).getUsername()
								+ "\nDate of Birth: " + getBlocedList().get(i).getDateOfBirth() + "\nSchool: "
								+ getBlocedList().get(i).schoolGraduated);
				System.out.println("------------------------------------------");
			}
		}
	}

	/**
	 * Users should be able to lists their friends whom they have blocked.
	 */
	public void SHOWBLOCKEDFRIENDS() {
		if (getBlocedList().isEmpty()) {
			System.out.println("You haven't blocked any users yet !");
		} else {
			for (int i = 0; i < getBlocedList().size(); i++) {
				if (getBlocedList().get(i).getUsername().equals(getFriendsList().get(i).getUsername())) {
					System.out.println("Name: " + getBlocedList().get(i).name + "\nUsername: "
							+ getBlocedList().get(i).getUsername() + "\nDate of Birth: "
							+ getBlocedList().get(i).getDateOfBirth() + "\nSchool: "
							+ getBlocedList().get(i).schoolGraduated);
					System.out.println("------------------------------------------");
				} else {
					System.out.println("You haven't blocked any friends yet!");
				}
			}
		}
	}

	/**
	 * This method controlling equation to password.
	 * 
	 * @param password
	 * @return
	 */
	public boolean SIGNIN(String password) {
		if (this.password.equals(password)) {
			return true;
		} else {
			System.out.println("Invalid username or password ! Please try again.");
			return false;
		}
	}

	/**
	 * User may create a new text post.
	 * 
	 * @param text
	 * @param textdate
	 * @param longitude
	 * @param latitude
	 * @param array
	 */
	public void ADDPOST_TEXT(String text, String textdate, double longitude, double latitude, String[] array) {
		for (String elm : array) {
			boolean durum1 = true;
			for (int i = 0; i < getFriendsList().size(); i++) {
				if (elm.equals(getFriendsList().get(i).getUsername())) {
					setTaggedfriend(elm);
					durum1 = false;
				}
			}
			if (durum1)
				System.out.println(elm + " is not your friend, and will not be tagged.");
		}

		setPostList(new TextPost(text, textdate, longitude, latitude, array));
		setTextPostList(new TextPost(text, textdate, longitude, latitude, array));
		System.out.println("The post has been succesfully added");

	}

	/**
	 * User may create a new image post.
	 * 
	 * @param text
	 * @param textdate
	 * @param longitude
	 * @param latitude
	 * @param array
	 * @param filePath
	 * @param resolution
	 */
	public void ADDPOST_IMAGE(String text, String textdate, double longitude, double latitude, String[] array,String filePath, String resolution) {
		for (String elm : array) {
			boolean durum1 = true;
			for (int i = 0; i < getFriendsList().size(); i++) {
				if (elm.equals(getFriendsList().get(i).getUsername())) {
					setTaggedfriend(elm);
					durum1 = false;
				}
			}
			if (durum1)
				System.out.println(elm + " is not your friend, and will not be tagged.");
		}
		setPostList(new ImagePost(text, textdate, longitude, latitude, array, filePath, resolution));
		setImagePostList(new ImagePost(text, textdate, longitude, latitude, array, filePath, resolution));
		System.out.println("The post has been succesfully added");

	}

	/**
	 * User may create a new video post.
	 * 
	 * @param text
	 * @param textdate
	 * @param longitude
	 * @param latitude
	 * @param array
	 * @param filePath
	 * @param duration
	 */
	public void ADDPOST_VIDEO(String text, String textdate, double longitude, double latitude, String[] array,
			String filePath, String duration) {
		for (String elm : array) {
			boolean durum1 = true;
			for (int i = 0; i < getFriendsList().size(); i++) {
				if (elm.equals(getFriendsList().get(i).getUsername())) {
					setTaggedfriend(elm);
					durum1 = false;
				}
			}
			if (durum1)
				System.out.println(elm + " is not your friend, and will not be tagged.");
		}
		if (Double.parseDouble(duration) <= 10) {
			setPostList(new VideoPost(text, textdate, longitude, latitude, array, filePath, duration));
			setVideoPostList(new VideoPost(text, textdate, longitude, latitude, array, filePath, duration));
			System.out.println("The post has been succesfully added");
		} else
			System.out.println("Error: Your video exceeds maximum allowed duration of 10 minutes.");
	}

	/**
	 * user to remove a post that has been created the latest.
	 */
	public void REMOVELASTPOST() {
		if (postList.get(postList.size() - 1).getClass().getName().equals("TextPost")) {
			for (int i = 0; i < TextpostList.size(); i++) {
				if (TextpostList.get(i).getText().equals(postList.get(postList.size() - 1).getText())) {
					this.TextpostList.remove(i);
					this.postList.remove(postList.size() - 1);
					System.out.println("The last post has been successfully removed");
				}
			}
		} else if (postList.get(postList.size() - 1).getClass().getName().equals("ImagePost")) {
			for (int i = 0; i < ImagepostList.size(); i++) {
				if (ImagepostList.get(i).getText().equals(postList.get(postList.size() - 1).getText())) {
					this.ImagepostList.remove(i);
					this.postList.remove(postList.size() - 1);
					System.out.println("The last post has been successfully removed");
				}
			}
		} else if (postList.get(postList.size() - 1).getClass().getName().equals("VideoPost")) {
			for (int i = 0; i < VideopostList.size(); i++) {
				if (VideopostList.get(i).getText().equals(postList.get(postList.size() - 1).getText())) {
					this.VideopostList.remove(i);
					this.postList.remove(postList.size() - 1);
					System.out.println("The last post has been successfully removed");
				}
			}
		}
	}

	public ArrayList<User> getFriendsList() {
		return friendsList;
	}

	public void setFriendsList(User friend) {
		friendsList.add(friend);
	}

	public ArrayList<User> getBlocedList() {
		return blocedList;
	}

	public void setBlocedList(User blocked) {
		blocedList.add(blocked);
	}

	public ArrayList<Post> getPostList() {
		return postList;
	}

	public void setPostList(Post post) {
		postList.add(post);
	}

	public ArrayList<TextPost> getTextPostList() {
		return TextpostList;
	}

	public void setTextPostList(TextPost post) {
		this.TextpostList.add(post);
	}

	public ArrayList<ImagePost> getImagePostList() {
		return ImagepostList;
	}

	public void setImagePostList(ImagePost post) {
		ImagepostList.add(post);
	}

	public ArrayList<VideoPost> getVideoPostList() {
		return VideopostList;
	}

	public void setVideoPostList(VideoPost post) {
		VideopostList.add(post);
	}

	public ArrayList<String> getTaggedfriend() {
		return taggedfriend;
	}

	public void setTaggedfriend(String tagged) {
		taggedfriend.add(tagged);
	}
}

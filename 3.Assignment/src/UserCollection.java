import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class name is UserCollection.
 * It has property and methods.
 * 
 * @author Damla Unal
 */
public class UserCollection {
	/**
	 * signIn is UserCollection's property.
	 */
	public boolean signIn=false;
	public static ArrayList<User> userList=new ArrayList<User>();

	
	/**
	 * the method addUser is adding user.
	 * @param name
	 * @param userName
	 * @param password
	 * @param date
	 * @param school
	 */
	public static void addUser(String name, String userName, String password, LocalDate date, String school) {
		userList.add(new User(name,userName,password,date,school));
	}

	
	/**
	 * the method removeUser is removing user.
	 * @param index
	 */
	public static void removeUser(int index) {
		boolean durum1=true;
		for(int i=0;i<userList.size();i++){
			if(((ArrayList<User>) userList).get(i).userId==index){
				userList.remove(i);
				System.out.println("User has been succesfully removed.");
				durum1=false;
			}
		}if(durum1) System.out.println("No such user");
	}

	/**
	 * the method UserSignIn is sign in.
	 * @param userName
	 * @param password
	 */
	public static void UserSignIn(String userName,String password) {
		
		boolean signIn = false;
		boolean durum1 = true;
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getUsername().equals(userName)){
				durum1=false;
				signIn=userList.get(i).SIGNIN(password);
				if(signIn) userList.get(i).signedin=true;
				}
			}if(signIn) System.out.println("You have succesfully signed in.");
		
			if(durum1) System.out.println("No such user.");

	}

	/**
	 * the method showPosts is displaying user's posts.
	 * @param userName
	 */
	public static void showPosts(String userName) {
		boolean durum1=true;
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getUsername().equals(userName)){
				durum1=false;
				if(userList.get(i).getPostList().isEmpty()){
					System.out.println(userName+" does not have any posts yet.");
				}
				if(userList.get(i).getImagePostList().isEmpty()){
					System.out.println("");
				}
				else{
					for(ImagePost t:userList.get(i).getImagePostList()){
					System.out.println(t.text);
					System.out.println("Date: "+t.getDate());
					t.showLocation();
					System.out.println("Image: "+t.filename);
					System.out.println("Image resolution: "+t.resolution);
					t.showTaggedUser();
					System.out.println("------------------------------------");
					}
				}
				if(userList.get(i).getVideoPostList().isEmpty()){
					System.out.println("");
				}
				else{
					for(VideoPost t:userList.get(i).getVideoPostList()){
					System.out.println(t.text);
					System.out.println("Date: "+t.getDate());
					t.showLocation();
					System.out.println("Video: "+t.videoname);
					System.out.println("Video Duration: "+t.duration+" minutes");
					t.showTaggedUser();
					System.out.println("------------------------------------");
					}
			}
				if(userList.get(i).getTextPostList().isEmpty()){
					System.out.println("");
				}
				else{
					for(TextPost t:userList.get(i).getTextPostList()){
					System.out.println(t.text);
					System.out.println("Date: "+t.getDate());
					t.showLocation();
					t.showTaggedUser();
					System.out.println("------------------------------------");
					}
			}
		}
	}if(durum1) System.out.println("No such user!");
}	
	
	
	/**
	 * This method is signing out.
	 */
	public static void SIGNOUT(){
		
		boolean durum1=true;
		for(int i=0;i<userList.size();i++){
			userList.get(i).signedin=false;
			durum1=false;
		}
		if(!durum1){
			System.out.println("You have succesfully signed out");
		}
	}
	

	
}

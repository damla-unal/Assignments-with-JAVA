import java.util.ArrayList;
import java.util.UUID;

/**
 * Post is a Abstract Class.
 * Post implements PostInterface.
 * 
 * @author Damla Unal
 */
public abstract class Post implements PostInterface {
	/**
	 * Post's property is postID.
	 */
	public  UUID postID ;
	
	/**
	 * Post's property is text.
	 */
	public String text;

	/**
	 * This arrayList is contains location object.
	 */
	public ArrayList<Location> locations = new ArrayList<Location>();
	/**
	 * Post's property is postDate.
	 */
	public String date ;

	/**
	 * This arrayList is contains tagged friend's username.
	 */
	public ArrayList<String> taggedList=new ArrayList<String>();
	

	Location local;
	/**
	 * This constructor creating new Post object.
	 * @param text
	 * @param textdate
	 * @param longitude
	 * @param latidude
	 * @param array
	 */
	public Post(String text, String textdate,double longitude,double latidude,String[] array){
		setPostID(postID);
		setText(text);
		this.date=textdate;
		local=new Location(longitude, latidude);
		setLocations(local);
		for(String elm:array){
			for(int k=0;k<UserCollection.userList.size();k++){
				for(int i=0;i<UserCollection.userList.get(k).getFriendsList().size();i++){
					if(elm.equals(UserCollection.userList.get(k).getFriendsList().get(i).getUsername())){
							setTaggedList(elm);
					}
				}
			}
		}
		
	}

	/**
	 * Description of the method getID.
	 * @return 
	 */
	public UUID getPostID() {
		
		return postID;
		
	}
	/**
	 * Sets a value to attribute postID.
	 * @param newPostID
	 */
	public void setPostID(UUID newPostID) {
		this.postID = newPostID.randomUUID();
	}

	/**
	 * Description of the method getDate.
	 * @return date.
	 */
	public String getDate() {
		return date;
	}
	/**
	 *
	 * @param n_date
	 */
	public void setDate(String n_date){
		n_date=date;
	}

	/**
	 * Returns text.
	 * @return text
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * Sets a value to attribute text.
	 * @param newText
	 */
	public void setText(String newText) {
		this.text = newText;
	}

	/**
	 *
	 * @param location
	 */
	public void setLocations(Location location) {
		locations.add(location);
	}
	/**
	 * Returns locations.
	 * @return locations
	 */
	
	public ArrayList<Location> getLocations() {
		return this.locations;
	}
	/**
	 *
	 * @return taggedList.
	 */
	public ArrayList<String> getTaggedList() {
		return taggedList;
	}
	/**
	 *
	 * @param elm
	 */
	public void setTaggedList(String elm) {
		taggedList.add(elm);
	}
	/**
	 * thats abstract methods.
	 */
	public abstract void showTaggedUser();
	public abstract void showLocation();
		
	


}

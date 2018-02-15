/**
 * TextPost is a Post.
 * This class is ImagePost and VideoPost's superclass.
 * 
 * @author Damla Unal
 */
public class TextPost extends Post {
	
	
	/**
	 * this constructor creating new TextPost object.
	 * @param text
	 * @param textdate
	 * @param longitude
	 * @param latitude
	 * @param taggedfriend
	 */
	public TextPost(String text, String textdate, double longitude, double latitude, String[] taggedfriend) {
		super(text, textdate,longitude, latitude,taggedfriend);

	}

	public void setText(String text){
		this.text=text;
	}
	/**
	 * @return text.
	 */
	public String getText(){
		return this.text;
	}

	@Override
	/**
	 * Post's abstract methods is implemented.
	 */
	public void showTaggedUser() {
		
		if(getTaggedList().isEmpty()){
			System.out.print("");
		}
		else{
			System.out.print("Friends tagged in this posts: ");
			for(String t:getTaggedList()){
				System.out.print(t+" ");
			}System.out.println("");
		}
	}
	@Override
	/**
	 * Post's abstract methods is implemented.
	 */
	public void showLocation() {
		for(int i=0;i<getLocations().size();i++){
			System.out.println("Location: "+getLocations().get(i).longlude+",  "+getLocations().get(i).attidude);
		}
	}

}

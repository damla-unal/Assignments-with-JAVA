
/**
 * VideoPost is Post's subclass.
 * 
 * @author Damla Unal
 */

public class VideoPost extends TextPost {
	/**
	 * Videoname,duration and maxDuration is VideoPost's property.
	 */
	public String videoname;
	public String duration;
	public int maxDuration=10;
	
	/**
	 * This constructor creating new VideoPost object.
	 * @param text
	 * @param textdate
	 * @param longitude
	 * @param latidude
	 * @param taggedlist
	 * @param filename
	 * @param duration
	 */
	public VideoPost(String text,String textdate, double longitude, double latidude, String[] taggedlist,String filename,String duration) {
		super(text, textdate, longitude, latidude, taggedlist);
		this.videoname=filename;
		this.duration=duration;
	}

	

}

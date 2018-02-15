
/**
 * This class have ImagePost's property and constructor.
 * This class TextPost's subclass.
 * 
 * @author Damla Unal
 */
public class ImagePost extends TextPost {
	

	/**
	 * Filename and resolution is ImagePost's property.
	 */
	public String filename;
	public String resolution;
	

	/**
	 * The constructor create a new ImagePost's object.
	 * @param text
	 * @param textdate
	 * @param longitude
	 * @param latidude
	 * @param taggedlist
	 * @param filename
	 * @param resolution
	 */
	public ImagePost(String text, String textdate, double longitude, double latidude, String[] taggedlist,String filename,String resolution) {
		super(text, textdate,longitude, latidude, taggedlist);
		setFilename(filename);
		setResolution(resolution);
	}

	/**
	 * 
	 * @return ImagePost's filename.
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * 
	 * @param filename
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}
	/**
	 * 
	 * @return ImagePost's resolution.
	 */
	public String getResolution() {
		return resolution;
	}

	/**
	 * 
	 * @param resolution
	 */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
}

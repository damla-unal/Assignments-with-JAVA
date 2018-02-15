import java.util.UUID;

/**
 * PostInterface is Interface.
 * 
 * @author Damla Unal
 */
public interface PostInterface {

	/**
	 * Description of the method setText.
	 * @param text.
	 */
	public void setText(String text);
	/**
	 * Description of the method getText.
	 */
	public String getText();
	/**
	 * Description of the method getPostID.
	 */
	public UUID getPostID();
	/**
	 * Description of the method getDate.
	 */
	public String getDate();
	

}

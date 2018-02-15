
package Items;

import Items.officeSupplies;

/**
 * cd_dvd is a subclass.(cd_dvd is a officeSupplies)
 * 
 * @author Damla Unal
 */
public class cd_dvd extends officeSupplies {
	/**
	 *composerName is a cd_dvd's property.
	 */
	private String composerName;

	/**
	 * songs are  cd_dvd's property.
	 */
	private String songs;

	/**
	 * The constructor has 5 parameter.Firstly, super(cost,releasedate,coverTitle) running.
	 * Then , cd_dvd object creating.
	 * @param cost
	 * @param releasedate
	 * @param coverTitle
	 * @param composerName
	 * @param songs
	 */
	public cd_dvd(String cost, String releasedate,String coverTitle,String composerName,String songs) {
		super(cost,releasedate,coverTitle);
		setComposerName(composerName);
		setSongs(songs);
		
	}

	/**
	 * Returns composerName.
	 * @return composerName
	 */
	public String getComposerName() {
		return this.composerName;
	}

	/**
	 * Sets a value to attribute composerName. 
	 * @param newComposerName
	 */
	public void setComposerName(String newComposerName) {
		this.composerName = newComposerName;
	}

	/**
	 * Returns songs.
	 * @return songs
	 */
	public String getSongs() {
		return this.songs;
	}

	/**
	 * Sets a value to attribute songs. 
	 * @param newSongs
	 */
	public void setSongs(String newSongs) {
		this.songs = newSongs;
	}

}

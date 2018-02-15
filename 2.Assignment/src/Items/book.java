
package Items;

import java.util.ArrayList;

import Items.*;
import Users.*;


/**
 * book is a officeSupplies.
 * Its a officeSupplies's subclass.
 * 
 * @author Damla Unal
 */
public class book extends officeSupplies {
	/**
	 * publisherName is book's property.
	 */
	private String publisherName ;

	/**
	 *authors is book's property.
	 */
	private String authors ;

	/**
	 *  pageNumber is book's property.
	 */
	public String pageNumber ;

	/**
	 * The constructor has 6 parameter.
	 * Its creating new book objects.
	 * @param cost price
	 * @param releasedate Release Date
	 * @param coverTitle Cover Title
	 * @param publisherName Publisher Name
	 * @param authors Authors
	 * @param pageNumber Page Number
	 */
	public book(String cost, String releasedate,String coverTitle,String publisherName,String authors,String pageNumber) {
		super(cost,releasedate,coverTitle);
		setPublisherName(publisherName);
		setAuthors(authors);
		setPageNumber(pageNumber);
	}

	/**
	 * Returns publisherName.
	 * @return publisherName
	 */
	public String getPublisherName() {
		return this.publisherName;
	}

	/**
	 * Sets a value to attribute publisherName. 
	 * @param newPublisherName
	 */
	public void setPublisherName(String newPublisherName) {
		this.publisherName = newPublisherName;
	}

	/**
	 * Returns authors.
	 * @return authors
	 */
	public String getAuthors() {
		return this.authors;
	}

	/**
	 * Sets a value to attribute authors. 
	 * @param newAuthors
	 */
	public void setAuthors(String newAuthors) {
		this.authors = newAuthors;
	}

	/**
	 * Returns pageNumber.
	 * @return pageNumber
	 */
	public String getPageNumber() {
		return this.pageNumber;
	}

	/**
	 * Sets a value to attribute pageNumber. 
	 * @param pageNumber2
	 */
	public void setPageNumber(String pageNumber2) {
		this.pageNumber = pageNumber2;
	}

}

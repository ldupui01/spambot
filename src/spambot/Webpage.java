package spambot;

import java.util.Set;

/**
 * A possible interface representing a web page. * This is only a suggestion.
 */


public interface Webpage {

	/**
	 * Returns the URL that identifies this web page.
	 * @return the URL the identifies this web page.
	 */
	String getUrl();


	/**
	 * Returns all the links on this web page.
	 * 
	 * Implementing classes should return a read-only view of this
	 * set, using Collections.unmodifiableSet().
	 * 
	 * @return all the links on this web page.
	 */
	Set<String> getLinks();


	/**
	 * Returns all the emails on this web page.
	 * 
	 * * Implementing classes should return a read-only view of this
	 * set, using Collections.unmodifiableSet().
	 * @return all the emails on this web page.
	 */
	Set<String> getEmails();
	
	
	// Also, implementing classes should override equals() to 
	// ensure that p1.equals(p2) returns true if and only if 
	// p1.getUrl().equals(p2.getUrl()) returns true


}

/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import com.google.code.morphia.annotations.Entity;


/**
 * @author Gregory Weaver
 *
 */
@Entity("venues")
public class Bar extends Venue {

	/**
	 * 
	 */
	public Bar() { }
	
	/**
	 * 
	 * @param name
	 */
	public Bar(String name) {
		this.name = name;
	}
	
}

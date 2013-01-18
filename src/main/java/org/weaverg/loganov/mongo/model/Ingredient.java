/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import com.google.code.morphia.annotations.Embedded;

/**
 * 
 * @author Gregory Weaver
 *
 */
@Embedded
public class Ingredient {
	
	private String name;
	private String brand;
	
	/**
	 * 
	 */
	public Ingredient() { }
	
	public Ingredient(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @param name
	 * @param brand
	 */
	public Ingredient(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
}

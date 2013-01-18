/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import java.util.List;

import com.google.code.morphia.annotations.Entity;

/**
 * @author Gregory Weaver
 *
 */
@Entity("drinks")
public class Beer extends Drink {

	private String brewery;
	
	/**
	 * 
	 */
	public Beer() { }

	/**
	 * @return the brewery
	 */
	public String getBrewery() {
		return brewery;
	}

	/**
	 * @param brewery the brewery to set
	 */
	public void setBrewery(String brewery) {
		this.brewery = brewery;
	}

	@Override
	public List<Ingredient> getIngredients() {
		return null;
	}

	@Override
	public void setIngredients(List<Ingredient> ingredients) {
		
	}
	
	
}

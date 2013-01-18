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
public class Wine extends Drink {

	private String winery;

	/**
	 * @return the winery
	 */
	public String getWinery() {
		return winery;
	}

	/**
	 * @param winery the winery to set
	 */
	public void setWinery(String winery) {
		this.winery = winery;
	}

	@Override
	public List<Ingredient> getIngredients() {
		return null;
	}

	@Override
	public void setIngredients(List<Ingredient> ingredients) { }
	
	
	
}

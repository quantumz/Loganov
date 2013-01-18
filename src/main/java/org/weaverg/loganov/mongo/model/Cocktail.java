/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import java.util.List;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Index;
import com.google.code.morphia.annotations.Indexes;

/**
 * @author Gregory Weaver
 *
 */
@Entity("drinks")
@Indexes( @Index(value="name", name="drinkName") )
public class Cocktail extends Drink{
	
	@Embedded
	private List<Ingredient> ingredients;

	/**
	 * 
	 */
	public Cocktail() {
		
	}
	
	public Cocktail(String name) {
		this.name = name;
	}
	
	/**
	 * @return the ingredients for this cocktail
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients the ingredients list for this cocktail
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
}

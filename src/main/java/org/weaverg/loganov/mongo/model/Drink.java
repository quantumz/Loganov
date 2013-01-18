/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Indexed;
import com.google.code.morphia.utils.IndexDirection;

/**
 * @author Gregory Weaver
 *
 */
@Entity("drinks")
public abstract class Drink {
	
	@Id
	protected ObjectId id;
	
	@Indexed(value=IndexDirection.ASC, name="drinkName")
	protected String name;
	
	protected Float price;
	protected String description;
	protected ObjectId venue;

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@XmlAttribute
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	@XmlAttribute
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the venueName
	 */
	public ObjectId getVenue() {
		return venue;
	}
	
	/**
	 * @param venueName the venueName to set
	 */
	public void setVenue(ObjectId venue) {
		this.venue = venue;
	}
	
	public abstract List<Ingredient> getIngredients();
	
	public abstract void setIngredients(List<Ingredient> ingredients);
	
	@Override
	public String toString() {
		return name + " - " + price;
	}
	
}

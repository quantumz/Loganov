/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import org.bson.types.ObjectId;


/**
 * @author Gregory Weaver
 *
 */
public class DrinkReview extends Review {

	protected ObjectId drinkId;
	
	/**
	 * 
	 */
	public DrinkReview() { }

	public DrinkReview(ObjectId drinkId) {
		this.drinkId = drinkId;
	}
	
	/**
	 * @return the drinkId
	 */
	public ObjectId getDrinkId() {
		return drinkId;
	}

	/**
	 * @param drinkId the drinkId to set
	 */
	public void setDrinkId(ObjectId drinkId) {
		this.drinkId = drinkId;
	}
	
	
}

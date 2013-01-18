/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import org.bson.types.ObjectId;

/**
 * @author Gregory Weaver
 *
 */
public class VenueReview extends Review {

	protected ObjectId venueId;
	
	/**
	 * 
	 */
	public VenueReview() { }

	public VenueReview(ObjectId venueId) {
		this.venueId = venueId;
	}
	
	/**
	 * @return the venueId
	 */
	public ObjectId getVenueId() {
		return venueId;
	}

	/**
	 * @param venueId the venueId to set
	 */
	public void setVenueId(ObjectId venueId) {
		this.venueId = venueId;
	}
	
	
	
}

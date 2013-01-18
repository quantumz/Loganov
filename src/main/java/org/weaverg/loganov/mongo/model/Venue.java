/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Indexed;
import com.google.code.morphia.utils.IndexDirection;

/**
 * @author Gregory Weaver
 *
 */
@Entity("venues")
public abstract class Venue {

	@Id
	protected ObjectId id;
	
	@Indexed(value=IndexDirection.ASC, name="venueName", unique=true)
	protected String name;
	
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
	 * @see org.weaverg.loganov.mongo.model.Venue#getName()
	 */
	public String getName() {
		return name;
	}

	/** 
	 * @see org.weaverg.loganov.mongo.model.Venue#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id + " " + name;
	}
	
}

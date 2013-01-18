/**
 * 
 */
package org.weaverg.loganov.mongo.model;

import java.util.Date;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

/**
 * @author Gregory Weaver
 *
 */
@Entity("reviews")
public abstract class Review {

	@Id
	protected ObjectId id;
	protected String title;
	protected String text;
	protected Date createDate;
	protected Integer stars;
	
	/**
	 * 
	 */
	public Review() { }
	
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the stars
	 */
	public Integer getStars() {
		return stars;
	}
	/**
	 * @param stars the stars to set
	 */
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	
}

/**
 * 
 */
package org.weaverg.loganov;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.weaverg.loganov.mongo.model.Bar;
import org.weaverg.loganov.mongo.model.Beer;
import org.weaverg.loganov.mongo.model.Cocktail;
import org.weaverg.loganov.mongo.model.Drink;
import org.weaverg.loganov.mongo.model.DrinkReview;
import org.weaverg.loganov.mongo.model.Ingredient;
import org.weaverg.loganov.mongo.model.Restaurant;
import org.weaverg.loganov.mongo.model.Review;
import org.weaverg.loganov.mongo.model.Venue;
import org.weaverg.loganov.mongo.model.VenueReview;
import org.weaverg.loganov.mongo.model.Wine;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.code.morphia.query.Query;
import com.mongodb.Mongo;
import com.mongodb.MongoException;

/**
 * @author Gregory Weaver
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Class> classes = new HashSet<Class>();
		classes.addAll(Arrays.asList(
				Venue.class, 
				Bar.class, 
				Restaurant.class,
				Drink.class,
				Beer.class,
				Cocktail.class,
				Wine.class,
				Ingredient.class));
		
		Mongo mongo = null;
		Morphia morphia = null;
		try {
			mongo = new Mongo("localhost");
			morphia = new Morphia(classes);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (MongoException e) {
			e.printStackTrace();
		}

		Datastore ds = null;
		if(morphia != null) {
			ds = morphia.createDatastore(mongo, "test");
			ds.ensureIndexes();
			ds.ensureCaps();
		}

		//Venue
		Venue v = new Bar("Bar Agricole");
		try {
			ds.save(v);
			
		} catch (MongoException.DuplicateKey me) {
			System.out.println("Duplicate key name : " + me.getMessage());
		}
		
		
		//Drink
		Drink cocktail = new Cocktail("Palmetto");
		cocktail.setPrice(11.00f);
		cocktail.setIngredients(Arrays.asList(
				new Ingredient("Rum"), 
				new Ingredient("Vermouth"),
				new Ingredient("Bitters"),
				new Ingredient("Orange Zest")));
		cocktail.setVenue(v.getId());
		
		//Bar Review
		Review venueReview = new VenueReview(v.getId());
		venueReview.setText("A review of the lovely, and delightful, Bar Agricole.");
		venueReview.setTitle("Review of Bar Agricole.");
		venueReview.setStars(5);
		venueReview.setCreateDate(Calendar.getInstance().getTime());
		
		try {
			ds.save(cocktail);
			ds.save(venueReview);
		} catch (MongoException.DuplicateKey me) {
			System.out.println("Duplicate key name : " + me.getMessage());
		}

		//Drink Review
		Review drinkReview = new DrinkReview();
		drinkReview.setText("A reveiw of a delightful cocktail.");
		drinkReview.setTitle("Drink review of the Palmetto, from Bar Agricole.");
		drinkReview.setStars(5);
		drinkReview.setCreateDate(Calendar.getInstance().getTime());
		
		try {
			ds.save(drinkReview);
		} catch (MongoException.DuplicateKey me) {
			System.out.println("Duplicate key name : " + me.getMessage());
		}
		
		
		
		//Drink cocktail2 = new Cocktail("Appletini");
		//cocktail2.setPrice(10.00f);
		//cocktail.setVenue(v);
		
		//ObjectId id = null;
		
		Query q = ds.createQuery(Drink.class).field("venue").equal(v.getId()).order("name");
		//q.field("drinks.name");
		//Venue venue = (Venue)q.get();
		//List<Drink> drinks = venue.getDrinks();
		//Collections.sort(drinks);
		System.out.println(q.asList());
	}

}

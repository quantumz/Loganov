/**
 * 
 */
package org.weaverg.loganov.rest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bson.types.ObjectId;
import org.weaverg.loganov.mongo.model.Drink;
import org.weaverg.loganov.mongo.model.Ingredient;
import org.weaverg.loganov.mongo.model.Venue2;

/**
 * @author Gregory Weaver
 *
 */
@Path("/venue")
public class VenueResource {

	@Path("/{venueId}")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Venue2 getVenue(@PathParam("venueId") String venueId) {
		Ingredient i = new Ingredient();
		i.setBrand("Hangar One");
		i.setName("Vodka");
		
		Drink d = new Drink();
		d.setName("Moscow Mule");
		d.setPrice(10.00);
		d.setIngredients(Arrays.asList(i));
	
		Venue2 v1 = new Venue2();
		v1.setId(new ObjectId());
		v1.setName("Bar Agricole");
		v1.setDrinks(Arrays.asList(d));
		
		return v1;
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Venue2> getVenueList() {
		Venue2 v1 = new Venue2();
		v1.setId(new ObjectId());
		v1.setName("Bar Agricole");
		//return v1;
		
		Venue2 v2 = new Venue2();
		v2.setId(new ObjectId());
		v2.setName("15 Romolo");
		//return v2;
		
		return Arrays.asList(v1, v2);
	}
	
}

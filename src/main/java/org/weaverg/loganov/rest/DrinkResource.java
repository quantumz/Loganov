package org.weaverg.loganov.rest;

import java.util.Arrays;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.weaverg.loganov.mongo.model.Drink;
import org.weaverg.loganov.mongo.model.Ingredient;

@Path("/drink")
public class DrinkResource {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Drink getDrink() {
		Ingredient i = new Ingredient();
		i.setName("Vodka");
		i.setBrand("Hangar One");
		
		Drink d = new Drink();
		d.setName("Moscow Mule");
		d.setPrice(10.00d);
		d.setIngredients(Arrays.asList(i));
		
		return d;
	}
	
	@POST
	@Consumes("application/json")
	public void createDrink(Drink d) {
		System.out.println(d.toString());
	}
	
}

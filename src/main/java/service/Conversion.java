package service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Conversion")
public class Conversion {
	    @GET
	    @Path("/conversionEuroDinar/{montant}")
	    @Produces(MediaType.APPLICATION_JSON)  //le resultat de client en format JSON
	    @Consumes(MediaType.APPLICATION_JSON)// la requete de client en format JSON
		public double conversionEuroDinar(@PathParam(value = "montant") double mt) {
			return mt*157.59;
		}
	    @GET
	    @Path("/conversionDollarDinar/{montant}")
	    @Produces(MediaType.APPLICATION_JSON)
	    @Consumes(MediaType.APPLICATION_JSON)
		public double conversionDollarDinar (@PathParam(value = "montant") double mt) {
	    	return mt*138.97;
		}
}
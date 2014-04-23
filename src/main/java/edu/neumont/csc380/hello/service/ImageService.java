package edu.neumont.csc380.hello.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/images")
@Consumes("application/json")
@Produces("application/json")
public interface ImageService {

	@GET
	@Path("/{id")
	@Produces("image/jpg")
	Response getImage(@PathParam("id") int id);
	
	@PUT
	@Path("/{id}")
	@Consumes("")
	@Produces("")
	Response updateImage(@PathParam("id") int id, Image image);
	
	@POST
	@Consumes("")
	@Produces("")
	Response createImage(Image image);
	
	@DELETE
	@Path("/{id}")
	Response deleteImage(@PathParam("id") int id);
	
	
}

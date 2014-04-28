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


@Path("/image")
public interface ImageService {

	@GET
	@Path("/{id")
	@Produces({"image/jpg", "image/png"})
	Response getImage(@PathParam("id") Long id);
	
	@PUT
	@Path("/{id}")
	@Consumes({"image/jpg", "image/png"})
	@Produces("application/json")
	Response updateImage(@PathParam("id") Long id, Image image);
	
	@POST
	@Consumes({"image/jpg", "image/png"})
	@Produces("application/json")
	Response createImage(Image image);
	
	@DELETE
	@Path("/{id}")
	Response deleteImage(@PathParam("id") Long id);
	
	
}

package edu.neumont.csc380.hello.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/index")
public interface ContentService {
	@GET
	@Path("/{name}")
	@Produces("image/jpg")
	public void addImage(Image image);
	public void updateImage(Image image);
	public Image getImage(int id);
	public void deleteImage(int id);
}

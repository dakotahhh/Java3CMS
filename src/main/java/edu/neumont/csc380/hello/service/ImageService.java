package edu.neumont.csc380.hello.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/images")
@Consumes("application/json")
@Produces("application/json")
public interface ImageService {

}

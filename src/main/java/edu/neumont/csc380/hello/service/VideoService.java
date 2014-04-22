package edu.neumont.csc380.hello.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/video")
public interface VideoService {
	@GET
	@Path("/{name}")
	@Produces("video/avi")
	public void addVideo(Video video);
	public void updateVideo(Video video);
	public Video getVideo(int id);
	public void deleteVideo(int id);
	public List<Video> getVideos();
}

package edu.neumont.csc380.hello.service;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class VideoExceptionMapper implements
		ExceptionMapper<VideoNotFoundException> {

	public Response toResponse(VideoNotFoundException arg0) {
		return Response.status(404).build();
	}

}

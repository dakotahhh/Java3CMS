package edu.neumont.csc380.hello.service;

public class ImageNotFoundException extends Exception{

	public ImageNotFoundException()
	{
		super();
	}
	
	public ImageNotFoundException(String message)
	{
		super(message);
	}
	
	public ImageNotFoundException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public ImageNotFoundException(Throwable cause)
	{
		super(cause);
	}
	
}

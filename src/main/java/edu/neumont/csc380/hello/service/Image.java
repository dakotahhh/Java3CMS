package edu.neumont.csc380.hello.service;

import org.json.simple.JSONObject;



public class Image {
	
	JSONObject obj = new JSONObject();
//	obj.put("id", new Integer(1234));
//	obj.put("fileName", "foo");
//	obj.put("width", Integer(1));
//	obj.put("height", Integer(2));
//	obj.put("filesize", Integer(123213));

	private int id;
	
	private String fileName;
	private int width;
	private int height;
	private int fileSize;
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getfileName()
	{
		return fileName;
	}
	
	public void setfileName(String fileName)
	{
		this.fileName = fileName;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public int getfileSize()
	{
		return fileSize;
	}
	
	public void setfileSize(int fileSize)
	{
		this.fileSize = fileSize;
	}
}
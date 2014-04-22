package edu.neumont.csc380.hello.service;

@Entity
public class Image {
	
	@Id
	@GeneratedValue
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
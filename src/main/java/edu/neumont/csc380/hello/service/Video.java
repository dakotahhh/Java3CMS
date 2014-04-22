package edu.neumont.csc380.hello.service;

@Entity
public class Video {

	@Id
	@GeneratedValue
	private int id;
	
	private String fileName;
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
	
	public int getfileSize()
	{
		return fileSize;
	}
	
	public void setFileSize(int fileSize)
	
	{
		this.fileSize = fileSize;
	}
	
}



package edu.neumont.csc380.hello.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "video")
public class Video {

	private Long id;
	
	private String fileName;
	private int fileSize;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
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



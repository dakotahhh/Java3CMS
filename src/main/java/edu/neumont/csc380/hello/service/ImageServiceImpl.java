package edu.neumont.csc380.hello.service;

import java.util.List;

import javax.websocket.Session;

import org.apache.cxf.service.invoker.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImageServiceImpl implements ImageService{

	
	public void addImage(Image image)
	{
		
	}

	public void updateImage(Image image) {
		// TODO Auto-generated method stub
		
	}

	public Image getImage(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteImage(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Image> getImages() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

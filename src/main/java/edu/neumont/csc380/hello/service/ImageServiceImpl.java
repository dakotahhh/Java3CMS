package edu.neumont.csc380.hello.service;

import java.util.List;

public class ImageServiceImpl implements ImageService{

	
	public void addImage(Image image)
	{
		
	}

	public void updateImage(Image image) {
		entityManager.merge(image);
		
	}

	public Image getImage(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteImage(int id) {
		Image image = entityManager.find(Podcast.class, id);
		entityManager.remove(image);
		
	}

	public List<Image> getImages() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

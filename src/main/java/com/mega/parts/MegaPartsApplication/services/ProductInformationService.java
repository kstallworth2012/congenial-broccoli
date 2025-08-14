package com.mega.parts.MegaPartsApplication.services;

public interface ProductInformationService {
	
	Entity createCountry(Entity _);
	
	List<Entity> findAll();
	

	Optional<Entity> findOne(String id);
		 
	boolean isExists(String id);

}

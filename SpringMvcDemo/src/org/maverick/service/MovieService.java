package org.maverick.service;

import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	public String findAll() {
		String jsonData = "[{\"id\":\"1\",\"title\":\"Die Hard\",\"genre\":\"Action\",\"rating\":\"4.5\",\"imageUrl\":\"http://localhost:8080/SpringMvcDemo/resources/img/Die-Hard.jpg\"},"
				+ "{\"id\":\"2\",\"title\":\"Man of Steel\",\"genre\":\"Action\",\"rating\":\"5\",\"imageUrl\":\"http://localhost:8080/SpringMvcDemo/resources/img/Man-Of-Steel.jpg\"}]";
		
		return jsonData;
	}
}

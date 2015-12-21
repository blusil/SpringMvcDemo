package org.maverick.service;

import org.maverick.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public String findAll() {
		return movieRepository.findAll();
	}
}

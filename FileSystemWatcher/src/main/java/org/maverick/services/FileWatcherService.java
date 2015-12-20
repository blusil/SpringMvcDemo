package org.maverick.services;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class FileWatcherService {

	@PostConstruct
	public void watch() {
		
	}
}

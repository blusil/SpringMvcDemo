package org.maverick.bean;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.maverick.services.MessageSenderBean;

@Stateless
@LocalBean
public class FileUtilBean {
	
	private static final Logger LOG = LogManager.getLogger(FileUtilBean.class);

	public boolean HasChild(String pathName) {
		return false;
	}
	
	public Iterable<Path> GetFiles(String pathName) {
		return new ArrayList<Path>();
	}
}

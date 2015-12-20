package org.maverick.bean.test;

import java.nio.file.Path;
import java.util.List;

import org.junit.Test;
import org.maverick.bean.FileUtilBean;

public class FileUtilBeanTest {

	@Test
	public void ShouldReturnAllFilesWhenGivenNonEmptyDirectory() {
		// Arrange
		final String path = "E:/TFS";
		FileUtilBean fileUtil = new FileUtilBean();
		
		// Act
		Iterable<Path> files = fileUtil.GetFiles(path).limit(8);
		
		// Assert
	}
}

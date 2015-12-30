package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;

public class LoggingTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggingTest.class);
	
	@Test
	public void TestLogging() {
		logger.info("Test works");
	}
}

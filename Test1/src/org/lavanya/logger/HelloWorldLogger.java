package org.lavanya.logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorldLogger {

	static final Logger logger = Logger.getLogger(HelloWorldLogger.class);
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger.debug("Hello World!");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		}
		
	}



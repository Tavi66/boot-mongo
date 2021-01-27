package com.vi.mongo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoApplication implements CommandLineRunner{

	static Logger logger = LogManager.getLogger(MongoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.debug("From Spring Boot Mongo Application");
	}

}

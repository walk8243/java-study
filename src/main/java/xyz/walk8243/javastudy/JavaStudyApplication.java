package xyz.walk8243.javastudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaStudyApplication {
	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);
	}

}

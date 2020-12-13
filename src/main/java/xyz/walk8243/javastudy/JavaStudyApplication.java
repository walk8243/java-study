package xyz.walk8243.javastudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavaStudyApplication {
	private static final Logger log = LoggerFactory.getLogger(JavaStudyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);

		RequestService requestService = new RequestService();
		String resource = requestService.getResponse();
		log.info(resource);
	}

}

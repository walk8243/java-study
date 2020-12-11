package xyz.walk8243.javastudy;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import xyz.walk8243.javastudy.lib.PrimeNumber;

@SpringBootApplication
public class JavaStudyApplication {
	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);

		PrimeNumber primeNumber = new PrimeNumber();
		ArrayList<Integer> array = primeNumber.get(100);
		logger.info(array.stream().map((i) -> i.toString()).collect(Collectors.joining(",")));
	}

}

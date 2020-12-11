package xyz.walk8243.javastudy;

// import java.util.ArrayList;
// import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

import xyz.walk8243.javastudy.lib.PrimeNumber;

@SpringBootApplication
public class JavaStudyApplication {
	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.get((int)Math.pow(2, 16));
		stopWatch.stop();
		logger.info("実行時間 => {}ms", stopWatch.getLastTaskTimeMillis());
		// logger.info(array.stream().map((i) -> i.toString()).collect(Collectors.joining(",")));
	}

}

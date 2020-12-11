package xyz.walk8243.javastudy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

import xyz.walk8243.javastudy.controller.NormalController;
import xyz.walk8243.javastudy.controller.ThreadController;

@SpringBootApplication
public class JavaStudyApplication {
	static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(JavaStudyApplication.class, args);

		StopWatch stopWatch = new StopWatch();

		stopWatch.start();
		try {
			ThreadController controller = new ThreadController();
			controller.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		stopWatch.stop();
		logger.info("並列処理 実行時間 => {}ms", stopWatch.getLastTaskTimeMillis());

		stopWatch.start();
		{
			NormalController controller = new NormalController();
			controller.execute();
		}
		stopWatch.stop();
		logger.info("直列処理 実行時間 => {}ms", stopWatch.getLastTaskTimeMillis());
	}

}

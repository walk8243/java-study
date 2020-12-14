package xyz.walk8243.javastudy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Sample {
	private static final Logger log = LoggerFactory.getLogger(JavaStudyApplication.class);

	private Integer count = 0;

	public void countUp() {
		this.count++;
		log.info("Sample.count {}", this.count);
	}
}

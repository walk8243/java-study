package xyz.walk8243.javastudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RequestService {
	@Autowired
	RestTemplate restTemplate;

	public static final String URL = "https://www.yahoo.co.jp/";

	public String getResponse() {
		return this.restTemplate().getForObject(URL, String.class);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

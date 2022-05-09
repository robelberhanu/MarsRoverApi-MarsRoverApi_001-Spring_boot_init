package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void smallTest() {

		RestTemplate rt = new RestTemplate(); // a way to issue requests(GET, POST, PUT, DELETE..), take data and map it to our own objects. 
		ResponseEntity<String> response = rt.getForEntity("https://api.nasa.gov/neo/rest/v1/feed?start_date=2015-09-07&end_date=2015-09-08&api_key=DEMO_KEY", String.class);
		System.out.println(response.getBody());
	}	

}

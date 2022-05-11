package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class MarsRoverApiApplicationTests {

	@Test
	public void smallTest() {

		RestTemplate rt = new RestTemplate(); // a way to issue requests(GET, POST, PUT, DELETE..), take data and map it to our own objects. 
		ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=DEMO_KEY", MarsRoverApiResponse.class );
		System.out.println(response.getBody());
	}	

}

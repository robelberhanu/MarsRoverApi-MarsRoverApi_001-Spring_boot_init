package com.example.marseroverapi.service;

import com.example.marseroverapi.response.MarsRoverApiResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {
    
    private static final String API_KEY = "0fI6hFwXLPbSRfCNK76NtCJaeBNGkgH4urhvsMlu";

    public MarsRoverApiResponse getRoverData(String roverType, Integer marsSol){ 
        
        RestTemplate rt = new RestTemplate(); // a way to issue requests(GET, POST, PUT, DELETE..), take data and map it to our own objects. 
		ResponseEntity<MarsRoverApiResponse> response = rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol="+marsSol+"&api_key=" + API_KEY, MarsRoverApiResponse.class );
        return response.getBody();
    }
}

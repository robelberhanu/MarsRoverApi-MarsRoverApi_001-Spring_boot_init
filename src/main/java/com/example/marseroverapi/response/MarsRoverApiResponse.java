package com.example.marseroverapi.response;


import java.util.ArrayList;

// import antlr.collections.List;

public class MarsRoverApiResponse {
    ArrayList <MarsPhoto> photos = new ArrayList<>();
    
    public ArrayList<MarsPhoto> getPhotos() {
        return photos;
    }
    public void setPhotos(ArrayList<MarsPhoto> photos) {
        this.photos = photos;
    }
    @Override
    public String toString() {
        return "MarsRoverApiResponse [photos=" + photos + "]";
    }
    
}

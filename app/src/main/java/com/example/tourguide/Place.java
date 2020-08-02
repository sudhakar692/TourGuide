package com.example.tourguide;

public class Place {

    private String mName;
    private String mLocation;
    private int mImageResourceId;

    public Place(String name, String location, int imageResourceId) {
        mName = name;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getLocation(){
        return mLocation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}

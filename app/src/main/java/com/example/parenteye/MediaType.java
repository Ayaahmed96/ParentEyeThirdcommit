package com.example.parenteye;

public class MediaType {
    private Integer MediaTypeid;
    private String  MediaTypeName;


    public MediaType(){

    }


    public MediaType(Integer mediaTypeid, String mediaTypeName) {
        MediaTypeid = mediaTypeid;
        MediaTypeName = mediaTypeName;
    }

    public void setMediaTypeid(Integer mediaTypeid) {
        MediaTypeid = mediaTypeid;
    }

    public void setMediaTypeName(String mediaTypeName) {
        MediaTypeName = mediaTypeName;

    }

    public Integer getMediaTypeid() {
        return MediaTypeid;
    }

    public String getMediaTypeName() {
        return MediaTypeName;
    }
}

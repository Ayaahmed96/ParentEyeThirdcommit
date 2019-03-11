package com.example.parenteye;

import java.sql.Time;

public class Photos {

    private String photoId;
    private String path;
    private String ownwerid;
    private String userId;

    public Photos(String photoId, String path, String ownwerid, String userId) {
        this.photoId = photoId;
        this.path = path;
        this.ownwerid = ownwerid;
        this.userId = userId;
    }

             public Photos(){

           }
    public String getPhotoId() {
        return photoId;
    }

    public String getPath() {
        return path;
    }

    public String getOwnwerid() {
        return ownwerid;
    }

    public String getUserId() {
        return userId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setOwnwerid(String ownwerid) {
        this.ownwerid = ownwerid;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

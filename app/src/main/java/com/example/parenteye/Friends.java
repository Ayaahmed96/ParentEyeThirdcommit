package com.example.parenteye;

import java.util.List;

public class Friends {
    private  String id;
    private String userId;
    private String userFriends;






    public Friends(){

    }

    public Friends(String id, String userId, String userFriends) {
        this.id = id;
        this.userId = userId;
        this.userFriends = userFriends;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserFriends(String userFriends) {
        this.userFriends = userFriends;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserFriends() {
        return userFriends;
    }
}

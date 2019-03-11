package com.example.parenteye;

import java.sql.Time;

public class Members {


    private String memeberId;
    private String UserId;
    private Time AddedTime;



    public Members(){

    }

    public Members(String memeberId, String userId, Time addedTime) {
        this.memeberId = memeberId;
        UserId = userId;
        AddedTime = addedTime;
    }

    public void setMemeberId(String memeberId) {
        this.memeberId = memeberId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setAddedTime(Time addedTime) {
        AddedTime = addedTime;
    }

    public String getMemeberId() {
        return memeberId;
    }

    public String getUserId() {
        return UserId;
    }

    public Time getAddedTime() {
        return AddedTime;
    }
}

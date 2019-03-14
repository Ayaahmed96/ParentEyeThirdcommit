package com.example.parenteye;

import java.sql.Time;

public class Members {

    private String id;
    private String typtId;  //1 if group and 2 if page
    private String communityid; // Id of group or page
    private String UserId;
    private Time AddedTime;



    public Members(){

    }

    public Members(String id, String typtId, String communityid, String userId, Time addedTime) {
        this.id = id;
        this.typtId = typtId;
        this.communityid = communityid;
        UserId = userId;
        AddedTime = addedTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTyptId(String typtId) {
        this.typtId = typtId;
    }

    public void setCommunityid(String communityid) {
        this.communityid = communityid;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setAddedTime(Time addedTime) {
        AddedTime = addedTime;
    }

    public String getId() {
        return id;
    }

    public String getTyptId() {
        return typtId;
    }

    public String getCommunityid() {
        return communityid;
    }

    public String getUserId() {
        return UserId;
    }

    public Time getAddedTime() {
        return AddedTime;
    }
}

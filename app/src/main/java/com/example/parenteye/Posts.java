package com.example.parenteye;

import java.sql.Time;
import java.util.Date;

public class Posts {
    private String postId;
    private String userId;
    private Date postdate;
    private String ownerid;

    public Posts(String postId, String userId, Time postdate, String ownerid) {
        this.postId = postId;
        this.userId = userId;
        this.postdate = postdate;
        this.ownerid = ownerid;
    }
    public Posts(){

    }
    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public String getUserId() {
        return userId;
    }

    public Date getpostdate() {
        return postdate;
    }

    public String getOwnerid() {
        return ownerid;
    }

    public void getpostdate(Date postdate) {
        this.postdate = postdate;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }
}

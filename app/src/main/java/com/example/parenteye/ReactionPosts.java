package com.example.parenteye;

import java.sql.Time;

public class ReactionPosts {
    private String ID;
    private String contentid;
    private String userid;
    private String Reactionid;
    private Time time;
    private String contentTypeid;

    public ReactionPosts(){

    }

    public ReactionPosts(String ID, String contentid, String userid, String reactionid, Time time, String contentTypeid) {
        this.ID = ID;
        this.contentid = contentid;
        this.userid = userid;
        Reactionid = reactionid;
        this.time = time;
        this.contentTypeid = contentTypeid;
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public void setContentid(String contentid) {
        this.contentid = contentid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setReactionid(String reactionid) {
        Reactionid = reactionid;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setContentTypeid(String contentTypeid) {
        this.contentTypeid = contentTypeid;
    }

    public String getID() {
        return ID;
    }

    public String getContentid() {
        return contentid;
    }

    public String getUserid() {
        return userid;
    }

    public String getReactionid() {
        return Reactionid;
    }

    public Time getTime() {
        return time;
    }

    public String getContentTypeid() {
        return contentTypeid;
    }
}


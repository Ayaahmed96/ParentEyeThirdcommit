package com.example.parenteye;

import java.sql.Time;

public class ReactionPosts {
    private String ID;
    private String postId;
    private String userid;
    private String Reactionid;


    public ReactionPosts(){

    }

    public ReactionPosts(String ID, String postId, String userid, String reactionid, Time time, String contentTypeid) {
        this.ID = ID;
        this.postId = postId;
        this.userid = userid;
        Reactionid = reactionid;

    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public void setpostId(String postId) {
        this.postId = postId;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setReactionid(String reactionid) {
        Reactionid = reactionid;
    }


    public String getID() {
        return ID;
    }

    public String getpostId() {
        return postId;
    }

    public String getUserid() {
        return userid;
    }

    public String getReactionid() {
        return Reactionid;
    }


}


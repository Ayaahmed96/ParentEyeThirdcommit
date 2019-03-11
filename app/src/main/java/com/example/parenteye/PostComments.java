package com.example.parenteye;

import java.sql.Time;

public class PostComments {
    private String PostCommentId;
    private String userId;
    private Time time;
    private String PostId;

    public PostComments(String postCommentId, String userId, Time time, String postId) {
        PostCommentId = postCommentId;
        this.userId = userId;
        this.time = time;
        PostId = postId;
    }
    public PostComments(){

    }

    public String getPostCommentId() {
        return PostCommentId;
    }

    public String getUserId() {
        return userId;
    }

    public Time getTime() {
        return time;
    }

    public String getPostId() {
        return PostId;
    }

    public void setPostCommentId(String postCommentId) {
        PostCommentId = postCommentId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setPostId(String postId) {
        PostId = postId;
    }
}

package com.example.parenteye;

import java.sql.Time;

public class CommentReplies {


    private String CommentRepliesid;
    private  String userId;
    private String commentId;
    private Time time;

    public CommentReplies(){

    }

    public CommentReplies(String commentRepliesid, String userId, String commentId, Time time) {
        CommentRepliesid = commentRepliesid;
        this.userId = userId;
        this.commentId = commentId;
        this.time = time;
    }


    public void setCommentRepliesid(String commentRepliesid) {
        CommentRepliesid = commentRepliesid;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getCommentRepliesid() {
        return CommentRepliesid;
    }

    public String getUserId() {
        return userId;
    }

    public String getCommentId() {
        return commentId;
    }

    public Time getTime() {
        return time;
    }
}

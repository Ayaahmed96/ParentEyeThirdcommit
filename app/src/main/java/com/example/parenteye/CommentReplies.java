package com.example.parenteye;

import java.sql.Time;

public class CommentReplies {


    private String CommentRepliesid;
    private  String userId;
    private String commentId;
    private String Replycontent;
    private boolean  hasimage;  //1 if reply contain image and 0 if reply do not
    private String imageid;
    private Time time;

    public CommentReplies(){

    }

    public CommentReplies(String commentRepliesid, String userId, String commentId, String replycontent, boolean hasimage, String imageid, Time time) {
        CommentRepliesid = commentRepliesid;
        this.userId = userId;
        this.commentId = commentId;
        Replycontent = replycontent;
        this.hasimage = hasimage;
        this.imageid = imageid;
        this.time = time;
    }

    public String getReplycontent() {
        return Replycontent;
    }

    public boolean isHasimage() {
        return hasimage;
    }

    public String getImageid() {
        return imageid;
    }

    public void setReplycontent(String replycontent) {
        Replycontent = replycontent;
    }

    public void setHasimage(boolean hasimage) {
        this.hasimage = hasimage;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
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

package com.example.parenteye;

import java.sql.Date;
import java.sql.Time;

public class PostComments {
    private String id;
    private String commentcontent;
    private String userId;
    private String PostId;
    private boolean hasreply; // 1 if this comment has reply
    private boolean hasimage; // 1 if comment has image and 0 if comment do nit have image
    private String imageId;

    public PostComments(String id, String commentcontent, String userId, String postId, boolean hasreply, boolean hasimage, String imageId) {
        this.id = id;
        this.commentcontent = commentcontent;
        this.userId = userId;
        PostId = postId;
        this.hasreply = hasreply;
        this.hasimage = hasimage;
        this.imageId = imageId;
    }

    public PostComments(){

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPostId(String postId) {
        PostId = postId;
    }

    public void setHasreply(boolean hasreply) {
        this.hasreply = hasreply;
    }

    public void setHasimage(boolean hasimage) {
        this.hasimage = hasimage;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getId() {
        return id;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public String getUserId() {
        return userId;
    }

    public String getPostId() {
        return PostId;
    }

    public boolean isHasreply() {
        return hasreply;
    }

    public boolean isHasimage() {
        return hasimage;
    }

    public String getImageId() {
        return imageId;
    }
}

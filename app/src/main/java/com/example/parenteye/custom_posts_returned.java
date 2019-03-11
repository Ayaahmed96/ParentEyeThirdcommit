package com.example.parenteye;

import java.util.Date;

public class custom_posts_returned {

    private String post_text;
    private String profile_image=noimage;
    private String post_image=noimage;
    private Date post_date;
    private  static  final String noimage="-1";


    public custom_posts_returned(){

    }

    public custom_posts_returned(String post_text, String profile_image, String post_image, Date post_date) {
        this.post_text = post_text;
        this.profile_image = profile_image;
        this.post_image = post_image;
        this.post_date = post_date;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }

    public void setPost_image(String post_image) {
        this.post_image = post_image;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getPost_text() {
        return post_text;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public String getPost_image() {
        return post_image;
    }

    public Date getPost_date() {
        return post_date;
    }
    public boolean hasprofieimage(){
        return profile_image!=noimage;
    }
    public boolean haspostimage(){
       return  post_image!=noimage;
    }
}

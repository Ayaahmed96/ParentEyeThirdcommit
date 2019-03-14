package com.example.parenteye;

import android.graphics.Bitmap;
import android.net.Uri;

import java.net.URI;
import java.util.Date;

public class custom_posts_returned {
    private String post_owner_name;
    private String post_text;
    private Bitmap profile_image;
    private Bitmap post_image;
    private Date post_date;
   // private  static  final String noimage="-1";



    public custom_posts_returned(){

    }

    public custom_posts_returned(String post_text, Bitmap profile_image, Bitmap post_image, Date post_date,String post_owner_name) {
        this.post_text = post_text;
        this.profile_image = profile_image;
        this.post_image = post_image;
        this.post_date = post_date;
        this.post_owner_name=post_owner_name;
    }

    public void setPost_owner_name(String post_owner_name) {
        this.post_owner_name = post_owner_name;
    }

    public String getPost_owner_name() {
        return post_owner_name;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }

    public void setProfile_image(Bitmap profile_image) {
        this.profile_image = profile_image;
    }

    public void setPost_image(Bitmap post_image) {
        this.post_image = post_image;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public String getPost_text() {
        return post_text;
    }

    public Bitmap getProfile_image() {
        return profile_image;
    }

    public Bitmap getPost_image() {
        return post_image;
    }

    public Date getPost_date() {
        return post_date;
    }
    public boolean hasprofieimage(){
        if(profile_image!=null){
            return true;
        }
       else{
           return false;
        }

    }
    public boolean haspostimage(){
        if(post_image!=null){
            return true;
        }
        else{
            return false;
        }
    }
}

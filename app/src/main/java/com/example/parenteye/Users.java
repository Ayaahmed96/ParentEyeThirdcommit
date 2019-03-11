package com.example.parenteye;

import android.net.Uri;

import java.util.Date;

public class Users {
    private String userId;
    private String Username;
    private Date dateofbirth;
    private String location;
    private boolean gender;
    private String RoleId;
    private boolean ActiveStatus;
    private String profile_pic_id;


    public Users(String userId, String username, Date dateofbirth, String location, boolean gender, String roleId, boolean activeStatus, String profile_pic_id) {

        this.userId = userId;
        Username = username;
        this.dateofbirth = dateofbirth;
        this.location = location;
        this.gender = gender;
        RoleId = roleId;
        ActiveStatus = activeStatus;
        this.profile_pic_id = profile_pic_id;
    }
  public Users(){

  }


    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setRoleId(String roleId) {
        RoleId = roleId;
    }

    public void setActiveStatus(boolean activeStatus) {
        ActiveStatus = activeStatus;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return Username;
    }


    public Date getDateofbirth() {
        return dateofbirth;
    }

    public String getLocation() {
        return location;
    }

    public boolean isGender() {
        return gender;
    }

    public String getRoleId() {
        return RoleId;
    }

    public boolean isActiveStatus() {
        return ActiveStatus;
    }

    public String getProfile_pic_id() {
        return profile_pic_id;
    }

    public void setProfile_pic_id(String profile_pic_id) {
        this.profile_pic_id = profile_pic_id;
    }
}

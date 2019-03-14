package com.example.parenteye;

import java.sql.Time;

public class FriendRequest {

    private String friendRequestid;
    private String Senderid;
    private String Recieverid;
    private Integer state;  //0 if ignore and 1 if pending
    private Time time;


    public FriendRequest(){

    }

    public FriendRequest(String friendRequestid, String senderid, String recieverid, Integer state, Time time) {
        this.friendRequestid = friendRequestid;
        Senderid = senderid;
        Recieverid = recieverid;
        this.state = state;
        this.time = time;
    }

    public void setFriendRequestid(String friendRequestid) {
        this.friendRequestid = friendRequestid;
    }

    public void setSenderid(String senderid) {
        Senderid = senderid;
    }

    public void setRecieverid(String recieverid) {
        Recieverid = recieverid;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getFriendRequestid() {
        return friendRequestid;
    }

    public String getSenderid() {
        return Senderid;
    }

    public String getRecieverid() {
        return Recieverid;
    }

    public Integer getState() {
        return state;
    }

    public Time getTime() {
        return time;
    }
}

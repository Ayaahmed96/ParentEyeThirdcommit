package com.example.parenteye;

public class GroupRequests {
    private String id;
    private String GroupId;
    private String Userid;
    private Integer state;

    public GroupRequests(){

    }

    public GroupRequests(String id, String groupId, String userid, Integer state) {
        this.id = id;
        GroupId = groupId;
        Userid = userid;
        this.state = state;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public String getGroupId() {
        return GroupId;
    }

    public String getUserid() {
        return Userid;
    }

    public Integer getState() {
        return state;
    }
}

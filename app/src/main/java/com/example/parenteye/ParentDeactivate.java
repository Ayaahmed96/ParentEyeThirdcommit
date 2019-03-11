package com.example.parenteye;

import java.sql.Time;

public class ParentDeactivate {
    private String id;
    private String parentid;
    private String childId;
    private Time time;
    private Time duration;


    public ParentDeactivate(){

    }

    public ParentDeactivate(String id, String parentid, String childId, Time time, Time duration) {
        this.id = id;
        this.parentid = parentid;
        this.childId = childId;
        this.time = time;
        this.duration = duration;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }


    public String getId() {
        return id;
    }

    public String getParentid() {
        return parentid;
    }

    public String getChildId() {
        return childId;
    }

    public Time getTime() {
        return time;
    }

    public Time getDuration() {
        return duration;
    }
}

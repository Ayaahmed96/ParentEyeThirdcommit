package com.example.parenteye;

import java.sql.Time;

public class Suggesstions {
    private  String Id;
    private String RecommenderId;
    private String RecommendeeId;
    private String RecommendationId;
    private String typeid;
    private boolean seen;
    private Time time;


    public Suggesstions(){

    }

    public Suggesstions(String id, String recommenderId, String recommendeeId, String recommendationId, String typeid, boolean seen, Time time) {
        Id = id;
        RecommenderId = recommenderId;
        RecommendeeId = recommendeeId;
        RecommendationId = recommendationId;
        this.typeid = typeid;
        this.seen = seen;
        this.time = time;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setRecommenderId(String recommenderId) {
        RecommenderId = recommenderId;
    }

    public void setRecommendeeId(String recommendeeId) {
        RecommendeeId = recommendeeId;
    }

    public void setRecommendationId(String recommendationId) {
        RecommendationId = recommendationId;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getId() {
        return Id;
    }

    public String getRecommenderId() {
        return RecommenderId;
    }

    public String getRecommendeeId() {
        return RecommendeeId;
    }

    public String getRecommendationId() {
        return RecommendationId;
    }

    public String getTypeid() {
        return typeid;
    }

    public boolean isSeen() {
        return seen;
    }

    public Time getTime() {
        return time;
    }
}

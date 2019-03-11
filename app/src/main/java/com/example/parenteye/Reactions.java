package com.example.parenteye;

import java.sql.Time;

public class Reactions {

    private String Reactionid;
    private String ReactionImage;
    public Reactions(){

    }

    public Reactions(String reactionid, String reactionImage) {
        Reactionid = reactionid;
        ReactionImage = reactionImage;
    }

    public void setReactionid(String reactionid) {
        Reactionid = reactionid;
    }

    public void setReactionImage(String reactionImage) {
        ReactionImage = reactionImage;
    }

    public String getReactionid() {
        return Reactionid;
    }

    public String getReactionImage() {
        return ReactionImage;
    }
}

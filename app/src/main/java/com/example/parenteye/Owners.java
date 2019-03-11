package com.example.parenteye;

public class Owners {
    private Integer OwnerId;
    private String ownername;


    public Owners(){

    }

    public Owners(Integer ownerId, String ownername) {
        OwnerId = ownerId;
        this.ownername = ownername;
    }


    public void setOwnerId(Integer ownerId) {
        OwnerId = ownerId;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }


    public Integer getOwnerId() {
        return OwnerId;
    }

    public String getOwnername() {
        return ownername;
    }
}

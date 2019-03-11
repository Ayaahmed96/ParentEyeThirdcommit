package com.example.parenteye;

import java.util.Date;

public class Community {
    private String CommunityId;
    private Date createdDate;
    private String coverPhotoId;
    private String PhotoId;
    private String AdminId;
    private String typeId;



    public Community(){

    }
    public Community(String communityId, Date createdDate, String coverPhotoId, String photoId, String adminId, String typeId) {
        CommunityId = communityId;
        this.createdDate = createdDate;
        this.coverPhotoId = coverPhotoId;
        PhotoId = photoId;
        AdminId = adminId;
        this.typeId = typeId;
    }

    public void setCommunityId(String communityId) {
        CommunityId = communityId;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setCoverPhotoId(String coverPhotoId) {
        this.coverPhotoId = coverPhotoId;
    }

    public void setPhotoId(String photoId) {
        PhotoId = photoId;
    }

    public void setAdminId(String adminId) {
        AdminId = adminId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getCommunityId() {
        return CommunityId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getCoverPhotoId() {
        return coverPhotoId;
    }

    public String getPhotoId() {
        return PhotoId;
    }

    public String getAdminId() {
        return AdminId;
    }

    public String getTypeId() {
        return typeId;
    }
}

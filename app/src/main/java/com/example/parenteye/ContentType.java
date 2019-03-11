package com.example.parenteye;

public class ContentType {
    private Integer ContentTypeId;
    private String ContentTypeName;


    public ContentType(){

    }

    public ContentType(Integer contentTypeId, String contentTypeName) {
        ContentTypeId = contentTypeId;
        ContentTypeName = contentTypeName;
    }

    public void setContentTypeId(Integer contentTypeId) {
        ContentTypeId = contentTypeId;
    }

    public void setContentTypeName(String contentTypeName) {
        ContentTypeName = contentTypeName;
    }

    public Integer getContentTypeId() {
        return ContentTypeId;
    }

    public String getContentTypeName() {
        return ContentTypeName;
    }
}

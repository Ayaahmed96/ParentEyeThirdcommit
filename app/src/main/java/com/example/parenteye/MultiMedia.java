package com.example.parenteye;

public class MultiMedia {


      private String multimediaId;
      private String mediapath;
      private String mediaTypeId;
      private String contentTypeId;
     private String resultcontentid;


     public MultiMedia(){

     }

    public void setMultimediaId(String multimediaId) {
        this.multimediaId = multimediaId;
    }

    public void setMediapath(String mediapath) {
        this.mediapath = mediapath;
    }

    public void setMediaTypeId(String mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public void setContentTypeId(String contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public void setResultcontentid(String resultcontentid) {
        this.resultcontentid = resultcontentid;
    }

    public MultiMedia(String multimediaId, String mediapath, String mediaTypeId, String contentTypeId, String resultcontentid) {
        this.multimediaId = multimediaId;
        this.mediapath = mediapath;
        this.mediaTypeId = mediaTypeId;
        this.contentTypeId = contentTypeId;
        this.resultcontentid = resultcontentid;
    }

    public String getMultimediaId() {
        return multimediaId;
    }

    public String getMediapath() {
        return mediapath;
    }

    public String getMediaTypeId() {
        return mediaTypeId;
    }

    public String getContentTypeId() {
        return contentTypeId;
    }

    public String getResultcontentid() {
        return resultcontentid;
    }
}

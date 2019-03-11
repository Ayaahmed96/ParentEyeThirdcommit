package com.example.parenteye;

public class TextContent {


    private String TextContentid;
    private String Contentid;
    private String content;
    private String contentTypeid;


    public  TextContent(){

    }

    public TextContent(String textContentid, String contentid, String content, String contentTypeid) {
        TextContentid = textContentid;
        Contentid = contentid;
        this.content = content;
        this.contentTypeid = contentTypeid;
    }


    public void setTextContentid(String textContentid) {
        TextContentid = textContentid;
    }

    public void setContentid(String contentid) {
        Contentid = contentid;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContentTypeid(String contentTypeid) {
        this.contentTypeid = contentTypeid;
    }


    public String getTextContentid() {
        return TextContentid;
    }

    public String getContentid() {
        return Contentid;
    }

    public String getContent() {
        return content;
    }

    public String getContentTypeid() {
        return contentTypeid;
    }
}

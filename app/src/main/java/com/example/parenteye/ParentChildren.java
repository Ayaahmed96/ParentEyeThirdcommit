package com.example.parenteye;

public class ParentChildren {
    private String parentChildrenId;
    private String parentId;
    private String childId;


    public ParentChildren(){

    }

    public ParentChildren(String parentChildrenId, String parentId, String childId) {
        this.parentChildrenId = parentChildrenId;
        this.parentId = parentId;
        this.childId = childId;
    }

    public void setParentChildrenId(String parentChildrenId) {
        this.parentChildrenId = parentChildrenId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getParentChildrenId() {
        return parentChildrenId;
    }

    public String getParentId() {
        return parentId;
    }

    public String getChildId() {
        return childId;
    }
}

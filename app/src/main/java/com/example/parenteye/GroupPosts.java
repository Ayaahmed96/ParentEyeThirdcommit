package com.example.parenteye;

public class GroupPosts {
    private String GroupPostsId;
    private String GroupId;
    private String PostId;

    public GroupPosts(){

    }

    public GroupPosts(String groupPostsId, String groupId, String postId) {
        GroupPostsId = groupPostsId;
        GroupId = groupId;
        PostId = postId;
    }

    public void setGroupPostsId(String groupPostsId) {
        GroupPostsId = groupPostsId;
    }

    public void setGroupId(String groupId) {
        GroupId = groupId;
    }

    public void setPostId(String postId) {
        PostId = postId;
    }

    public String getGroupPostsId() {
        return GroupPostsId;
    }

    public String getGroupId() {
        return GroupId;
    }

    public String getPostId() {
        return PostId;
    }
}

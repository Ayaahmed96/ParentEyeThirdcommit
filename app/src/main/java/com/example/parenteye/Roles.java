package com.example.parenteye;

public class Roles {

    private String RoleId;
    private String RoleName;

    public Roles(String roleId, String roleName) {
        RoleId = roleId;
        RoleName = roleName;
    }


    public Roles(){

    }

    public void setRoleId(String roleId) {
        RoleId = roleId;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    public String getRoleId() {
        return RoleId;
    }

    public String getRoleName() {
        return RoleName;
    }
}

package com.example.parenteye;

import android.provider.ContactsContract;

import java.util.Date;

public class Notifications {
    private String id;
    private String userId;
    private String NotificationMessage;
    private Date date;
    private boolean seen;

    public Notifications(){

    }

    public Notifications(String id, String userId, String notificationMessage, Date date, boolean seen) {
        this.id = id;
        this.userId = userId;
        NotificationMessage = notificationMessage;
        this.date = date;
        this.seen = seen;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setNotificationMessage(String notificationMessage) {
        NotificationMessage = notificationMessage;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getNotificationMessage() {
        return NotificationMessage;
    }

    public Date getDate() {
        return date;
    }

    public boolean isSeen() {
        return seen;
    }
}

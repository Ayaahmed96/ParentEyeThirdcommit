package com.example.parenteye;

import java.sql.Time;

public class Chat {

    private String ChatId;
    private String senderId;
    private String RecieverId;
    private Time time;


    public Chat(){

    }

    public Chat(String chatId, String senderId, String recieverId, Time time) {
        ChatId = chatId;
        this.senderId = senderId;
        RecieverId = recieverId;
        this.time = time;
    }

    public void setChatId(String chatId) {
        ChatId = chatId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public void setRecieverId(String recieverId) {
        RecieverId = recieverId;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getChatId() {
        return ChatId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getRecieverId() {
        return RecieverId;
    }

    public Time getTime() {
        return time;
    }
}

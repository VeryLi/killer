package com.killer.model;

public class RequestObj {
    private String userID;
    private String userName;
    private int age;
    private boolean isOk = false;
    private boolean isReceived = false;
    private String data = "None";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsOk() {
        return isOk;
    }

    public void setIsOk(boolean ok) {
        this.isOk = ok;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public boolean getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(boolean received) {
        this.isReceived = received;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toString() {
        return "Receive [ " + this.isReceived + " ]; Customer ID is " + this.userID +
                ", name is " + this.userName + ", age is " + this.age + ", data is " + this.data +
                ", is a good customer: " + this.isOk;
    }
}

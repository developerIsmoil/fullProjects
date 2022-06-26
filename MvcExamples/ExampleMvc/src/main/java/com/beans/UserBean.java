package com.beans;

import com.model.User;

public class UserBean {

    public static User user;

    public void setUser(User userA) {
        user = userA;
    }

    public String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

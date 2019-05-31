package com.transit.users;

import com.transit.other.IDisplay;

public abstract class User implements IDisplay
{
    protected int id;
    protected String password;
    protected String loginStatus;

    public User(){
    }

    public User(int id, String password, String loginStatus) {
        this.id = id;
        this.password = password;
        this.loginStatus = loginStatus;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }



}

package com.transit.users;

import com.transit.other.IDisplay;

public abstract class User implements IDisplay
{
    protected int id;
    protected String password;
    protected String loginStatus;

    public User(){
    }
    
}

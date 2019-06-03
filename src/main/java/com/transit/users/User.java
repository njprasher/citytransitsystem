package com.transit.users;

import com.transit.other.Interfaces.IDisplay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class User implements IDisplay
{
    private int id;
    private String password;
    private String loginStatus;

    public User(){
        loginStatus = "LogOut";
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

    public Boolean isEmailValid(String riderEmail)  //https://www.geeksforgeeks.org/check-email-address-valid-not-java/
    {
        final Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+
                        "[a-zA-Z0-9_+&*-]+)*@" +
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                        "A-Z]{2,7}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(riderEmail);
        return matcher.find();
    }

    public Boolean isContactNumberValid(String riderContact)  //https://www.geeksforgeeks.org/check-email-address-valid-not-java/
    {
        final Pattern VALID_CONTACT_NUMBER_REGEX =
                Pattern.compile("^\\(?([0-9]{3})\\)?[-.●]?([0-9]{3})[-.●]?([0-9]{4})$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = VALID_CONTACT_NUMBER_REGEX .matcher(riderContact);
        return matcher.find();
    }



}

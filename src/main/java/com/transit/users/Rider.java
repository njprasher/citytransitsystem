package com.transit.users;

import com.transit.card.Card;
import com.transit.other.DriverType;

import java.util.Date;

public class Rider extends User
{
    private String riderName;
    private Date riderBirth;
    private String riderEmail;
    private String riderContact;
    private Card card;

    public Rider() {
    }

    /**
     *
     * @param id Unique identification for every user
     * @param password Set of characters, numbers and symbols to verify the user's authenticity when combined with user's id
     * @param loginStatus holds the login status for every user
     */
    public Rider(int id, String password, String loginStatus) {
        super(id, password, loginStatus);
    }

    /**
     *
     * @param riderName name of rider
     * @param riderBirth birth date of rider
     * @param riderEmail email of rider
     * @param riderContact phone number of rider
     * @param card card held by user
     */

    public Rider(String riderName, Date riderBirth, String riderEmail, String riderContact, Card card) {
        this.riderName = riderName;
        this.riderBirth = riderBirth;
        this.riderEmail = riderEmail;
        this.riderContact = riderContact;
        this.card = card;
    }

    public Rider(int id, String password, String loginStatus, String riderName, Date riderBirth, String riderEmail, String riderContact, Card card) {
        super(id, password, loginStatus);
        this.riderName = riderName;
        this.riderBirth = riderBirth;
        this.riderEmail = riderEmail;
        this.riderContact = riderContact;
        this.card = card;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public Date getRiderBirth() {
        return riderBirth;
    }

    public void setRiderBirth(Date riderBirth) {
        this.riderBirth = riderBirth;
    }

    public String getRiderEmail() {
        return riderEmail;
    }

    public void setRiderEmail(String riderEmail) {
        this.riderEmail = riderEmail;
    }

    public String getRiderContact() {
        return riderContact;
    }

    public void setRiderContact(String riderContact) {
        this.riderContact = riderContact;
    }

    public Card getCard() {
        return card;
    }


    public void setCard(Card card)
    {
        this.card = card;
    }
    public void getRoute()
    {
        DriverType driverType= DriverType.Brampton;
    }


    @Override
    public String getDriverName() {
        }

    @Override
    public int getDriverPhone() {

        return 5;
    }

    @Override
    public String getDriverEmail() {

        return "";
    }
}

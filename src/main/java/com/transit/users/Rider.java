package com.transit.users;

import com.transit.card.Card;
import com.transit.other.Enum_Classes.DriverType;

import java.util.Date;

public class Rider extends User
{
    private String riderName;
    private Date riderBirth;
    private int riderBalance;
    private String riderEmail;
    private int riderContact;
    private int recentTicketId;
    private int categoryId;
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

    public Rider(String riderName, Date riderBirth, int riderBalance, String riderEmail, int riderContact, int recentTicketId, int categoryId, Card card) {
        this.riderName = riderName;
        this.riderBirth = riderBirth;
        this.riderBalance = riderBalance;
        this.riderEmail = riderEmail;
        this.riderContact = riderContact;
        this.recentTicketId = recentTicketId;
        this.categoryId = categoryId;
        this.card = card;
    }

    public Rider(int id, String password, String loginStatus, String riderName, Date riderBirth, int riderBalance, String riderEmail, int riderContact, int recentTicketId, int categoryId, Card card) {
        super(id, password, loginStatus);
        this.riderName = riderName;
        this.riderBirth = riderBirth;
        this.riderBalance = riderBalance;
        this.riderEmail = riderEmail;
        this.riderContact = riderContact;
        this.recentTicketId = recentTicketId;
        this.categoryId = categoryId;
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

    public int getRiderBalance() {
        return riderBalance;
    }

    public void setRiderBalance(int riderBalance) {
        this.riderBalance = riderBalance;
    }

    public String getRiderEmail() {
        return riderEmail;
    }

    public void setRiderEmail(String riderEmail) {
        this.riderEmail = riderEmail;
    }

    public int getRiderContact() {
        return riderContact;
    }

    public void setRiderContact(int riderContact) {
        this.riderContact = riderContact;
    }

    public int getRecentTicketId() {
        return recentTicketId;
    }

    public void setRecentTicketId(int recentTicketId) {
        this.recentTicketId = recentTicketId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
        return "";}

    @Override
    public int getDriverPhone() {

        return 5;
    }

    @Override
    public String getDriverEmail() {

        return "";
    }
}

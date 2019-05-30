package com.transit.card;

public class Card
{
    protected int cardNumber;
    protected float balance;

    enum categoryType
    {
        ADULT, STUDENT, SENIOR, YOUNG, CHILD
    }

    protected boolean riderPass;
    protected int recentTicketId;

    public Card() {
    }

    public Card(int cardNumber, float balance, boolean riderPass, int recentTicketId) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.riderPass = riderPass;
        this.recentTicketId = recentTicketId;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isRiderPass() {
        return riderPass;
    }

    public void setRiderPass(boolean riderPass) {
        this.riderPass = riderPass;
    }

    public int getRecentTicketId() {
        return recentTicketId;
    }

    public void setRecentTicketId(int recentTicketId) {
        this.recentTicketId = recentTicketId;
    }

    public void loadFund()
    {

    }
    public void loadPass()
    {

    }
    public void changeType()
    {

    }
    public void lostCard()
    {

    }
}

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

    public Card(int cardNumber, float balance, boolean riderPass) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.riderPass = riderPass;
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

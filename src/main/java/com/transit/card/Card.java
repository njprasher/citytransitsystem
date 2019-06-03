package com.transit.card;

import com.transit.other.Interfaces.IDisplay;

public class Card implements IDisplay
{
    protected enum CategoryType
    {
        ADULT, STUDENT, SENIOR, YOUNG, CHILD
    }

    protected int cardNumber;
    protected float balance;
    protected CategoryType categoryType;
    protected boolean riderPass;
    protected boolean cardStatus;

    public Card()
    {
        this.balance = 0.0f;
        this.categoryType = CategoryType.ADULT;
        this.riderPass = false;
        this.cardStatus = true;
    }

    public Card(int cardNumber, float balance, CategoryType categoryType, boolean riderPass, boolean cardStatus) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.categoryType = categoryType;
        this.riderPass = riderPass;
        this.cardStatus = cardStatus;
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

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public boolean isRiderPass() {
        return riderPass;
    }

    public void setRiderPass(boolean riderPass) {
        this.riderPass = riderPass;
    }

    public boolean isCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(boolean cardStatus) {
        this.cardStatus = cardStatus;
    }

    public void loadFund(int addedMoney)
    {
        this.balance = this.balance + addedMoney;
    }
    public void loadPass()
    {
        this.riderPass = true;
    }

    public void lostCard()
    {
        this.setCardStatus(false);
    }

    @Override
    public String Display()
    {
        String riderPass;
        String cardStatus;
        if ( this.isRiderPass() )
        {
            riderPass = "Active";
        }else riderPass ="Inactive";

        if ( this.isCardStatus() )
        {
            cardStatus = "Active";
        }else cardStatus = "Inactive";

        return("----------------------" +
                "\n-----Card Details-----" +
                "\n----------------------" +
                "\nCard Number: " + this.getCardNumber() +
                "\nBalance: " + this.getBalance()+
                "\nCategory Type: " + this.getCategoryType()+
                "\nRider Pass: " + riderPass +
                "\nCard Status " + cardStatus
                );
    }

}

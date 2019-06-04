package com.transit.card;

import com.transit.other.Interfaces.IDisplay;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

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

    /**
     *
     * @param cardNumber stores the unique identification number of card
     * @param balance stores the current balance of the card
     * @param categoryType stores the category type of card as per user i.e it can be ADULT/STUDENT/SENIOR/YOUNG/CHILD
     * @param riderPass describes if there is a pass loaded on the card or not
     * @param cardStatus describes if the card is active or inactive
     */

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

    public void writeCardDetailsToFile()
    {
        JSONObject cardDetails = new JSONObject();

        cardDetails.put("cardNumber", this.cardNumber);
        cardDetails.put("balance", this.balance);
        cardDetails.put("categoryType", this.categoryType);
        cardDetails.put("riderPass", this.riderPass);
        cardDetails.put("cardStatus", this.cardStatus);

        JSONObject cardObject = new JSONObject();
        cardObject.put("cards", cardDetails);

        //Add cards to list
        JSONArray cardList = new JSONArray();
        cardList.add(cardObject);

        //Write JSON file
        try (FileWriter file = new FileWriter("cards.json")) {

            file.write(cardList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readCardDetailsFromFile() {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("cards.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray cardList = (JSONArray) obj;

            //Iterate over array
            cardList.forEach(card -> parseCardObject((JSONObject) card));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    private void parseCardObject(JSONObject card)
    {
        //Get card object within list
        JSONObject cardObject = (JSONObject) card.get("cards");

        int cardNumber = (int) cardObject.get("cardNumber");
        this.setCardNumber(cardNumber);

        float balance = (float) cardObject.get("balance");
        this.setBalance(balance);

        CategoryType categoryType = (CategoryType) cardObject.get("categoryType");
        this.setCategoryType(categoryType);

        boolean riderPass = (boolean) cardObject.get("riderPass");
        this.setRiderPass(riderPass);

        boolean cardStatus = (boolean) cardObject.get("cardStatus");
        this.setCardStatus(cardStatus);

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

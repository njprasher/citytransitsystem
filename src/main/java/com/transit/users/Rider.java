package com.transit.users;

import com.transit.card.Card;
import com.transit.other.DriverType;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        if (isValid(riderEmail))
        {
            this.riderEmail = riderEmail;

            System.out.println("Email entered successfully");
        }

        else System.out.println("Email is Incorrect");

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

    public void inputRiderData()
    {


        ArrayList<Rider> riderArrayList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning)
        {
            System.out.println("Rider, please enter your name(quit to exit program): ");
            riderName = scan.nextLine();
            if(riderName.equalsIgnoreCase("quit"))

            {
                break;
            }


            System.out.println("Please enter your Email: ");
            String tempRiderEmail = scan.nextLine();

            if (isValid(tempRiderEmail))

            { riderEmail = tempRiderEmail;

                System.out.println("Email entered Successfully");

            } else
                {
                    System.out.println("Incorrect Email"); //add java gotoStatement
                    riderEmail = "Incorrect Email";
                }

            System.out.println("Please Enter Your Contact Number");
            riderContact = scan.nextLine();

            Rider a = new Rider(riderName, riderBirth, riderEmail, riderContact, card);
            riderArrayList.add(a);


            for(Rider t: riderArrayList) {
            System.out.println("Name: " + t.getRiderName() + "\nEmail: " + t.getRiderEmail()+ "\nContact Number: " + t.getRiderContact());
            System.out.println();
            }
        }
    }


    @Override
    public String getDriverName() {
        return null;
    }

    @Override
    public int getDriverPhone() {
        return 0;
    }

    @Override
    public String getDriverEmail() {
        return null;
    }
}

package com.transit.users;

import com.transit.card.Card;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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

    public Rider(String riderName, Date riderBirth, String riderEmail, String riderContact, Card card) {
        this.riderName = riderName;
        this.riderBirth = riderBirth;
        this.riderEmail = riderEmail;
        this.riderContact = riderContact;
        this.card = card;
    }

    /**
     *
     * @param riderName name of rider
     * @param riderBirth birth date of rider
     * @param riderEmail email of rider
     * @param riderContact phone number of rider
     * @param card card held by user
     */

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
    }

    public void inputRidersDataAndDisplayIt()
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

            if (isEmailValid(tempRiderEmail))

            { riderEmail = tempRiderEmail;

                System.out.println("Email entered Successfully");

            } else
                {
                    System.out.println("Incorrect Email"); //add java gotoStatement
                    riderEmail = "Incorrect Email";
                }

            System.out.println("Please Enter Your Contact Number");

            String tempRiderContact = scan.nextLine();

            if (isContactNumberValid(tempRiderContact))

            { riderContact = tempRiderContact;

                System.out.println("Contact Number entered Successfully");

            } else
            {
                System.out.println("Incorrect Contact Number"); //add java gotoStatement if possible
                riderContact = "Incorrect Contact Number";
            }

            Rider a = new Rider(riderName, riderBirth, riderEmail, riderContact, card);
            riderArrayList.add(a);


            for(Rider t: riderArrayList) {
            System.out.println("Name: " + t.getRiderName() + "\nEmail: " + t.getRiderEmail()+ "\nContact Number: " + t.getRiderContact());
            System.out.println();
            }
        }
    }


    public void inputRiderData()
    {

        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning)
        {
            System.out.println("Rider, please enter your name(quit to exit program): ");
            String tempRiderName = scan.nextLine();
            if(tempRiderName.equalsIgnoreCase("quit"))
            {
                break;
            }else riderName = tempRiderName;


            System.out.println("Please enter your Email: ");
            String tempRiderEmail = scan.nextLine();

            if (isEmailValid(tempRiderEmail))

            { riderEmail = tempRiderEmail;

                System.out.println("Email entered Successfully");

            } else
            {
                System.out.println("Incorrect Email"); //add java gotoStatement
                riderEmail = null;
            }

            System.out.println("Please Enter Your Contact Number");

            String tempRiderContact = scan.nextLine();

            if (isContactNumberValid(tempRiderContact))

            { riderContact = tempRiderContact;

                System.out.println("Contact Number entered Successfully");

            } else
            {
                System.out.println("Incorrect Contact Number"); //add java gotoStatement if possible
                riderContact = null;
            }

            isRunning = false;
        }
    }

    public void writeRiderDetailsToFile()
    {
        JSONObject riderDetails = new JSONObject();

        riderDetails.put("riderName", this.riderName);
        riderDetails.put("riderBirth", this.riderBirth);
        riderDetails.put("riderEmail", this.riderEmail);
        riderDetails.put("riderContact", this.riderContact);

        JSONObject riderObject = new JSONObject();
        riderObject.put("riders", riderDetails);

        //Add riders to list
        JSONArray riderList = new JSONArray();
        riderList.add(riderObject);

        //Write JSON file
        try (FileWriter file = new FileWriter("riders.json")) {

            file.write(riderList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readRiderDetailsFromFile() {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("riders.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray riderList = (JSONArray) obj;

            //Iterate over array
            riderList.forEach(rider -> parseRiderObject((JSONObject) rider));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    private void parseRiderObject(JSONObject rider)
    {
        //Get rider object within list
        JSONObject riderObject = (JSONObject) rider.get("riders");

        String riderName = (String) riderObject.get("riderName");
        this.setRiderName(riderName);

        Date riderBirth = (Date) riderObject.get("riderBirth");
        this.setRiderBirth(riderBirth);

        String riderEmail = (String) riderObject.get("riderEmail");
        this.setRiderEmail(riderEmail);

        String riderContact = (String) riderObject.get("riderContact");
        this.setRiderContact(riderContact);

    }

    @Override
    public String Display()
    {
        return("----------------------" +
                "\n-----User Details-----" +
                "\n----------------------" +
                "\nName: " + this.getRiderName() +
                "\nDate of Birth: " + this.getRiderBirth() +
                "\nEmail: " + this.getRiderEmail() +
                "\nContact Number: " + this.getRiderContact()
                );

    }
}

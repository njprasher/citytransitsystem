package com.transit.other.Validation_Classes;

import com.transit.users.Rider;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsers {

    private Pattern regexPattern;
    private Matcher regMatcher;


    public Boolean isValidEmailAddress(String riderEmail)  //https://www.geeksforgeeks.org/check-email-address-valid-not-java/
    {
        final Pattern VALID_EMAIL_ADDRESS_REGEX =
                Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+
                        "[a-zA-Z0-9_+&*-]+)*@" +
                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                        "A-Z]{2,7}$", Pattern.CASE_INSENSITIVE);

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(riderEmail);
        return matcher.find();
    }


   /* public String isValidEmailAddress(String email) {
        String getEmail="";
        System.out.println(getEmail);
        getEmail=email;
        System.out.println("here it is :"+getEmail);
        regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
        regMatcher   = regexPattern.matcher(getEmail);
        if(regMatcher.matches()) {
            return "Valid Email Address";
        } else {
            return "Invalid Email Address";
        }
}*/

    public String validateMobileNumber(String mobileNumber) {
        regexPattern = Pattern.compile("^\\+[0-9]{2,3}+-[0-9]{10}$");
        regMatcher   = regexPattern.matcher(mobileNumber);
        if(regMatcher.matches()) {
            return "Valid Mobile Number";
        } else {
            return "Invalid Mobile Number";
        }
    }

    public void inputRiderData(String riderEmail,)
    {


        ArrayList<Rider> ac = new ArrayList<Rider>();

        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning){
            System.out.println("Rider, please enter your name(quit to exit program): ");
            String riderName = scan.next();
            if(riderName.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Please enter your Email: "); //add email validation
            String tempRiderEmail = scan.next();

            if (isValidEmailAddress(tempRiderEmail))
            {
                riderEmail = tempRiderEmail;

                System.out.println("Email entered Successfully");

            } else
            {
                System.out.println("Please Enter Correct Email"); //add java gotoStatement
            }

        }
        System.out.println("Please Enter Your Contact Number");
        String riderContact = scan.next();

        Rider a = new Rider(riderName, riderBirth, riderEmail, riderContact, card);
        ac.add(a);


        for(Rider t: ac) {
            System.out.println("Name: " + t.getRiderName() + "\nEmail: " + t.getRiderEmail()+ "\nContact Number: " + t.getRiderContact());
            System.out.println();
        }

    }





}

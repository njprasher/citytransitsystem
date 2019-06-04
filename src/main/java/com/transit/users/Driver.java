package com.transit.users;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Driver extends User {

    private String driverName;
    private String driverEmail;
    private  String driverPhone;
    private static double driverSalary;
    private String driverBirth;

    public Driver() {
    }

    public Driver(String driverName, String driverBirth, String driverEmail, String driverPhone, String birth) {
    }

    /**
     *
     * @param driverName Displays Name of the driver riding the bus ..
     * @param driverEmail Display Email of the driver
     * @param driverPhone Displays Cell Number of driver
     * @param driverSalary Displays Annual Salary of driver
     * @param driverBirth Displays Birthdate of driver to find the retired date .
     *
     */
    public Driver(String driverName, String driverEmail, String driverPhone, int driverSalary, String driverBirth) {
        this.driverName = driverName;
        this.driverEmail = driverEmail;
        this.driverPhone = driverPhone;
        this.driverSalary = driverSalary;
        this.driverBirth = driverBirth;
    }


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverEmail() {
        //   isEmailValid(this.driverEmail);
        return driverEmail;
    }



    public void setDriverEmail(String driverEmail) {
//        isEmailValid(driverEmail);
        this.driverEmail = driverEmail;
    }

    public String getDriverPhone() {
        //   isContactNumberValid(this.driverPhone);
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        //    isContactNumberValid(driverPhone);
        this.driverPhone = driverPhone;
    }

    public double getDriverSalary() {
        return driverSalary;
    }

    public void setDriverSalary(double driverSalary) {
        Driver.driverSalary = driverSalary;
    }

    public String getDriverBirth() {
        SimpleDateFormat format = new SimpleDateFormat(this.driverBirth);
        try
        {
            Date date = format.parse(this.driverBirth);
            System.out.println(date);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        // formatting
        System.out.println(format.format(new Date()));
        return driverBirth;
    }

    public void setDriverBirth(String driverBirth) {
        SimpleDateFormat format = new SimpleDateFormat(driverBirth);
        try {
            Date date = format.parse(driverBirth);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // formatting
        System.out.println(format.format(new Date()));
        this.driverBirth = driverBirth;
    }


    // Functions of Driver Class


    public void updateProfile(String driverName, String driverEmail, String driverPhone)
    {

        setDriverName(driverName);
        setDriverEmail(driverEmail);
        setDriverPhone(driverPhone);
    }


    @Override
    public String Display() {
        return ("----------------------" +
                "\n-----User Details-----" +
                "\n----------------------" +
                "\nName: " + this.getDriverName() +
                "\nDate of Birth: " + this.getDriverBirth() +
                "\nEmail: " + this.getDriverEmail() +
                "\nContact Number: " + this.getDriverPhone()
        );
    }

    public double yearlySalary() {
        double yearlySalary;
        yearlySalary = (driverSalary * 12);
        return yearlySalary;
    }

    public void displayYearlySalary() {
        System.out.println(driverName+","+yearlySalary());
    }



    public void inputDriverDataAndDisplay()
    {


        ArrayList<Driver> driverArrayList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning)
        {
            System.out.println("Driver, please enter your name(quit to exit program): ");
            String driverName = scan.nextLine();
            if(driverName.equalsIgnoreCase("quit"))

            {
                break;
            }


            System.out.println("Please enter your Email: ");

            String tempDriverEmail = scan.nextLine();

            if (isEmailValid(tempDriverEmail))

            { driverEmail = tempDriverEmail;

                System.out.println("Email entered Successfully");

            } else
            {
                System.out.println("Incorrect Email"); //add java gotoStatement
                driverEmail = "Incorrect Email";
            }

            System.out.println("Please Enter Your Contact Number");

            String tempDriverContact = scan.nextLine();

            if (isContactNumberValid(tempDriverContact))

            { driverPhone = tempDriverContact;

                System.out.println("Contact Number entered Successfully");

            } else
            {
                System.out.println("Incorrect Contact Number"); //add java gotoStatement if possible
                driverPhone = null;
            }

            Driver a = new Driver(driverName, driverBirth, driverEmail, driverPhone,driverBirth);
            driverArrayList.add(a);


            for(Driver t: driverArrayList) {
                System.out.println("Name: " + t.getDriverName() + "\nEmail: " + t.getDriverEmail()+ "\nContact Number: " + t.getDriverPhone());
                System.out.println();
            }
        }
    }

}

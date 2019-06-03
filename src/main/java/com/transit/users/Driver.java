package com.transit.users;

import com.transit.other.Validation_Classes.ValidateUsers;

public class Driver extends User{

    private String driverName;
    private String driverEmail;
    private  String driverPhone;
    private static int driverSalary;
    private String driverBirth;
    private ValidateUsers validateUsers;


    public Driver() {
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
        validateUsers.isValidEmailAddress(this.driverEmail);
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
        validateUsers.isValidEmailAddress(this.driverEmail);

    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public int getDriverSalary() {
        validateUsers.validateMobileNumber(this.driverPhone);
        return driverSalary;
    }

    public void setDriverSalary(int driverSalary) {
        Driver.driverSalary = driverSalary;
    }

    public String getDriverBirth() {
        return driverBirth;
    }

    public void setDriverBirth(String driverBirth) {
        this.driverBirth = driverBirth;
    }


    // Functions of Driver Class


    public void updateProfile(String driverName, String driverEmail, String driverPhone)
    {
        setDriverName(driverName);
        setDriverEmail(driverEmail);
        setDriverPhone(driverPhone);
    }




    /*public DriverType neeraj(){

        return DriverType.Brampton;
    }*/
}

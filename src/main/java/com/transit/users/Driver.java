package com.transit.users;

public class Driver extends User{

    private String driverName;
    private String driverEmail;
    private  int driverPhone;
    private int driverSalary;
    private String driverBirth;


    /**
     *
     * @param driverName Displays Name of the driver riding the bus ..
     * @param driverEmail Display Email of the driver
     * @param driverPhone Displays Cell Number of driver
     * @param driverSalary Displays Annual Salary of driver
     * @param driverBirth Displays Birthdate of driver to find the retired date .
     *
     */
    public Driver(String driverName, String driverEmail, int driverPhone, int driverSalary, String driverBirth) {
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
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public int getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(int driverPhone) {
        this.driverPhone = driverPhone;
    }

    public int getDriverSalary() {
        return driverSalary;
    }

    public void setDriverSalary(int driverSalary) {
        this.driverSalary = driverSalary;
    }

    public String getDriverBirth() {
        return driverBirth;
    }

    public void setDriverBirth(String driverBirth) {
        this.driverBirth = driverBirth;
    }


    // Functions of Driver Class


    public void updateProfile(String driverName, String driverEmail, int driverPhone)
    {
        setDriverName(driverName);
        setDriverEmail(driverEmail);
        setDriverPhone(driverPhone);
    }

  /*  public enum getroute(){
        return
    }*/
}

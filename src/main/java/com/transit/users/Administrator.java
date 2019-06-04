package com.transit.users;

import java.util.Scanner;

public class Administrator extends User
{
    private String adminName;
    private String adminEmail;

    public Administrator(){

    }

    /**
     *
     * @param adminName display the name of administrator
     * @param adminEmail display admin email
     */
    public Administrator( String adminName,String adminEmail) {
        this.adminName = adminName;
        this.adminEmail = adminEmail;
    }

    /*
    public Administrator(int id,String password,String loginStatus){
    this.id=id;
    this.password=password;
    this.loginStatus=loginStatus;
    }
*/
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public void inputAdminData()
    {

        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning)
        {
            System.out.println("Admin, please enter your name(quit to exit program): ");
            String tempAdminName = scan.nextLine();
            if(tempAdminName.equalsIgnoreCase("quit"))
            {
                break;
            }else adminName = tempAdminName;


            System.out.println("Please enter your Email: ");
            String tempAdminEmail = scan.nextLine();

            if (isEmailValid(tempAdminEmail))

            { adminEmail = tempAdminEmail;

                System.out.println("Email entered Successfully");

            } else
            {
                System.out.println("Incorrect Email"); //add java gotoStatement
                adminEmail = null;
            }

            isRunning = false;
        }
    }

    @Override
    public String Display()
    {
        return null;

    }
}


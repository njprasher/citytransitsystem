package com.transit.users;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
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


    public void writeAdminDetailsToFile()
    {
        JSONObject adminDetails = new JSONObject();

        adminDetails.put("adminName", this.adminName);
        adminDetails.put("adminEmail", this.adminEmail);

        JSONObject adminObject = new JSONObject();
        adminObject.put("admins", adminDetails);

        //Add admins to list
        JSONArray adminList = new JSONArray();
        adminList.add(adminObject);

        //Write JSON file
        try (FileWriter file = new FileWriter("admins.json")) {

            file.write(adminList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAdminDetailsFromFile() {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("admins.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray adminList = (JSONArray) obj;

            //Iterate over array
            adminList.forEach(admin -> parseAdminObject((JSONObject) admin));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    private void parseAdminObject(JSONObject admin)
    {
        //Get rider object within list
        JSONObject adminObject = (JSONObject) admin.get("admins");

        String adminName = (String) adminObject.get("adminName");
        this.setAdminName(adminName);

        String adminEmail = (String) adminObject.get("adminEmail");
        this.setAdminEmail(adminEmail);

    }


    @Override
    public String Display()
    {
        return null;

    }
}


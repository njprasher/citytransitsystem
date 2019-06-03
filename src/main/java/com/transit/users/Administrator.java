package com.transit.users;

public class Administrator extends User
{
    private String adminName;
    private String adminEmail;

    public Administrator(){

    }

    /**
     *
     * @param adminName display the name of administrator
     * @param adminEmail display driver's email  
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

    @Override
    public String getDriverName() {
        return null;
    }

    @Override
    public String getDriverPhone() {
        return 0;
    }

    @Override
    public String getDriverEmail() {
        return null;
    }
}


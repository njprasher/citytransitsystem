package com.transit.users;

import java.util.HashMap;

public class UserSingleton
{
    private static UserSingleton userObject;
    private HashMap<Integer , User>integerUserHashMap;

    private UserSingleton()
    {
        integerUserHashMap = new HashMap<>();
    }

    public static UserSingleton getInstance()
    {
        if(userObject == null)
        {
            userObject = new UserSingleton();
        }

        return userObject;
    }

    public void addStudent(User user)
    {
        if( user != null) {

            integerUserHashMap.put(user.getId(), user);
        }
    }

    public User getStudent(int id)
    {
        return integerUserHashMap.get(id);
    }
}

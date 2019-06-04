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

    public void addUser(User user)
    {
        if( user != null) {

            integerUserHashMap.put(user.getId(), user);
        }
    }

    public User getUserbyId(int id)
    {
        return integerUserHashMap.get(id);
    }

    public boolean deleteUserById(int id)
    {
        if (integerUserHashMap.containsKey(id))
        {
            integerUserHashMap.remove(id);
            return true;
        }else return false;
    }

    public boolean verifyUser(int key, String value)
    {
        boolean verify = false;

        if ( integerUserHashMap.containsKey(key) )
        {
            if ( integerUserHashMap.containsValue(value) )
            {
                verify = true;
            }
        }
        return(verify);
    }

}

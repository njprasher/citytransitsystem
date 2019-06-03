package com.transit;

import com.transit.card.Card;
import com.transit.users.Rider;

import java.util.Date;

public class TransitMain {

    private Rider rider;

    public static void main(String[] arg)
    {
        // Creating Instances of classes in Main Class
        Date date = new Date(System.currentTimeMillis());

        Card card = new Card();
        Rider rider = new Rider("riderName", date , "mail@mail.com", "0987654321", card);

        card.Display();

        //rider.inputRiderData();
        System.out.println(rider.Display());

    }
}

package com.transit.users;

import com.transit.card.Card;

import java.util.Date;

public class Rider extends User
{
    private String riderName;
    private Date riderBirth;
    private int riderBalance;
    private boolean riderPass;
    private String riderEmail;
    private int riderContact;
    private int recentTicketId;
    private int categoryId;
    private Card card;
    
}

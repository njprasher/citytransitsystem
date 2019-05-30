package com.transit.other;

public enum  enumDriver {




    Brampton("Brampton Gateway Terminal","Ray Lawson Blvd",53),
    Missisuaga("City Center Terminal","Sherdidan College",66),
    Toronto("Lambton college","Fallen oak",123);

    private final String starttingLocation;
    private final String destination;
    private final int busNumber;

    enumDriver(String starttingLocation, String destination, int busNumber) {
        this.starttingLocation = starttingLocation;
        this.destination = destination;
        this.busNumber = busNumber;
    }
}
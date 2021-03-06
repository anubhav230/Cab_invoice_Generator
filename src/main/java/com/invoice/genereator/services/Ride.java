package com.invoice.genereator.services;

import com.invoice.genereator.utility.RideType;

public class Ride {
    public final double distance;
    public final int time;
    public final RideType rideType;

    public Ride(RideType rideType, double distance, int time) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
}

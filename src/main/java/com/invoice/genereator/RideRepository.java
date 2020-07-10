package com.invoice.genereator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {
    Map<String, ArrayList<Ride>> userRides = null;
    public RideRepository() {
        this.userRides = new HashMap<>();
    }
    public void addRide(String userId, Ride[] rides) {
        ArrayList<Ride> ridesList = this.userRides.get(userId);
        if (ridesList == null) {
            this.userRides.put(userId, new ArrayList<>((Arrays.asList(rides))));
        }
    }
    public Ride[] getRides(String userId) {
        return this.userRides.get(userId).toArray(new Ride[0]);
    }
}
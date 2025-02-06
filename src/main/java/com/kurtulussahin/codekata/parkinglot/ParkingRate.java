package com.kurtulussahin.codekata.parkinglot;

import java.util.Date;

class ParkingRate {
    double ratePerHour;

    public ParkingRate(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double calculateFee(Date startTime, Date endTime) {
        long diffMillis = endTime.getTime() - startTime.getTime();
        double hours = diffMillis / (1000.0 * 60 * 60);
        return ratePerHour * Math.ceil(hours);
    }
}
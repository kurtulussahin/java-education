package com.kurtulussahin.codekata.parkinglot;

class Admin extends Account {
    public boolean addParkingFloor(ParkingLot lot, ParkingFloor floor) {
        if (lot != null && floor != null) {
            lot.floors.add(floor);
            return true;
        }
        return false;
    }
}

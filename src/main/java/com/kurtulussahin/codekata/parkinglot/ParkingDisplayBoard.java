package com.kurtulussahin.codekata.parkinglot;

class ParkingDisplayBoard {
    String id;
    HandicappedSpot handicappedFreeSpot;
    CompactSpot compactFreeSpot;
    LargeSpot largeFreeSpot;
    MotorbikeSpot motorbikeFreeSpot;
    ElectricSpot electricFreeSpot;

    public void showEmptySpotNumber() {
        // Show empty spot information
        System.out.println("Handicapped: " + (handicappedFreeSpot != null && handicappedFreeSpot.isFree()));
    }
}

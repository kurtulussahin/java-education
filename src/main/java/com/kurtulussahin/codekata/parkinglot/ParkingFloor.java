package com.kurtulussahin.codekata.parkinglot;

import java.util.ArrayList;
import java.util.List;

class ParkingFloor {
    String name;
    List<ParkingSpot> spots = new ArrayList<>();
    CustomerInfoPortal infoPortal;
    ParkingDisplayBoard displayBoard;

    public void updateDisplayBoard() {
        // Update display board
    }

    public void addParkingSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    public void assignVehicleToSlot(Vehicle vehicle) {
        // Assign vehicle to a free spot
        for (ParkingSpot spot : spots) {
            if (spot.isFree()) {
                spot.free = false;
                return;
            }
        }
    }

    public void freeSlot(int spotNumber) {
        for (ParkingSpot spot : spots) {
            if (spot.number == spotNumber) {
                spot.free = true;
                return;
            }
        }
    }
}

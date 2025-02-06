package com.kurtulussahin.codekata.parkinglot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

// Parking Lot Management
class ParkingLot {
    String id;
    String address;
    ParkingRate rate;
    ParkingTicket ticket;
    ParkingAttendantPortal portal;
    List<ParkingFloor> floors = new ArrayList<>();
    List<EntrancePanel> entrancePanels = new ArrayList<>();
    List<ExitPanel> exitPanels = new ArrayList<>();

    public boolean addParkingFloor(ParkingFloor floor) {
        return floors.add(floor);
    }

    public boolean addEntrancePanel(EntrancePanel panel) {
        return entrancePanels.add(panel);
    }

    public boolean isFull() {
        for (ParkingFloor floor : floors) {
            for (ParkingSpot spot : floor.spots) {
                if (spot.isFree()) {
                    return false;
                }
            }
        }
        return true;
    }

    public ParkingTicket getNewParkingTicket() {
        ParkingTicket ticket = new ParkingTicket();
        ticket.ticketNumber = UUID.randomUUID().toString();
        ticket.issuedAt = new Date();
        ticket.status = ParkingTicketStatus.ACTIVE;
        return ticket;
    }

}

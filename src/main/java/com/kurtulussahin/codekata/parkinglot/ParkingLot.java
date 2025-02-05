package com.kurtulussahin.codekata.parkinglot;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

// Parking Lot Management
class ParkingLot {
    String id;
    String address;
    List<ParkingFloor> floors = new ArrayList<>();
    List<EntrancePanel> entrancePanels = new ArrayList<>();
    List<ExitPanel> exitPanels = new ArrayList<>();

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

    class EntrancePanel {
        String id;

        public boolean printTicket(ParkingTicket ticket) {
            if (ticket != null) {
                System.out.println("Ticket printed: " + ticket.ticketNumber);
                return true;
            }
            return false;
        }
    }

    class ExitPanel {
        String id;

        public boolean scanTicket(ParkingTicket ticket) {
            if (ticket != null) {
                System.out.println("Ticket scanned: " + ticket.ticketNumber);
                return true;
            }
            return false;
        }

        public boolean processPayment(ParkingTicket ticket, Payment payment) {
            if (ticket != null && payment != null) {
                payment.initiateTransaction();
                System.out.println("Payment processed for ticket: " + ticket.ticketNumber);
                return true;
            }
            return false;
        }
    }
}

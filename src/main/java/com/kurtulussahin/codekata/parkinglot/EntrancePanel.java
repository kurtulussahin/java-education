package com.kurtulussahin.codekata.parkinglot;

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

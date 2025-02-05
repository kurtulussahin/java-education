package com.kurtulussahin.codekata.parkinglot;

import java.util.Date;

class ParkingAttendant extends Account {
    public boolean processTicket(ParkingTicket ticket) {
        if (ticket != null) {
            ticket.status = ParkingTicketStatus.PAID;
            ticket.payedAt = new Date();
            return true;
        }
        return false;
    }
}

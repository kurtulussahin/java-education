package com.kurtulussahin.codekata.parkinglot;

class ParkingAttendantPortal {
    String id;
    public boolean scanTicket(ParkingTicket ticket) {
        return ticket != null;
    }
    public boolean processPayment(ParkingTicket ticket, Payment payment) {
        if(ticket != null && payment != null) {
            payment.initiateTransaction();
            return true;
        }
        return false;
    }
}

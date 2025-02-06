package com.kurtulussahin.codekata.parkinglot;

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

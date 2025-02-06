package com.kurtulussahin.codekata.parkinglot;

// Test Scenarios
public class ParkingSystemTest {
    public static void main(String[] args) {
        // Create parking lot
        ParkingLot lot = new ParkingLot();
        lot.id = "Lot1";
        lot.address = "123 Main St";

        // Add floor
        ParkingFloor floor1 = new ParkingFloor();
        floor1.name = "Floor 1";

        // Add simple parking spot
        CompactSpot spot1 = new CompactSpot();
        spot1.number = 1;
        spot1.free = true;
        spot1.type = ParkingSpotType.COMPACT;
        floor1.spots.add(spot1);
        lot.floors.add(floor1);

        // Vehicle and ticket operations
        Car car = new Car();
        car.licenseNumber = "34ABC123";
        car.type = VehicleType.CAR;

        Admin admin = new Admin();
        admin.userName = "admin1";

        ParkingTicket ticket = lot.getNewParkingTicket();
        car.assignTicket(ticket);
        System.out.println("New ticket number: " + ticket.ticketNumber);

        // Assign parking spot
        floor1.assignVehicleToSlot(car);
        System.out.println("Parking spot assigned to vehicle. Is free: " + spot1.isFree());

        // Payment processing
        ParkingAttendant attendant = new ParkingAttendant();
        Payment payment = new CashTransaction();
        payment.amount = 15.0;
        ExitPanel exitPanel = new ExitPanel();
        exitPanel.id = "Exit1";
        exitPanel.scanTicket(ticket);
        exitPanel.processPayment(ticket, payment);
        attendant.processTicket(ticket);
        System.out.println("Ticket status: " + ticket.status);

        // Display board
        ParkingDisplayBoard board = new ParkingDisplayBoard();
        board.id = "Board1";
        board.showEmptySpotNumber();
    }
}
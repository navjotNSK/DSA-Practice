package org.practice.solid;
public class ReservationService {

    public String search(String source, String destination) {
        // do searchBuses
        return "Buses Found";
    }

    public String bookTicket(int numberOfSeats) {
        // booking the ticket
        return "Ticket Booked";
    }

    public void printTickect() {
        // printing the Ticket
    }

    public void getTravelInsuranceInfo(int ticketId) {
        // getting the Travel Insurance info
    }

    public void sendOTP(String medium) {
        if(medium.equals("email")) {
            // write email related logic
        }
    }
}

abstract class NotificationService {

    public abstract void sendOTP(String medium) ;
}

class EmailService extends NotificationService{

    @Override
    public void sendOTP(String medium) {
        if(medium.equals("email")) {
            // write email related logic
        }
    }
}

 class SolidDesignProblem1 {
}

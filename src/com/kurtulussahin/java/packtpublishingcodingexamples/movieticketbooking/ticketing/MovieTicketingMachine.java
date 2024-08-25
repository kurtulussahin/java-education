package com.kurtulussahin.java.packtpublishingcodingexamples.movieticketbooking.ticketing;
 
import com.kurtulussahin.java.packtpublishingcodingexamples.movieticketbooking.cinema.Cinema;
import com.kurtulussahin.java.packtpublishingcodingexamples.movieticketbooking.cinema.CinemaRoom;
import com.kurtulussahin.java.packtpublishingcodingexamples.movieticketbooking.cinema.CinemaRoom.Cartridge;
import com.kurtulussahin.java.packtpublishingcodingexamples.movieticketbooking.cinema.Movie;
import com.kurtulussahin.java.packtpublishingcodingexamples.movieticketbooking.cinema.MovieTicket;
import com.kurtulussahin.java.packtpublishingcodingexamples.movieticketbooking.cinema.Seat;
import java.time.LocalTime;
import java.util.List;

public class MovieTicketingMachine implements MovieTicketing {
    
    private final Cinema cinema;
    
    private Cartridge cartridge;
    private Movie movie;
    private LocalTime startTime;
    private CinemaRoom room;
    private List<Seat> seats;

    public MovieTicketingMachine(Cinema cinema) {
        this.cinema = cinema;    
        
        //display list of movies via cinema.getCartridges(); cartridge.getMovie();
    }        

    // step 1
    @Override
    public boolean selectMovieBtn(Movie movie) { 
               
        // this.cartridge = cartridge
        // this.movie = movie; 
        
        return true; 
    }    

    // Step 2
    @Override
    public boolean selectStartTimeBtn() { 
                
        // this.cartridge.fetchUniqueStartTimes();
        // select start time from a list of radio buttons
        // this.startTime = selected start time
        
        return true; 
    }

    // Step 3
    @Override
    public boolean selectCinemaRoom() {
                
        // this.cartridge.fetchRooms();
        // select room from a list of radio buttons
        // this.room = selected cinema room
        
        return true;
    }

    // Step 4    
    @Override
    public boolean selectSeats() {
        
        // this.cinema.getFreeSeatsOfRoom(room, movie);
        // select seats
        // this.seats = selected seats
       
        return true;
    }
    
    // Step 5
    @Override
    public MovieTicket buyTicketBtn() { 
        
        // so far, we have the movie, the start time, the room, the seats 
        // is time to buy the ticket        
        // this.cinema.buyTicket(room, movie, startTime, seats);
        
        return null; 
    }        
}

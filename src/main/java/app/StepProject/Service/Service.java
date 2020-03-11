package app.StepProject.Service;

import app.StepProject.Entity.Booking;
import app.StepProject.Entity.Flight;
import com.sun.imageio.stream.StreamFinalizer;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    Flight fg = new Flight();
    Booking bg = new Booking();


    public void getAllFlights() throws IOException {
        List<Flight> allFlights = fg.allFlight("all_flights.txt");
        allFlights.stream().map(s->String.valueOf(s)).collect(Collectors.toList()).forEach(System.out::println);
    }

    public void flightById(int id) {

    }

    public void searchFlight(String des, LocalDate date1, int users) {
        if (fg.getDestination().equals(des) && fg.getDate().compareTo(date1) && fg.getSeats()>users){

        }
    }

    public void bookFlight(String name, String lastname) throws IOException {
        bg.write(name, lastname);
    }

    public void cancelBooking(int bookId) {
    }
}

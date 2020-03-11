package app.StepProject.Entity;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Flight {

    private final Map<Integer, Flight> storage = new HashMap<>();

    private int id;
    private String destination;
    private int seats;
    private LocalDateTime date;

    public Flight() {
    }

    public Flight(int id, String destination, int seats, LocalDateTime date) {
        this.id = id;
        this.destination = destination;
        this.seats = seats;
        this.date = date;
    }

    public static Flight parse(String line) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String[] chunks = line.split("->");
        return new Flight(
                Integer.parseInt(chunks[0]),
                chunks[1],
                Integer.parseInt(chunks[2]),
                LocalDateTime.parse(chunks[3],formatter)
        );
    }

    public List<Flight> allFlight(String file) throws IOException {
        List<Character> list = new ArrayList<>();

        BufferedReader br =  new BufferedReader(new FileReader(new File(file)));
        Random random = new Random();
        random.ints(20,0,100);
        storage.values().stream();
        for(int i =0; i<20; i++) {
            list.add(br.readLine().charAt((int)(Math.random()*21)));
        }
        //return list;
    }
    /*public static List<Flight> allFlights(String s) throws FileNotFoundException {
        BufferedReader br =  new BufferedReader(new FileReader(new File(s)));
        return br.lines().map(Flight::parse).collect(Collectors.toList());
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String represent() {
        return String.format("%d:%s:%d:%d", id, destination, seats,date);
    }
    @Override
    public String toString() {
        return String.format("Student[id=%d, name='%s', age=%d, date=%d]", id, destination, seats, date);
    }



}

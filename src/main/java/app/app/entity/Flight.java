package app.app.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Flight {
  public int id;
  public String destination;
  public String date;
  public String seats;



  public Flight(int id, String destination, String date, String seats) {
    this.id = id;
    this.destination= destination;
    this.date=date;
    this.seats=seats;
  }

  public static Flight parse(String line) {
    String[] chunks = line.split(",");
    return new Flight(
            Integer.parseInt(chunks[0]),
            chunks[1].trim(),
            chunks[2].trim(),
            chunks[3].trim()
    );
  }
  public String represent() {
    return String.format("%d,%s,%s,%s", id, destination,date,seats);
  }


  @Override
  public String toString() {
    return String.format("Flight[id=%d, destination='%s, date='%s, seats='%s']", id, destination,date,seats);
  }
}

package app.app.entity;

import java.util.List;

public class Booking {
  int user_id;
  List<Person> people;
  int flight_id;


  public Booking(int user_id, int flight_id) {
    this.user_id = user_id;
    //this.people=people;
    this.flight_id = flight_id;

  }


  public static Booking parse(String line) {
    String[] chunks = line.split(":");
    return new Booking(
            Integer.parseInt(chunks[0]),
            Integer.parseInt(chunks[1])
    );
  }
}

package app.app.entity;

import java.util.List;

public class Booking extends Person{
  public int user_id;
  List<Person> people;
  int flight_id;
  public Person person;

  public Booking(int user_id,String first, String last) {
    super(first, last);
    this.user_id=user_id;
  }




  /* public Booking() {
  }


  public Booking( String name, String surname) {
    this.person.first = name;
    this.person.last=surname;}

  public Booking(int user_id, String name, String surname) {
    this.user_id = user_id;
    //this.people=people;
    this.person.first = name;
    this.person.last=surname;

  }
*/

  public static Booking parse(String line) {
    String[] chunks = line.split(":");
    return new Booking(
            Integer.parseInt(chunks[0]),
            chunks[1],
            chunks[2]
    );
  }

}

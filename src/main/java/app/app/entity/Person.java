package app.app.entity;

public class Person{
  User user;
  String first;
  String last;



  public Person(String first, String last) {

    this.first = first;
    this.last = last;
  }

  public String represent() {
    return String.format("%d,%s,%s", user.id, first,last);
  }




}

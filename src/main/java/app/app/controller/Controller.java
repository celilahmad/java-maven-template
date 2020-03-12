package app.app.controller;


import app.app.io.Console;
import app.app.io.ConsoleMain;
import app.app.service.Service;

import java.io.FileNotFoundException;

public class Controller {
  Service service;
  Console console;

  public Controller(ConsoleMain console, Service service) {
    this.service = service;
    this.console = console;
  }

  public void show() throws FileNotFoundException {
    service.getallFlights();
  }

  public void search() {
    System.out.println("Enter flight id");
    int id = Integer.parseInt(console.readLn());
    service.get(id);

  }

  public void book() {
    System.out.println("Enter destination");
    String des = console.readLn();
    System.out.println("Enter date");
    String date = console.readLn();
    System.out.println("How many ticket");
    int tickets = Integer.parseInt(console.readLn());
    if (service.booking(des,date,tickets).length()<3) {
        System.out.println("There is no flights for your search criteria:");
    }else { System.out.println(service.booking(des,date,tickets));}
        System.out.println("Would you like to book");

    String yes = console.readLn();
    if (yes.toLowerCase().trim().equals("yes")){
      System.out.println("Enter id");
      int id = Integer.parseInt(console.readLn());
      System.out.println("Enter name");
      String name = console.readLn();
      System.out.println("Enter surname");
      String surname=console.readLn();
      service.create(id,name, surname);
      System.out.println("Processed");
    }else {
      System.out.println("Returning to main menu");

    }

    //console.printLn("");
  }
}

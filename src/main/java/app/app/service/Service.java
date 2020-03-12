package app.app.service;


import app.app.dao.DAO;
import app.app.dao.DAOBooking;
import app.app.dao.DaoFlight;
import app.app.entity.Booking;
import app.app.entity.Flight;
import app.app.io.ConsoleMain;

import java.io.FileNotFoundException;



public class Service {
  DAO<Flight> dao = new DaoFlight("src/main/java/app/app/allFlights.txt");
  DAOBooking daoBooking;

  public Service(DAOBooking daoBooking) {
    this.daoBooking = daoBooking;
  }

  public void getallFlights() throws FileNotFoundException {
    dao.getAll().stream().forEach(System.out::println);
  }

  public void get(int id){
    String s = dao.get(id).map(Flight::represent).orElse("No Flight found");
    System.out.println(s);
  }

  public String booking(String destination, String date, int seats) {
    //System.out.println(dao.getAllBy(p->((p.destination.equals(destination)&&p.date.equals(date))&&Integer.parseInt(p.seats)>seats)));
    return dao.getAllBy(p->((p.destination.equals(destination)&&p.date.equals(date))&&Integer.parseInt(p.seats)>seats)).toString();

  }

  public void create(int id,String name, String surname) {
    daoBooking.create(new Booking(id,name, surname));
  }
}

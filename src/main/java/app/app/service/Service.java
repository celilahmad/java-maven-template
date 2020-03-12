package app.app.service;


import app.app.dao.DAO;
import app.app.dao.DAOBooking;
import app.app.dao.DaoFlight;
import app.app.entity.Booking;
import app.app.entity.Flight;
import app.app.io.ConsoleMain;

import java.io.FileNotFoundException;
import java.util.function.Predicate;


public class Service {
  ConsoleMain con;
  DAO<Flight> dao = new DaoFlight("src/main/java/app/app/allFlights.txt");
  DAO<Booking> bookingDAO = new DAOBooking();
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

  public void booking(String destination, String date, int seats) {
    System.out.println(dao.getAllBy(p->((p.destination.equals(destination)&&p.date.equals(date))&&Integer.parseInt(p.seats)>seats)));

  }

  public void write(String name, String surname) {
    bookingDAO.create(new Booking(name, surname));
  }
}

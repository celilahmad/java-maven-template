package app.app.dao;


import app.app.entity.Booking;
import app.app.entity.Flight;
import app.app.entity.Person;
import app.app.io.ConsoleMain;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DAOBooking implements DAO<Booking> {
  ConsoleMain con;
  File file;

  @Override
  public Optional<Booking> get(int id) {
    return Optional.empty();
  }

  @Override
  public Collection<Booking> getAll() {
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      return br.lines().map(Booking::parse).collect(Collectors.toList());
    } catch (IOException ex) {
      return new ArrayList<>();
    }
  }

  @Override
  public Collection<Booking> getAllBy(Predicate<Booking> p) {
    return null;
  }

  /*@Override
  public Collection<Booking> getAllBy(String des, String date, int seats) {
    return null;
  }*/

  @Override
  public void create(Booking data){
    try{
      int count = 1;
      new BufferedWriter(new FileWriter(new File("book.txt")));
      for (int i=0; i<1; i++){
        //new Booking(count, (new Person(con.readLn(), con.readLn())), get(Integer.parseInt(con.readLn())));
      }
    }catch (IOException ex){
      ex.printStackTrace();
    }
  }

  @Override
  public void delete(int id) {

  }
}

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

  File file = new File("src/main/java/app/app/book.txt");


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
    Collection<Booking> bookings = getAll();
    bookings.add(data);
    write(bookings);

  }

  private void write(Collection<Booking> bookings) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
      for (Booking s: bookings) {
        bw.write(s.represent());
        bw.write("\n");
      }
    } catch (IOException ex) {
      throw new RuntimeException("DAO:write:IOException", ex);
    }
  }

  @Override
  public void delete(int id) {

  }
}

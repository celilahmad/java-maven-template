package app.app.dao;


import app.app.entity.Flight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DaoFlight implements DAO<Flight>{
    Flight flight;
    private File file;

    public DaoFlight(String filename) {
        this.file = new File(filename);
    }

    @Override
    public Optional<Flight> get(int id) {
        return getAll().stream().filter(s -> s.id == id).findFirst();
    }

    @Override
    public Collection<Flight> getAll() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return br.lines().map(Flight::parse).collect(Collectors.toList());
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }

   /* void getAllBy(String des, String date, int tickets) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            br.lines().map(Flight::parse).collect(Collectors.toList());
            flight.setInfo(new String[]{des, date, tickets});
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }*/

    @Override
    public Collection<Flight> getAllBy(Predicate<Flight> p) {
        return getAll().stream().filter(p).collect(Collectors.toList());
    }

 /*   @Override
    public Collection<Flight> getAllBy(String des, String date, int seats) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            if ((flight.destination.equals(des) && flight.date.equals(date)) && flight.seats>seats ){
                return br.lines().map(Flight::parse).collect(Collectors.toList());
            }
            return new ArrayList<>();
        } catch (IOException ex) {
            return new ArrayList<>();
        }
    }*/

    @Override
    public void create(Flight data) {

    }

    @Override
    public void delete(int id) {

    }

}

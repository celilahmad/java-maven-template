package app.StepProject.Entity;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Booking extends User{

    private int id;

    public Booking(int id, String name, String surname) {
        super(id, name, surname);
    }

    public void createBooking(String s) throws IOException {
        if(s.toLowerCase().trim() == "yes"){
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("booking.txt")));
            bw.write(String.valueOf(new User(this.id, name, surname)));
        }
    }

    public void cancelBooking()
}

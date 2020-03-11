package app.StepProject.Entity;

import org.graalvm.compiler.lir.LIRInstruction;

import java.io.*;

public class Booking extends User{

    private int id;


    public Booking(String name, String surname) {
        super(name, surname);
    }

    int count =1;
    public void write(String name, String lastname) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("booking.txt")));
        bw.write(count + ":");
        bw.write(String.valueOf(new User(name, lastname)));
        bw.write("\n");
        bw.close();
        count++;
    }

    public void getBookingId

    public void cancelBooking(int id) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(new File("booking.txt")));

    }
}

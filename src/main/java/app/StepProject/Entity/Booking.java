package app.StepProject.Entity;

import org.graalvm.compiler.lir.LIRInstruction;

import java.io.*;
import java.util.Collection;
import java.util.stream.Collectors;

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

    public Collection<Booking> getAllBooking() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(new File("booking.txt")));
        br.lines().collect(Collectors.toList());
    }


    public void cancelBooking(int id) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("booking.txt")));
        String[] arr= br.readLine().split(":");
        if (Integer.parseInt(arr[0])==id){

        }
        Collection<Booking> students = getAllBooking(s -> s.id != id);
    }
}

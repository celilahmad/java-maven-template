package app.StepProject.Controller;

import app.StepProject.Service.Service;

import java.time.LocalDate;
import java.util.Scanner;

public class Controller {

    Service service = new Service();
    Scanner sc = new Scanner(System.in);
    void menu() {
        boolean b = true;
        int [] arr = new int[5];
        System.out.println("1. Online-Board");
        System.out.println("2. Show the Flight information");
        System.out.println("3. Search and book a flight");
        System.out.println("4. Cancel the booking");
        System.out.println("5. My Flights");
        System.out.println("6. Exit");

        while (b){
            switch (sc.nextInt()){
                case 1:
                  service.getAllFlights();
                  break;
                case 2:
                    System.out.println("Enter flight id");
                    service.flightById(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter flight informations below");
                    System.out.println("Destination?");
                    String des = sc.nextLine();
                    System.out.println("Date?");
                    String date = sc.next();
                    LocalDate date1 = LocalDate.parse(date);
                    System.out.println("How many passengers?");
                    int users = sc.nextInt();
                    service.searchFlight(des, date, users);
                    System.out.println("Would you like booking");
                    String boo = sc.nextLine();
                    if (boo.toLowerCase().trim().equals("yes")){
                        System.out.println("Enter first name");
                        int name = sc.nextInt();
                        System.out.println("Enter last name");
                        int lastname = sc.nextInt();
                        service.bookFlight(name, lastname);
                    }else{

                    }
                case 4:
                    System.out.println("To cancel booking you need to enter booking id");
                    int bookId = sc.nextInt();
                    service.cancelBooking(bookId);

                case 5:
                    System.out.println("Enter your full name");
                    String fullname = sc.nextLine();
                    String [] array = fullname.split(" ");
                    //array[0]
                case 6:
                    System.out.println("You are exiting system");
                    b=false;

            }
        }

    }

}

package app.app;


import app.app.controller.Controller;
import app.app.dao.DAOBooking;
import app.app.io.ConsoleMain;
import app.app.service.Service;

import java.io.FileNotFoundException;

public class MainApp {
  public static void main(String[] args) throws FileNotFoundException {

    ConsoleMain console = new ConsoleMain();
    DAOBooking daoBooking = new DAOBooking();
//    DAOBooking daoBooking = new DAOBooking();
//    DAOBooking daoBooking = new DAOBooking();
//    DAOBooking daoBooking = new DAOBooking();
    Service service = new Service(daoBooking);
//    Service service = new Service(daoBooking);
//    Service service = new Service(daoBooking);
//    Service service = new Service(daoBooking);
//    Service service = new Service(daoBooking);
    Controller controller = new Controller(console, service);
//    Controller controller = new Controller(service);
//    Controller controller = new Controller(service);
//    Controller controller = new Controller(service);

    while (true) {
      String input = console.readLn();
      switch (input) {
        case "1": controller.show(); break;
        case "2": controller.search(); break;
        case "3": controller.book(); break;
        case "4": ; break;
        case "5": ; break;
        default:  break;
      }
    }
  }
}

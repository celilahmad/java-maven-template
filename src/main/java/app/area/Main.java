package app.area;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Circle c = new Circle(5);

        c.area();

        Rectangular rd = new Rectangular(3,4);

        rd.area();

        Triangle tr = new Triangle(2, 5, 6);


        tr.area();

        ArrayList<Figure> figure = new ArrayList<>();
        figure.add(c);
        figure.add(rd);
        figure.add(tr);

        for (Figure f : figure) {
            System.out.println(f);
        }

    }
}

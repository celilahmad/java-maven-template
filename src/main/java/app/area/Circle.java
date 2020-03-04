package app.area;

public class Circle extends Figure{

    Point point = new Point(5,6);

    int radius = x,y;
    //int centre = ;

    public Circle(int radius) {
        this.radius = radius;

    }

    public Circle(int radius, int centre) {
        this.radius = radius;
        //this.centre = centre;
    }

    @Override
    double area() {
        return 3.14*(radius*radius);
    }
}

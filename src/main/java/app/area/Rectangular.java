package app.area;

public class Rectangular extends Figure{

    private int width;
    private int height;

    public Rectangular(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    double area() {
        return width*height;
    }
}

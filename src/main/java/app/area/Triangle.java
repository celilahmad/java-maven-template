package app.area;

public class Triangle extends Figure {

    int right;
    int left;
    int bottom;

    public Triangle(int right, int left, int bottom) {
        this.right = right;
        this.left = left;
        this.bottom = bottom;
    }

    @Override
    double area() {
        int perimeter = (right+left+bottom)/2;
        return Math.sqrt(perimeter*(perimeter-right)*(perimeter-left)*(perimeter-bottom));
    }
}

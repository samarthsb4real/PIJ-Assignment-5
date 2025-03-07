//square class extends shape class
public class Square extends Shape {
    private double side;

    // constructor
    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

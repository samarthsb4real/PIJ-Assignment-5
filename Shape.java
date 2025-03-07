// abstract class
public abstract class Shape {
    protected String shapeName;

    // constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // abstract method for calculating area and perimeter
    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
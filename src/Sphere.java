// sphere class extends shape class implements volume interface
public class Sphere extends Shape implements Volume {
    private double radius;

    // constructor
    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // as perimeter is not applicable for sphere
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

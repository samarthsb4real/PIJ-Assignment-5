// cylinder class extends shape class implements volume interface
public class Cylinder extends Shape implements Volume {
    private double radius, height;

    // constructor
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}

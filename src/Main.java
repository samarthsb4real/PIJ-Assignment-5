// Name: Disha Deepak Gupta
// PRN: 24070126513
// Batch: A2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating the menu
        while (true) {
            System.out.println("\nChoose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            Shape shape = null;
            Volume volumeShape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter the side of the square: ");
                    double side = sc.nextDouble();
                    shape = new Square(side);
                    break;
                case 4:
                    System.out.print("Enter the radius of the sphere: ");
                    double sphereRadius = sc.nextDouble();
                    volumeShape = new Sphere(sphereRadius);
                    break;
                case 5:
                    System.out.print("Enter the radius of the cylinder: ");
                    double cylinderRadius = sc.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    double height = sc.nextDouble();
                    volumeShape = new Cylinder(cylinderRadius, height);
                    break;
                case 6:
                    System.out.print("Enter the base side of the equilateral pyramid: ");
                    double baseSide = sc.nextDouble();
                    System.out.print("Enter the height of the equilateral pyramid: ");
                    double pyramidHeight = sc.nextDouble();
                    volumeShape = new EquilateralPyramid(baseSide, pyramidHeight);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            if (shape != null) {
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
            }

            if (volumeShape != null) {
                if (volumeShape instanceof Shape) {
                    System.out.println("Surface Area: " + ((Shape) volumeShape).calculateArea());
                }
                System.out.println("Volume: " + volumeShape.calculateVolume());
            }
            sc.close();
        }
        
    }
}

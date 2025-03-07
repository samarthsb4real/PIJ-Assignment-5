# Shape Calculation Program

## Overview
This Java program is a **menu-driven application** that allows users to calculate the **area, perimeter, and volume** of various geometric shapes. It follows an **Object-Oriented Programming (OOP)** approach by using an **abstract class (`Shape`)**, an **interface (`Volume`)**, and individual classes for different shapes.

## Features
- Supports **2D shapes**: Circle, Rectangle, and Square.
- Supports **3D shapes**: Sphere, Cylinder, and Equilateral Pyramid (Square Base).
- Uses an **abstract class (`Shape`)** for common properties and methods.
- Implements a **`Volume` interface** for 3D shapes.
- Uses a **menu-driven approach** for user input.
- Follows proper **coding guidelines and comments** for clarity.

## Classes for Shapes
| Shape                 | Parent Class / Interface | Methods Implemented |
|----------------------|------------------------|--------------------|
| `Circle`            | `Shape`                | `calculateArea()`, `calculatePerimeter()` |
| `Rectangle`         | `Shape`                | `calculateArea()`, `calculatePerimeter()` |
| `Square`            | `Shape`                | `calculateArea()`, `calculatePerimeter()` |
| `Sphere`            | `Shape`, `Volume`      | `calculateArea()`, `calculateVolume()` |
| `Cylinder`          | `Shape`, `Volume`      | `calculateArea()`, `calculateVolume()` |
| `EquilateralPyramid` | `Shape`, `Volume`      | `calculateArea()`, `calculateVolume()` |

## Class Descriptions

### Shape
An abstract class that serves as a base for all shapes. It contains common properties and abstract methods for calculating area and perimeter.

### Volume
An interface for 3D shapes that require volume calculation. It contains a method for calculating volume.

### Circle
A class that extends `Shape` and represents a circle. It implements methods to calculate the area and perimeter of a circle.

### Rectangle
A class that extends `Shape` and represents a rectangle. It implements methods to calculate the area and perimeter of a rectangle.

### Square
A class that extends `Shape` and represents a square. It implements methods to calculate the area and perimeter of a square.

### Sphere
A class that extends `Shape` and implements `Volume`. It represents a sphere and implements methods to calculate the area and volume of a sphere.

### Cylinder
A class that extends `Shape` and implements `Volume`. It represents a cylinder and implements methods to calculate the area and volume of a cylinder.

### EquilateralPyramid
A class that extends `Shape` and implements `Volume`. It represents an equilateral pyramid with a square base and implements methods to calculate the area and volume of the pyramid.

## Usage
1. Clone this repository:
   ```sh
   git clone https://github.com/samarthsb4real/PIJ-Assignment-5.git 
   ```

2. Compile the Java files:
   ```sh
   javac *.java
   ```

3. Run the program:
   ```sh
   java Main
   ```

4. Follow the on-screen instructions to choose a shape and input the required dimensions. The program will then display the calculated area, perimeter, and volume (if applicable) of the chosen shape.

## Example
Here is an example of how the program works:

```
Choose a shape:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Exit
Enter your choice: 1
Enter the radius of the circle: 5
Area: 78.53981633974483
Perimeter: 31.41592653589793
```

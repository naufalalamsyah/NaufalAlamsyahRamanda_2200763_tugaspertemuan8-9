
package latihanpert9;
public class Segitiga extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // Default constructor
    public Segitiga() {
        this(1.0, 1.0, 1.0);
    }

    // Constructor with specified sides
    public Segitiga(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter for side1
    public double getSide1() {
        return side1;
    }

    // Getter for side2
    public double getSide2() {
        return side2;
    }

    // Getter for side3
    public double getSide3() {
        return side3;
    }

    // Method to calculate area
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Method to return string description of the triangle
    @Override
    public String toString() {
        return "Segitiga: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
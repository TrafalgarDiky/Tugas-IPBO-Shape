// Abstract class shape
public abstract class Shape {
    public String getColor() {
        return "Blue";
    }

    public abstract double calculateArea();
}

// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square class
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Triangle class
class Triangle extends Shape {
    private double base;
    private double heigt;

    public Triangle(double base, double heigt) {
        this.base = base;
        this.heigt = heigt;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * heigt;
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(8);
        Shape square = new Square(8);
        Shape triangle = new Triangle(8, 16);

        System.out.println("Circle area : " + circle.calculateArea());
        System.out.println("Square area : " + square.calculateArea());
        System.out.println("Triangle area : " + triangle.calculateArea());
    }
}
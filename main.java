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

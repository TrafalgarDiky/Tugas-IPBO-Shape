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

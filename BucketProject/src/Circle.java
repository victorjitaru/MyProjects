public class Circle extends Shape{

    private static Double pi = 3.14;
    final Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Created circle{ radius" + radius + "}";
    }

    public Double calculateArea() {
        return getRadius() * getRadius() * pi;
    }

    public Double calculatePerimeter(){
        return 2 * getRadius() * pi;
    }
}
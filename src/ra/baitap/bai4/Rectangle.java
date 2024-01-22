package ra.baitap.bai4;

public class Rectangle extends Shape{
    double radius;
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public Rectangle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Rectangle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

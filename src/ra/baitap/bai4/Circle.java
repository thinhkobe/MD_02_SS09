package ra.baitap.bai4;

public class Circle extends Shape{
    double width;
    double height;
    @Override
    public double getArea() {
        return  width*height;
    }

    public Circle(String color, double width) {
        super(color);
        this.width = width;
    }

    public Circle(double width) {
        this.width = width;
    }

    public Circle() {

    }

    @Override
    public String toString() {
        return "Circle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

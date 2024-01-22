package ra.baitap.bai2;


public class Main {
    public static void main(String[] args) {
//Kiểm thử Class Shape
        System.out.println("-------- - SHAPE----------");



//kiểm thử Class Circle
        System.out.println("-------- - CIRCLE----------");

        Circle circle = new Circle();
        System.out.println(circle);


        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);



        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);



        square = new Square(5.8, "yellow", true);
        System.out.println(square);


        Shape[] shapes= {circle,square,rectangle

        };
        for (Shape  s :shapes){
            System.out.println("dien tich "+s.getArea());
            if(s instanceof Square){
                Square square1=(Square) s;
                square1.howToColor();
            }
            System.out.println("---------------");
        }

    }
}
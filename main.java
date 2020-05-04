package TH_Class_Shape;

public class main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        //

        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        //
        Ractangle rectangle = new Ractangle();
        System.out.println(rectangle);

        rectangle = new Ractangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Ractangle("red", true, 40, 60);
        System.out.println(rectangle);
    }
}

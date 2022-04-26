package shapes;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape shape1 = new Square(5);
        shape1.print();
        Shape shape2 = new Rectangle(3,6);
        shape2.print();
        Shape shape3 = new Circle(7);
        shape3.print();
        Shape shape4 = new RightTriangle(3, 4);
        shape4.print();

        Rectangle rectangle = new Rectangle(1,2);
        rectangle.print();

    }

}

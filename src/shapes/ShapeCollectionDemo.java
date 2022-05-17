package shapes;

import java.util.*;

public class ShapeCollectionDemo {

    public static void main(String[] args) {
        ShapeCollectionDemo demo = new ShapeCollectionDemo();
        demo.printShapeCollection(demo.createShapeCollection());

    }


    private ShapeCollectionDemo() {
    }

    public Collection<Shape> createShapeCollection() {// hier wird ein Collection erstellt, Werte werden diesem zugewiesen
        Collection<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(6));
        shapes.add(new Square(5));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new RightTriangle(4, 5));

        return shapes;
    }

    public void printShapeCollection(Collection<Shape> shapes) {
        System.out.println("iteration by foreach");
        for (Shape shape : shapes) {// hier wird was ausgegeben
            shape.print();
        }
        System.out.println("iteration by iterator");
        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()) {
            iterator.next().print();
        }


    }
}

package shapes;

public abstract class Shape {

    public Shape() {
    }

    public void print() {
        System.out.printf("%s: area=%f, perimeter=%f\n", this.getShapeName(), this.getArea(), this.getPerimeter());
    }

    public abstract String getShapeName();

    public abstract double getArea();

    public abstract double getPerimeter();

}

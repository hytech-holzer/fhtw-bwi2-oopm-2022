package shapes;

public class RightTriangle extends Triangle {

    private double a;
    private double b;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return (a * b) / 2;
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(a*a+b*b)+a+b;
    }

    @Override
    public String getShapeName() {
        return "rechtwinkeliges Dreieck";
    }
}

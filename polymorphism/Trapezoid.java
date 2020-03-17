package polymorphism;

public class Trapezoid extends Figure {
    double high;
    double side1;
    double side2;

    @Override
    double getArea() {
        return (side1 + side2) / 2 * high;
    }

    Trapezoid(String name, double side1, double side2, double high) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "high=" + high +
                ",side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}

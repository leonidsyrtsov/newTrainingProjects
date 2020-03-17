package polymorphism;


import java.text.DecimalFormat;

public class Triangle extends Figure {
    double side1;
    double side2;
    double corner;

    @Override
    double getArea() {
        return  0.5 * side1 * side2 * Math.sin(corner);

    }

    Triangle(String name, double side1, double side2, double corner) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
        this.corner = Math.toRadians(corner);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", corner=" + corner +
                '}';
    }
}

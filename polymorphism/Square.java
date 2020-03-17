package polymorphism;

public class Square extends Figure {
    double side;

    @Override
    double getArea() {
        return side*side;
    }

    Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}

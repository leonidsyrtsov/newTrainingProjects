package polymorphism;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> list = new ArrayList<Figure>();
        list.add(new Triangle("Triangle",3,6,1));
        list.add(new Square("Square",5));
        list.add(new Trapezoid("Trapezoid",6,12,4));
        for (Figure x:list) {
            System.out.println(x.getName() + " = "  + x.getArea());
        }
    }
}
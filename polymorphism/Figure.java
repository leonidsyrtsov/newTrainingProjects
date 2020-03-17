package polymorphism;

public abstract class  Figure {
    private String name;
    abstract double  getArea();
    Figure(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

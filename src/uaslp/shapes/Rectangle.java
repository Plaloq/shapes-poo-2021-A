package uaslp.shapes;

import uaslp.Shape;

public class Rectangle extends Shape {

    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Rectangle";
    }

    public double getPerimeter() {
        return (base * 2)+(height * 2);
    }

    public double getArea(){
        return base*height;
    }

    public int getSidesCount(){
        return 4;
    }
}

package uaslp.shapes;

import uaslp.Shape;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public String getName() {
        return "Square";
    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea(){
        return side*side;
    }

    public int getSidesCount(){
        return 4;
    }
}
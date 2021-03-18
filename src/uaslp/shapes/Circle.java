package uaslp.shapes;

import uaslp.Shape;
public class Circle extends Shape {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public String getName() {
        return "Circle";
    }

    public int getRadio() {
        return radio;
    }

    public double getPerimeter() {
        return 2 * 3.1416 * radio;
    }

    public double getArea(){
        return 3.1416*Math.pow(radio, 2);
    }

    public int getSidesCount(){
        return 1;
    }
}

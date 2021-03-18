package uaslp.shapes.triangles;

import uaslp.shapes.Triangle;

public class TriangleEquilatero extends Triangle {
    private int side;

    public TriangleEquilatero(int side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side * 3;
    }

    public double getArea(){
        return (Math.sqrt(3))/4* Math.pow(side, 2);
    }

    public int getSidesCount(){
        return 3;
    }
}

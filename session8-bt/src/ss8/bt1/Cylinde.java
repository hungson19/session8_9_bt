package ss8.bt1;

import ss8.bt1.Circle;

public class Cylinde extends Circle {
    private double height;

    public Cylinde(double radis, String color) {
        super(radis, color);
    }

    public Cylinde(double radis, String color, double height) {
        super(radis, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getCount(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinde{" +
                "getRadis= " + getRadis() +
                "getColor= " + getColor() +
                "getCount= " + getCount() +
                "height=" + height +
                '}';
    }


}

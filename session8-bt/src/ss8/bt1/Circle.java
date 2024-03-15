package ss8.bt1;

public class Circle {
    private double radis;
    private String color;

    public Circle(double radis, String color) {
        this.radis = radis;
        this.color = color;
    }

    public double getRadis() {
        return radis;
    }

    public void setRadis(double radis) {
        this.radis = radis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//    public double Area(){
//        return Math.PI*radis*radis;
//    }
    public double getArea(){
        return Math.PI*radis*radis;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radis=" + radis +
                ", color = '" + color +
                ", getArea = '" + getArea() +
                '}';
    }


}

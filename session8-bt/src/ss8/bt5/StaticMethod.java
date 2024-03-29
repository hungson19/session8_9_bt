package ss8.bt5;

public class StaticMethod {
    private static float PI = 3.14F;

    public static double calCircleArea(double R) {
        return (PI * R * R);
    }

    public static double calRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calTriangleArea(double a, double b, double c) {
        double p = (a + a+ c)/2;
        return Math.sqrt(p*(p-a) * (p-b) * (p-c));
    }
}

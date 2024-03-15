package ss8.bt2;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 2);
        System.out.println("Toa do ban dau");
        System.out.println(point2D.toString());
        System.out.println("Toa do sau thay doi");
        point2D.setXY(5,6);
        System.out.println(point2D.toString());
        System.out.println("------------------");

        Point3D point3D = new Point3D(3,4,5);
        System.out.println("Toa do ban dau");
        System.out.println(point3D.toString());
        System.out.println("Toa do sau thay doi");
        point3D.setXYZ(4,5,6);
        System.out.println(point3D.toString());


    }
}

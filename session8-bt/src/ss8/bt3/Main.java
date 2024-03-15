package ss8.bt3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1.0f,2.0f);
        System.out.println(point);
        System.out.println("-----------------------------------------------");
        MovablePoint movablePoint = new MovablePoint(1.0f,2.0f,3.0f,4.0f);
        System.out.println("Truoc khi di chuyen");
        System.out.println(movablePoint);
        System.out.println("Sau khi di chuyen");
        movablePoint.move().move().move().move().move();
        System.out.println(movablePoint);

    }
}

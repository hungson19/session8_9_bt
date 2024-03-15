package ss8.bt5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tinh dien tich cac hinh tron : ");
        System.out.println(StaticMethod.calCircleArea(3.5));;
        System.out.println(StaticMethod.calCircleArea(6));;

        System.out.println("Tinh dien tich cac hinh tam giac");
        System.out.println(StaticMethod.calTriangleArea(1,2,3));;
        System.out.println(StaticMethod.calTriangleArea(4.5,7,6));;

        System.out.println("Tinh dien tich cac hinh chu nhat:");
        System.out.println(StaticMethod.calRectangleArea(2.5,6));;
        System.out.println(StaticMethod.calRectangleArea(4,7));;
    }
}

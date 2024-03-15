package ss8.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Nhap do dai canh thu 1: ");
        triangle.setSide1(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap do dai canh thu 2: ");
        triangle.setSide2(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap do dai canh thu 3: ");
        triangle.setSide3(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap mau cho tam giac: ");
        triangle.setColor(scanner.nextLine());
        System.out.println("Dien tich tam giac la: "+ triangle.getArea());
        System.out.println("Chu vi tam giac la: "+ triangle.getPerimeter());
        System.out.println(triangle);
    }

}

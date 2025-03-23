package java1.lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bai1 bai1 = new Bai1();
        bai1.ptb1(scanner);

    }

    public void ptb1(Scanner scanner) {
        System.out.println(" nhap vao so a :");
        float a = scanner.nextFloat();
        System.out.println("nhap vao so b : ");
        float b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.print("phuong trinh vo so nghiem ");
            } else {
                System.out.print("phuong trinh vo nghiem ");
            }
        } else {

            float x = -b / a;
            System.out.print(" phuong trinh co nghiem duy nhat " + x);
        }
        scanner.close();
    }
}

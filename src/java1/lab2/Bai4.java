package java1.lab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" +----------------------+");
        System.out.println(" vui long lua chon chuc nang :");
        System.out.println("1. Giai phuong trinh bac nhat:");
        System.out.println("2. Giai phuong trinh bac 2 :");
        System.out.println("3. Tinh tien dien :");
        System.out.println("4. ket thuc chuong trinh");
        System.out.println(" +----------------------+");
        int luaChon = scanner.nextInt();
        while (true) {
            switch (luaChon) {
                case 1:
                    Bai1 bai1 = new Bai1();
                    bai1.ptb1(scanner);
                    break;
                case 2:
                    Bai2 bai2 = new Bai2();
                    bai2.phuongtrinhbachai(scanner);
                    break;
                case 3:
                    Bai3 bai3 = new Bai3();
                    bai3.tinhTiendien(scanner);
                    break;
                case 4:
                    System.out.print("phuong trinh ket thuc ");
                    scanner.close();
                    return;
            }
        }
    }
}

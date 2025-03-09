package java1.baitaplab;

import java.util.Scanner;

public class Lab_bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai canh lap phuong");
        int chieudai = scanner.nextInt();
        double thetich = Math.pow(chieudai,3);
        System.out.println("the tich hinh lap phuong la "+thetich);
        scanner.close();
    }
}

package java1.lab2;


import java.util.Scanner;

public class Bai3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so dien su dung trong thang : ");
        double Sodien = scanner.nextDouble();
            if (Sodien < 50) {
                double tienDien = Sodien*1000;
                System.out.print("so dien su dung trong thang la : " + tienDien);
            } else{
                double tienDien = 50*1000+(Sodien-50)*1200;
                System.out.print("so dien su dung trong thang la : " + tienDien);
            }
        scanner.close();

    }
}

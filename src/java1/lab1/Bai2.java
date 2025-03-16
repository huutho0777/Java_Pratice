package java1.lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai canh 1");
        String canh1Line = scanner.nextLine();
        System.out.println("nap chieu dai canh 2");
        int canh2= scanner.nextInt();
        int canh1 = Math.round(Float.parseFloat(canh1Line.replace("\"", "")));
        int chuvi = canh1+canh2;
        int dientich = (canh1+canh2)*2;
        System.out.println("chu vi hinh chu nhat la :"+ chuvi);
        System.out.println("dien tich hinh chu nhat la "+ dientich);
        System.out.println("canh nho nhat la "+ Math.min(canh1,canh2));
    }
}

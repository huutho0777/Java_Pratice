package java1.bai4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a");
        int a = scanner.nextInt();
        if(a<0){
            System.out.println("a la so am");
        } else if (a>0){
            System.out.println("a la so duong");
        }
        else{
            System.out.println("a=0");
        }
    }
}

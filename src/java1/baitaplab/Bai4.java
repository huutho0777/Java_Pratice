package java1.baitaplab;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        double delta = Math.pow(b,2)-4*a*c;
        System.out.println("gia tri delta: "+ delta);
        System.out.print("gia tri can delta: "+Math.sqrt(delta));


    }
}


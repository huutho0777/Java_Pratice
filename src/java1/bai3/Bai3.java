package java1.bai3;
import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a");
        int a = scanner.nextInt();
        if(a<0){
            System.out.println("a la so am");
        } else if (a>0){
            System.out.println("a la so duong abc");
        }
        else{
            System.out.println("a=0");
        }
    }
}

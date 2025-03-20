package java1.lab3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mang so nguyen n");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println(" nhap phan tu cua mang");
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(" "+Arrays.toString(arr));
        int min = arr[0];
        System.out.println("phan tu nho nhat :"+ min);

        int tong =0, biendem=0;
        for(int num :arr){
            if(num%3==0){
                tong+=num;
                biendem++;
            }
        }
        System.out.println("tong cac so chia het cho 3 la : "+tong);
        double tBC= tong/biendem;
        System.out.print("trung binh cong cac so chia het cho 3 la :"+tBC);








    }
}

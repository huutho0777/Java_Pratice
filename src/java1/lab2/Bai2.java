package java1.lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        float a = scanner.nextFloat();
        System.out.print("b = ");
        float b = scanner.nextFloat();
        System.out.print("c = ");
        float c = scanner.nextFloat();
        float delta=(b*b)-4*a*c;
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.print("phuong trinh vo so nghiem.");
                }else{
                    System.out.print("phuong trinh vo nghiem. ");
                }
            }else{

                float x= -c /b;
                System.out.print(" phuong trinh co nghiem duy nhat : "+x);
            }

        }
        else{
            if(delta<0){
                System.out.println("phuong trinh vo nghiem. ");
            }
            else if(delta>0){
                float x1=(-b+(float)Math.sqrt(delta))/(2*a);
                float x2=(-b-(float)Math.sqrt(delta))/(2*a);
                System.out.println("phuong trinh co nghiem phan biet x1= "+ x1 +" va x2 =" +x2);
            }
            else{
                float x =-b/(2*a);
                System.out.println("phuong trinh co nghiem kep : "+x);
            }
        }


    }
}

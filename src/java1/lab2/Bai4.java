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
        switch (luaChon){
            case 1: ptb1(scanner);
            break;
            case 2: ptb2(scanner);
            break;
            case 3: tinhTiendien(scanner);
            break;
            case 4:
                System.out.print("phuong trinh ket thuc ");
                scanner.close();
                return ;



        }


         }
    public static void ptb1(Scanner scanner){
        System.out.println(" nhap vao so a :");
        float a = scanner.nextFloat();
        System.out.println("nhap vao so b : ");
        float b = scanner.nextFloat();
        if(a==0){
            if(b==0){
                System.out.print("phuong trinh vo so nghiem ");
            }else{
                System.out.print("phuong trinh vo nghiem ");
            }
        }else{

            float x= -b/a;
            System.out.print(" phuong trinh co nghiem duy nhat "+x);
        }

    }
public static void ptb2(Scanner scanner){
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
 public static void tinhTiendien(Scanner scanner){
     System.out.print("nhap vao so dien su dung trong thang : ");
     double Sodien = scanner.nextDouble();
     if (Sodien < 50) {
         double tienDien = Sodien*1000;
         System.out.print("so dien su dung trong thang la : " + tienDien);
     } else{
         double tienDien = 50*1000+(Sodien-50)*1200;
         System.out.print("so dien su dung trong thang la : " + tienDien);
     }


 }
 }









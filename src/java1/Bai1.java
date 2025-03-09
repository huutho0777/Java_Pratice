package java1;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ho va ten :");
        String hoten = scanner.nextLine();
        System.out.println("nhap diem tb");
        float nhapdiem = scanner.nextFloat();
        System.out.print("ten sinh vien :" + hoten + " co diem trung binh " + nhapdiem);


        scanner.close();
    }
}

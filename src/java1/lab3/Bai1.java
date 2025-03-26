//package java1.lab3;
//
//import java.util.Scanner;
//
//public class Bai1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap vao so nguyen n: ");
//        int n = scanner.nextInt();
//
//        if (n <= 1) {
//            System.out.println(n + " khong phai la so nguyen to.");
//            return;
//        }
//
//        // Biến đếm số ước
//        int count = 0;
//
//        // Kiểm tra xem n có bao nhiêu ước
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                count++; // Tăng biến đếm nếu tìm thấy ước số
//            }
//        }
//
//        // Số nguyên tố chỉ có đúng 2 ước: 1 và chính nó
//        if (count == 2) {
//            System.out.println(n + " la so nguyen to.");
//        } else {
//            System.out.println(n + " khong phai la so nguyen to.");
//        }
//    }
//}
package java1.lab3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen N: ");
        int N = scanner.nextInt();

        if (N <= 1) {
            System.out.println(N + " khong phai la so nguyen to.");
            return;
        }

        boolean ok = true; // Biến kiểm tra số nguyên tố

        for (int i = 2; i < N; i++) { // Chạy từ 2 đến N-1
            if (N % i == 0) {  // Nếu N chia hết cho i
                ok = false;     // Không phải số nguyên tố
                break;          // Dừng vòng lặp
            }
        }

        // Kiểm tra biến `ok` để đưa ra kết quả
        if (ok) {
            System.out.println(N + " la so nguyen to.");
        } else {
            System.out.println(N + " khong phai la so nguyen to.");
        }

        boolean ketquadung = kiemTraSoNguyenTo(N);
        if (ketquadung) {
            System.out.println("");
        } else {
            System.out.println("N khong phai so ngyyen to");
        }
    }

    private static boolean kiemTraSoNguyenTo(int n) {
        return false;
    }
}

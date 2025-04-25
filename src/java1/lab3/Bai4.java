package java1.lab3;


import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main (String [] args){ Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng

        // Khai báo mảng họ tên và điểm
        String[] names = new String[n];
        double[] scores = new double[n];

        // Nhập thông tin
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Nhập điểm của " + names[i] + ": ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng
        }

        // Sắp xếp giảm dần theo điểm
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (i, j) -> Double.compare(scores[j], scores[i])); // Sắp xếp giảm dần

        // Xuất danh sách đã sắp xếp
        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm giảm dần:");
        for (int i = 0; i < n; i++) {
            int index = indices[i];
            System.out.println(names[index] + " - " + scores[index]);
        }

        scanner.close();
    }
}
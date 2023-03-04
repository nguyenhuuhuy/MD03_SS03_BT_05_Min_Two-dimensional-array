package Min_Mang_Hai_Chieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("nhập số dòng: ");
        x = scanner.nextInt();
        System.out.println("Nhập số cột:");
        y = scanner.nextInt();
        int[][] list = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Ô thứ: [" + i +"]["+ j + "] = ");
                list[i][j] = scanner.nextInt();
            }
        }
        int min = list[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(min>list[i][j]){
                    min = list[i][j];
                }
            }
        }
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}

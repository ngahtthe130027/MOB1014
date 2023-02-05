package B5_Mang;

import java.util.Arrays;
import java.util.Scanner;

public class B1_Array {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = {9, 5, 2, 7, 3};
        String[] arr3 = {"FPT", "Poly", "HN"};

        //for  +tab
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("i= " + arr2[i]);
        }
        //Mảng 2 chiều
        Scanner sc = new Scanner(System.in);
        int row = 2, col = 3;
        int a[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("a[%d][%d]=", i, j);
                a[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("a[%d][%d]= %d \n", i, j, a[i][j]);
            }
        }

        //sắp xếp mảng chứa kiểu dữ liệu nguyên thuỷ
        Arrays.sort(arr2);
    }
}

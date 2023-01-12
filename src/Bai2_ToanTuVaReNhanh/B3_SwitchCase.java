package Bai2_ToanTuVaReNhanh;

import java.util.Scanner;

public class B3_SwitchCase {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=====MENU HELTHY=====");
            System.out.println("== 1. Trung luoc   ==");
            System.out.println("== 2. Rau luoc     ==");
            System.out.println("== 3. Thit luoc    ==");
            System.out.println("== 4. Gao luoc     ==");
            System.out.println("== 5. Thoat        ==");
            System.out.println("=====================");
            System.out.println("May an mon nao? ");
            System.out.println("Tao chon mon so: ");
            int luaChon = sc.nextInt();
            //sw + tab
            switch (luaChon) {
                case 1:
                    monSo1();
                    break;
                case 2:
                    System.out.println("Rau luoc");
                    break;
                case 3:
                    System.out.println("Thit luoc");
                    break;
                case 4:
                    System.out.println("Gao luoc");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Long xao dua");
                    break;
            }
        }
    }

    public static void monSo1() {
        System.out.println("Trung luoc");
    }
}

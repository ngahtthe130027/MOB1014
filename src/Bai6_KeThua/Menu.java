/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6_KeThua;

import java.util.Scanner;

/**
 *
 * @author hathithanhnga
 */
public class Menu {
    //bien toan cuc
    //static QuanLyNhanVien _ql = new QuanLyNhanVien();

    public static void main(String[] args) {
        QuanLyNhanVien ql = new QuanLyNhanVien();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int option = ql.menu();
            switch (option) {
                case 1:
                    String sayYes;
                    do {
                        ql.nhap();
                        System.out.println("Tiếp tục nhập nhân viên không?");
                        sayYes = sc.nextLine();
                    } while (sayYes.equals("y") || sayYes.equals("yes"));             
                    break;
                case 2:
                    ql.xuat();
                    break;
                case 3:
                    ql.sua();
                    break;
                case 4:
                    ql.timKiem();
                    break;
                case 5:
                    ql.xoa();
                    break;
                
                default:
                    return;
            }
        }
    }

}

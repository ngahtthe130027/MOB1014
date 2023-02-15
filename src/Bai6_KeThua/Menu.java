/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6_KeThua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hathithanhnga
 */
public class Menu {
    //bien toan cuc
    //static QuanLyNhanVien _ql = new QuanLyNhanVien();

    public static void main(String[] args) {
        List<NhanVien> listNV = new ArrayList<>();
        listNV.add(new NhanVien("ngahtt4", "Ha Thi Thanh Nga", 5));
        listNV.add(new TiepThi(1, 3, "xuannt", "Nguyen Xuan", 6));
        listNV.add(new TruongPhong(5, "truongnt", "Ngo Truong", 10));
        QuanLyNhanVien ql = new QuanLyNhanVien(listNV);
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

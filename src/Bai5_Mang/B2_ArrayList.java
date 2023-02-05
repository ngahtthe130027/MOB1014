package Bai5_Mang;

import Bai4_OOP.SinhVien;

import java.util.ArrayList;

public class B2_ArrayList {
    public static void main(String[] args) {
        ArrayList<SinhVien> listSV = new ArrayList<>();
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien("ngahtt20", "nga", 2004, 5);

        listSV.add(sv1);
        listSV.add(sv2);
        listSV.add(new SinhVien("sinh vien 3", "ngahihi", 2000, 10));

        ArrayList listKhongXacDinh = new ArrayList();
        listKhongXacDinh.add(sv2);
        listKhongXacDinh.add(true);
        listKhongXacDinh.add("nga");

        for (SinhVien sv : listSV) {
            System.out.println(sv.toString());
        }
        // xoa phan tu tai vi tri
        listSV.remove(2);

        // xoa phan tu theo tinh chat
        listSV.remove(sv1);

        System.out.println(listSV.size());
        System.out.println("____________________________");
        for (Object sv : listSV) {
            System.out.println(sv.toString());
        }

        //limit in the feature
        listSV.sort((o1, o2) -> {
            return 0; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });

        for (Object object : listKhongXacDinh) {
            System.out.println(object.toString());
        }
        // Lam trong list
        listKhongXacDinh.clear();

        System.out.println("Sau khi clear ne!!!!!");

        for (Object object : listKhongXacDinh) {
            System.out.println(object.toString());
        }

    }
}

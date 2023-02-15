/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai6_KeThua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hathithanhnga
 */
public class QuanLyNhanVien {

     //bien toan cuc
    List<NhanVien> _listNhanVien = new ArrayList<>();
    Scanner _sc = new Scanner(System.in);
    
    public QuanLyNhanVien(List<NhanVien> list){
        _listNhanVien = list;
    }
    
    public QuanLyNhanVien(){
        
    }

    public int menu() {
        System.out.println("Quản lý Nhân Viên");
        System.out.println("______________________");
        System.out.println("1. Nhập thông tin Nhân Viên mới.");
        System.out.println("2. Xuất thông tin danh sách Nhân Viên");
        System.out.println("3. Sua thong tin Nhan Vien");
        System.out.println("4. Tim kiem thong tin Nhan Vien");
        System.out.println("5. Xoa Nhan Vien");
        System.out.println("6. Sap xep danh sach");
        System.out.println("7. Thoat chuong trinh");

        System.out.print("Mời bạn lựa chọn: ");
        int option = Integer.parseInt(_sc.nextLine());

        return option;

    }

    public void nhap() {
        System.out.println("Nhập thông tin nhân viên:");
        System.out.println("_______________________");
        System.out.println("Chon Phong Ban:");
        System.out.println("1. Hanh Chinh");
        System.out.println("2. Tiep Thi");
        System.out.println("3. Truong Phong");
        
        int option = _sc.nextInt();
        
        switch (option) {
            case 1:
                NhanVien nv = new NhanVien();
                nv = nv.nhapThongTin();
                _listNhanVien.add(nv);
                break;
            case 2:
                TiepThi tt = new TiepThi();
                tt = (TiepThi) tt.nhapThongTin();
                _listNhanVien.add(tt);
                break;
            case 3:
                TruongPhong tp = new TruongPhong();
                tp = (TruongPhong) tp.nhapThongTin();
                _listNhanVien.add(tp);
                break;
            default:
                break;
        }
    }

    public void xuat() {
        System.out.println("Thông tin của Nhân Viên ");
        for (NhanVien nhanVien : _listNhanVien) {
            System.out.println("____________________");
            
            //Downcasting
            if(nhanVien instanceof TiepThi){
                //tt = (TiepThi) nhanVien; //ep kieu tuong minh
                TiepThi tiepThi = (TiepThi) nhanVien;
                tiepThi.xuatThongTin();
            }else if(nhanVien instanceof TruongPhong tp){
                TruongPhong truongPhong = tp; // ep kieu ngam dinh
                tp.xuatThongTin();
            }else{
                nhanVien.xuatThongTin(); 
            }
        }
    }

    public int timKiemViTri() {
        System.out.print("Nhập mã Nhân Viên: ");
        String maNV = _sc.nextLine();

        for (NhanVien nhanVien : _listNhanVien) {
            if (nhanVien.getMaNV().equals(maNV)) {
                int index = _listNhanVien.indexOf(nhanVien);
                return index;
            }
        }
        return -1;
    }

    public void sua() {
        int index = timKiemViTri();
        if (index == -1) {
            System.out.println("Không tìm thấy nhân viên cần sửa!!!");
        } else {
            System.out.println("Chọn thông tin cần sửa:");
            System.out.println("1. Ma Nhan Vien");
            System.out.println("2. Ho ten");
            System.out.println("3. Luong");

            int option = _sc.nextInt();

            switch (option) {
                case 1:
                    String maNV = _sc.nextLine();
                    _listNhanVien.get(index).setMaNV(maNV);
                    break;
                case 2:
                    String hoTen = _sc.nextLine();
                    _listNhanVien.get(index).setHoTen(hoTen);
                    break;
                case 3:
                    double luong = _sc.nextDouble();
                    _listNhanVien.get(index).setLuong(luong);
                    break;
                default:
                    break;
            }

        }
    }

    public void timKiem() {
        int index = timKiemViTri();
        if (index < 0) {
            System.out.println("Khong tim thay thong tin Nhan Vien!!!");
        } else {
            System.out.println("Thong tin Nhan Vien:");
            _listNhanVien.get(index).xuatThongTin();
        }
    }

    public void xoa() {
        int index = timKiemViTri();
        if (index < 0) {
            System.out.println("Khong tim thay Nhan Vien de xoa!!!");
        } else {
            _listNhanVien.remove(index);
            System.out.println("Xoa thanh cong.");
        }
    }

    public void sapxep() {
//        _listNhanVien.sort((o1, o2) -> {
//            return o1.getLuong() > o2.getLuong() ? 1 : -1;
//        });
        _listNhanVien.sort(new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.getLuong() > o2.getLuong()) {
                    return 1;
                }
                return -1;
            }

        });
        Collections.sort(_listNhanVien, (o1, o2) -> {
            return o1.getLuong() > o2.getLuong() ? 1 : -1;
        });
        System.out.println("Sap xep thanh cong.");
    }
}

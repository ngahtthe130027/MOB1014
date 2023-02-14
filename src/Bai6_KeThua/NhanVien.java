package Bai6_KeThua;

import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getThueTN(){
        if(this.luong < 9){
            return 0;
        }else if(this.luong >= 9 && this.luong <= 15){
            return this.luong * 0.1;
        }else{
            return this.luong * 0.12;
        }
    }

    public double getThuNhap(){
        return this.luong - getThueTN();
    }

//    public double getThuNhap(double luong){
//        return 0.0;
//    }

    public void xuatThongTin(){
        System.out.println("Mã Nhân Viên: " + this.maNV);
        System.out.println("Họ và tên: " + this.hoTen);
        System.out.println("Lương: " + this.luong);
    }
    
    public NhanVien nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên:");
        System.out.println("_______________________");
        System.out.println("Mã nhân viên: ");
        String maNV = sc.nextLine();
        System.out.println("Họ tên:");
        String hoTen = sc.nextLine();
        System.out.println("Lương:");
        double luong = sc.nextDouble();
        NhanVien nv = new NhanVien(maNV, hoTen, luong);
        return nv;
    }
}

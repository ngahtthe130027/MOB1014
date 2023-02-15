package Bai6_KeThua;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + this.trachNhiem;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("Luong Trach Nhiem: " + this.trachNhiem);
    }

    @Override
    public NhanVien nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = super.nhapThongTin(); 
        System.out.println("Luong trach nhiem: ");
        double luongTN = sc.nextDouble();
        TruongPhong tp = new TruongPhong(luongTN, nv.getMaNV(), nv.getHoTen(), nv.getLuong());
        return tp;
                
    } 

}

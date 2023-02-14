package Bai6_KeThua;

import java.util.Scanner;

public class TiepThi extends NhanVien{
    private double doanhSo;
    private double hueHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hueHong, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + this.hueHong;
    }
    
    @Override
    public NhanVien nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = super.nhapThongTin(); 
        System.out.println("Hoa hong: ");
        double hoaHong = sc.nextDouble();
        System.out.println("Doanh so: ");
        double doanhSo = sc.nextDouble();
        TiepThi tt = new TiepThi(doanhSo, hoaHong, nv.getMaNV(), nv.getHoTen(), nv.getLuong());
        return tt;
    }
}

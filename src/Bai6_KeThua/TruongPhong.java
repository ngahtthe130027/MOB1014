package Bai6_KeThua;

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

}

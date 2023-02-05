package Bai4_OOP;

public class SinhVien {
    //1. THUỘC TÍNH
    //phải private tất cả các thuộc tính
    private String msv;
    private String hoTen;
    private int namSinh;
    private double diem;
    //2. CONSTRUCTOR: HÀM TẠO
    /*
        Cách gõ:
        - C1: (ctrl + cách + enter) x2 lần
        - C2: click chuột phải => Insert Code
              => Constructor => [select All] => Generate
    */
    //2.1 Constructor không tham số
    public SinhVien() {
    }
    //2.2 Constructor có tham số
    public SinhVien(String msv, String hoTen, int namSinh, double diem) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diem = diem;
    }
    //3. GETTER & SETTER
    /*
        Cách gõ:
        - click chuột phải => Insert Code
              => Getter and Selecter => Select All => Generate
        - Get: lấy giá trị
        - Set: gán giá trị
    */
    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //4. toString()
    /*
    Cách gõ:
     - click chuột phải => Insert Code
        => toString()=> Select All => Generate
    */

    @Override
    public String toString() {
        return "SinhVien{" + "msv=" + msv + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diem=" + diem + '}';
    }
    public void inThongTin(){
        System.out.println("===================");
        System.out.println("THONG TIN SINH VIEN");
        System.out.println("MSV= "+ msv);
        System.out.println("Ho va Ten= "+hoTen);
        System.out.println("Nam sinh= "+ namSinh);
        System.out.println("Diem= "+ diem);
        System.out.println("===================");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7_TruuTuong;

/**
 *
 * @author hathithanhnga
 */
public abstract class HinhTruuTuong {
    //cac thuoc tinh
    private String ten;
      
    // cac phuong thuc truu tuong
    public abstract float tinhChuVi();
    public abstract float tinhDienTich();

    public HinhTruuTuong() {
    }

    public HinhTruuTuong(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
}

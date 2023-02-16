/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7_TruuTuong;

/**
 *
 * @author hathithanhnga
 */
public class HinhChuNhat extends HinhHoc{
    private float dai;
    private float rong;
    
    public HinhChuNhat(){
        
    }
    
    public HinhChuNhat(float dai, float rong){
        super("Hinh Chu Nhat");
        this.dai = dai;
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    @Override
    public float tinhChuVi() {
        return (this.dai + this.rong) * 2;
    }

    @Override
    public float tinhDienTich() {
        return this.dai * this.rong;
    }
    
    
}

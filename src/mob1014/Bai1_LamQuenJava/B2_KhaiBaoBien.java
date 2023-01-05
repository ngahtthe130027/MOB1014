/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mob1014.Bai1_LamQuenJava;

import java.util.Scanner;

/**
 *
 * @author hathithanhnga
 * 
 */
public class B2_KhaiBaoBien {   
    /*
        1. Kiểu dữ liệu
        boolean, byte, char, short, int, long, float, double
        2. Khai báo biến
            <kiểu dữ liệu> <tên biến> [=<giá trị>]
        3. Quy tắc đặt tên biến
           * Có 2 loại biến:
            - Biến toàn cục: nằm ngoài Phương thức
            - Biến cục bộ: nằm trong Phương thức
           * Quy tắc đặt tên biến:
            - Normal: firstname
            - Camel Case: firstName => SinhVien (Pascal Case)
            - Under score: first_name
           * Lưu ý:
            - ko dc bắt đầu bằng số
            - ko trùng với keyword: int, if, else, return,...
     */
    //psvm+tab
    static int bienToanCucTinh;// biến toàn cục tĩnh
    int bienToanCuc;
    
    public static void main(String[] args) {
        //biến cục bộ
        int variable = 2;
        bienToanCucTinh = 2;
//        System.out.printf("%d%d",bienToanCuc,variable);
//        System.out.println(bienToanCuc + variable);
//        System.out.println("2" + "2");
        int temp = variable * bienToanCucTinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tập trung gõ code đi, nhập tên vào đây: ");
        //String content = sc.nextLine();
        int number = sc.nextInt();
        //System.out.println(content);
        System.out.println(number);
    }
    
    public void hahaha(){
        bienToanCuc = 2;
        System.out.println("Haha");
    }
}

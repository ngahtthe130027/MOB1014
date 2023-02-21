/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8_StringVaRegex;

import java.util.Scanner;

/**
 *
 * @author hathithanhnga
 */
public class B1_String {
    public static void main(String[] args) {
        String st1 = "     Hello World     ";
        //System.out.print("Viet Nam dan chu cong hoa \r\n\t Dan ong rua bat");
        String fullName = "Ha Thi Thanh Nga";
        String name = fullName.substring(7, 12);
        String vietThuong = fullName.toLowerCase();
        System.out.println(vietThuong);
        String vietHoa = fullName.toUpperCase();
        System.out.println(vietHoa);
        String xoaSpace = st1.trim();
        System.out.println(xoaSpace);
        int doDai = fullName.length();
        System.out.println(doDai);
        char kiTu = fullName.charAt(5);
        System.out.println(kiTu);
        String thayThe = fullName.replaceAll("a", "A");
        System.out.println(thayThe);
        String[] arraySplit = fullName.split("T");
        for (String string : arraySplit) {
            System.out.println(string);
        }
        
        boolean soSanh = fullName.equals(name);
        boolean soSanhIgnore = vietHoa.equalsIgnoreCase(vietThuong);
        System.out.println(soSanhIgnore);
        System.out.println(soSanh);
        
        boolean chua = name.contains(fullName);
        System.out.println(chua);
        
        boolean batDauBoi = fullName.startsWith("H");
        System.out.println(batDauBoi);
        
        //boolean khop = fullName.matches("[a-z][A-Z]*");
        int viTri = fullName.indexOf("a");
        System.out.println(viTri);
        
        int viTriCuoi = fullName.lastIndexOf("a");
        System.out.println(viTriCuoi);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password:");
        String password = sc.nextLine();
        if(username.equalsIgnoreCase("hello") 
                && password.length() > 6){
            System.out.println("Dang nhap thanh cong");
        }else{
            System.out.println("Dang nhap fail!!!");
        }
    }
}

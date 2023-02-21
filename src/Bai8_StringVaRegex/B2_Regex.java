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
public class B2_Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){            
            System.out.println("Enter your phone number: ");
//            try {
//                String pnumber = sc.nextLine();
//                int number = Integer.parseInt(pnumber);
//                break;
//            } catch (Exception e) {
//                System.out.println("May Nhap sai roi!!" + e);
//                continue;
//            }
//            String number = sc.nextLine();
//            String pattern = "0[2-9][0-9]{8}";
//            
//            if(number.matches(pattern)){
//                System.out.println("Nhap thanh cong");
//            }else{
//                System.out.println("Nhap that bai!!!");
//            }
            
            System.out.println("May co xe khong: ");
            String lincese = sc.nextLine();
            
            String pattern1 = "[1-9][0-9]-[A-Z][1-9]-[0-9]{4}";
            String pattern2 = "[1-9]\\d-[A-Z][1-9]-(\\d{3}\\.\\d{2})";
            
            if(lincese.matches(pattern1)){
                System.out.println("May giau the");
            }else{
                System.out.println("May noi dieu");
            }
            
        }
        
    }
    
    
    
    
}

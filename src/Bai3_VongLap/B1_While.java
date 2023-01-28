/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_VongLap;

import java.util.Scanner;

/**
 *
 * @author hathithanhnga
 */
public class B1_While {
    /*
        - Cau truc: while(dk){
                        //todo anything
                    }
    
        - Cau truc: do{
                        //todo anything
                    }while(dk)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int samTet = 0;
//        while(true){
//            System.out.println("So luong do toi muon mua: ");
//            samTet = sc.nextInt();
//            
//            if(samTet > 5){
//                System.out.println("May mua lam do the!!!");
//            }else{
//                System.out.println("Do nha ngheo!!");
//                break;
//            }
//        }
        System.out.print(samTet);
        
        do {       
            System.out.println("So luong do toi muon mua: ");
            samTet = sc.nextInt();
            
            if(samTet > 5){
                System.out.println("May mua lam do the!!!");
            }else{
                System.out.println("Do nha ngheo!!");
                break;
            }       
        } while (samTet < 10);
    }
}

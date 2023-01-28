/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_VongLap;

/**
 *
 * @author hathithanhnga
 */
public class For {
    /*
        Cấu trúc: For
            for(bien dem được gán, dk, buoc nhay){
                //todo anything
            }
    */
    public static void main(String[] args) {
        // for thường
        int banhChung = 0;
        
        for(int i = 0;i < 10; i++){
           // System.out.println("Banh Chung " + i);
        }
        
        //in the feature
        for (String arg : args) {
            
        }
        
        for (int i = 0; i < 10; i++) {
            if(i < 5){
                System.out.println("Banh Chung ne " + i);
                break;
            }else{
                System.out.println("Banh Ray " + i);
            }
        }
    }
}

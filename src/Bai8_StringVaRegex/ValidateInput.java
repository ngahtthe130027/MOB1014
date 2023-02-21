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
public class ValidateInput {
    Scanner _sc = new Scanner(System.in);
    
    public String validateHoTen(){
        String pattern = "[a-zA-Z ]+";
        String input;
        do {            
            System.out.println("Ho ten: ");
            input = _sc.nextLine();
        } while (!input.matches(pattern));
        
        return input;
    }
    
    public int validateInt(){
        String pattern = "\\d+";
        String input;
        do {            
            System.out.println("Enter Integer Number: ");
            input = _sc.nextLine();
        } while (!input.matches(pattern));
        
        return Integer.parseInt(input);
    }
    
    public double validateDouble(){
        String pattern = "\\d+\\.\\d+";
        String input;
        do {            
            System.out.println("Enter Double Number: ");
            input =_sc.nextLine();
        } while (!input.matches(pattern));
        
        return Double.parseDouble(input);
    }
    
    public String validateEmail(){
        String pattern = "\\w+@[a-zA-Z]+(\\.\\w+){1,2}";
        String input;
        do {            
            System.out.println("Enter Email: ");
            input = _sc.nextLine();
        } while (!input.matches(pattern));
        
        return input;
    }
    
    public String validateMSSV(){
        String pattern = "[A-Z]{2}[0-9]{5}";
        String input;
        do {            
            System.out.println("Enter student ID: ");
            input = _sc.nextLine();
        } while (!input.matches(pattern));
        
        return input;
    }
}

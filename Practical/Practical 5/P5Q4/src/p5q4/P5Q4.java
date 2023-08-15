/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5q4;
import java.util.Scanner;

/**
 *
 * @author Tan Jee Schuan
 */
public class P5Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean valid = false;
        String inputStr;
        
        while (!valid) {
            //(at least 7 characters) (only letters and digits) (at least one letter and one digit)
            System.out.print("\nEnter password: ");
            inputStr = sc.nextLine();
            
            int letterNum = 0;
            int digitNum = 0;
            boolean noSpecialChar = false;
            
            for (int i = 0; i < inputStr.length(); i++) 
            {
                char character = inputStr.charAt(i);
                
                if (Character.isDigit(character))
                    digitNum++;
                
                else if (Character.isLetter(character))
                    letterNum++;
                
                else
                    noSpecialChar = true;
            }   
            
            if (inputStr.length() >= 7 && digitNum > 0 && letterNum > 0 && noSpecialChar == false)
                valid = true;
            else
            {
                System.out.println("\n\nInvalid Password");
            }
        }
        
        System.out.println("Valid Password");
    }
    
}

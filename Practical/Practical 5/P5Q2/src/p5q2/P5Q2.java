/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5q2;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tan Jee Schuan
 */
public class P5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        
        char[] vowels = {'A','E','I','O','U'};
        inputStr = inputStr.toUpperCase();
                
        for (int j = 0; j < vowels.length; j++)
        {
            char vowel = vowels[j];
            inputStr = inputStr.replace(vowel,'x');
        }
        
        System.out.print("\nModified String: " + inputStr);
    }
}

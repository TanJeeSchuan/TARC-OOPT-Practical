/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5q1;
import java.util.Scanner;

/**
 * 
 * @author Tan Jee Schuan
 */
public class P5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
       
        String inputStr = sc.nextLine();
        
        System.out.print("\nEnter the letter you want to count: ");
        
        String buffer = sc.nextLine();
        char inputChar = buffer.charAt(0);
        
        int wordcount = countLetter(inputStr,inputChar);
        
        System.out.println("\n" +inputStr + " contains " + wordcount + inputChar);
       
    }
    
    public static int countLetter(String str, char ch)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (ch == str.charAt(i))
            {
                count++;
            }
        }
        
        return count;
    }
    
}

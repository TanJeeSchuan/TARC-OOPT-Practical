/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practical.practical1q2;

import java.util.Scanner;

/**
 *
 * @author Tan Jee Schuan
 */
public class Practical1Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        int years, days, seconds;
        years = age;
        days = age * 365;
        seconds = age * 365 * 24 * 60 * 60;
        
        System.out.print("Age in years: " + years + '\n');
        System.out.print("Age in days: " + days + '\n');
        System.out.print("Age in seconds: " + seconds + '\n');

    }
}

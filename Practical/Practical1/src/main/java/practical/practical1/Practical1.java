/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practical.practical1;

import java.util.Scanner;
/**
 *
 * @author Tan Jee Schuan
 */
public class Practical1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name");
        String name = sc.nextLine();
        
        System.out.print("Enter Year of Study: ");
        int yearStudy = sc.nextInt();
        
        System.out.print("Enter target GPA: ");
        float GPA = sc.nextFloat();
        
        System.out.print("Welcome " + name + "!");
        System.out.print("Work hard to achieve your target GPA of " + GPA + " this semester of your Year " + yearStudy);

    }
}

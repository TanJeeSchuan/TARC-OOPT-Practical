/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical3;

/**
 *
 * @author Tan Jee Schuan
 */

import java.util.Scanner;
public class P3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] denomination = {100,50,20,10,5,1};
        int[] qty = new int[denomination.length];
        int[] value = new int[denomination.length];
        int total = 0;
        
        System.out.println("Denomination (RM) \t Quantity");
        for (int i = 0; i < denomination.length; i++)
        {
            System.out.printf("%12d \t\t\t", denomination[i]);
            qty[i] = sc.nextInt();
            value[i] = denomination[i] * qty[i];
            total += value[i];
        }
        
        System.out.println("Denomination (RM) \tQuantity \t Value (RM)");
        for (int i = 0; i < denomination.length; i++)
        {
            if(qty[i] != 0)
                System.out.printf("%12d\t\t%6d\t\t%-10d\n", denomination[i], qty[i], value[i]);
        }
        
        System.out.println("Total: " + total);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2;

/**
 *
 * @author Tan Jee Schuan
 */
public class Q2 {

    public static double sqrt(int n)
    {
        double l = 0, u = 0;
        double mid, mid2;
        
        if (n < 0)
        {
            System.out.println("The number cannot be negative");
            System.exit(1);
        }
        else if (n == 0)
        {
            return 0;
        }
        
        else if (n == 1)
            return 1;
        
        else if (n > 1)
        {
            l = 1;
            u = n;
        }
        
        else if (n < 1)
        {
            l = n;
            u = 1;
        }
        
        while(Math.abs(u - l)/l >= 1e-8)
        {
            mid = (u + l) / 2;
            mid2 = mid*mid;
            
            if (mid2 > n)
            {
                u = mid;
            }
            else
            {
                l = mid;
            }
        }
        
        return (u+l)/2;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Number \t SquareRoot");
       for (int i = 0; i <= 100; i++)
       {
           System.out.printf("%d \t %.7f\n", i, sqrt(i));
       }
    }
    
}

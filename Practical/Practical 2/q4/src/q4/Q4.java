/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q4;

/**
 *
 * @author Tan Jee Schuan
 */

class Average
{
    public static double calculateAverage(int a, int b)
    {
        return (a+b)/2;
    }
    public static double calculateAverage(int a, int b, int c)
    {
        return (a+b+c)/3;
    }
    public static double calculateAverage(double a, double b)
    {
        return (a+b)/2;
    }
    public static double calculateAverage(double a, double b, double c)
    {
        return (a+b+c)/3;
    }
}

public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 23, b = 56, c= 1;
        double p = 5.66, q = 12.75, r = 19.69;
        
        System.out.printf("%s : %.2f\n","calculateAverage method with 2 integer parameters", Average.calculateAverage(a,b));
        System.out.printf("%s : %.2f\n","calculateAverage method with 3 integer parameters", Average.calculateAverage(a,b,c));
        System.out.printf("%s  : %.2f\n","calculateAverage method with 2 double parameters", Average.calculateAverage(p,q));
        System.out.printf("%s  : %.2f\n","calculateAverage method with 2 double parameters", Average.calculateAverage(p,q,r));
    }
    
}

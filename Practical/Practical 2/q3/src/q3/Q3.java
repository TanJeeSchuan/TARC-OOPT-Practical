/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q3;

/**
 *
 * @author Tan Jee Schuan
 */

class UnitConverter {
    public static double inchToCentimeter(double in)
    {
        return in * 2.54;
    }
    public static double centimeterToInch(double cm)
    {
        return cm / 2.54;
    }
}

public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Inches\t\tCentimeters\t\tCentimeters\tInches\n");
        
        for (double i = 1.0; i <=10; i++)
        {
            System.out.printf("%.1f\t\t%.2f\t\t\t%.1f\t\t%.2f\n", i,UnitConverter.inchToCentimeter(i), i * 5,UnitConverter.centimeterToInch(i*5));
        }
    }
    
}

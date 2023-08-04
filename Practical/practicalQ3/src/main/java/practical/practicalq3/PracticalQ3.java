/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practical.practicalq3;

import java.util.Scanner;

/**
 *
 * @author Tan Jee Schuan
 */
public class PracticalQ3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Credit Card Number: ");
        
        int cardNo = sc.nextInt(); //12345678
        
        int sum1 = 0;
        int sum2 = 0;
        int temp1 = cardNo;
        int temp2 = cardNo / 10;
        
        for (int i = 0; i < 8; i += 2)
        {
            int lastDigit = temp1 % 10; //8
            sum1 += lastDigit;
            temp1 /= 100; //123456
        }
        
        for (int i = 0; i < 8; i += 2)
        {
            int lastDigit = temp2 % 10;
            int x = lastDigit*2;
            int a = x%10;
            int b = x / 10;
            
            sum2 += a;
            sum2 += b;
            
            temp2 /= 100; //12345
        }
        
        int result = sum1 + sum2;
        
        if (result % 10 == 0)
        {
            System.out.println("The credit card is valid");
        }
        else
        {
            System.out.println("The credit card is not valid ");
            System.out.println("The last digit should be " + (cardNo - result)%10 + ". ");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6q1;

/**
 *
 * @author Tan Jee Schuan
 */
public class CurrentAccount extends Account
{
    private static int freeTransaction = 3;
    final static double fee = 5.00;
    
    CurrentAccount(double balance)
    {
        super(balance);
    }
    
    public void withdrawal(double withdrawalAmount)
    {
        if (freeTransaction > 0)
        {
            withdrawal(withdrawalAmount);
            freeTransaction--;
        }
        
        else
        {
            withdrawal(withdrawalAmount + fee);
        }
    }
}
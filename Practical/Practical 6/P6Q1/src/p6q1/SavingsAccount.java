/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6q1;

/**
 *
 * @author Tan Jee Schuan
 */
public class SavingsAccount extends Account
{
    SavingsAccount(double balance)
    {
        super(balance);
    }
    
    public double calculateInterest(double interestRate)
    {
        double interestAmount = this.getBalance() * interestRate;
        return interestAmount;
    }
    
    public void addInterest(double interestAmount)
    {
        this.deposit(interestAmount);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6q1;

import java.util.Date;

/**
 *
 * @author Tan Jee Schuan
 */
public class Account {
    private static int currentAccountNumber = 0;
    private int accountNumber;
    private double balance;
    private Date date;
    
    Account(double balance)
    {
        this.accountNumber = currentAccountNumber;
        this.balance = balance;
        this.date = new Date();
        
        currentAccountNumber++;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDate() {
        return date;
    }
    
    public void deposit(double depositamount)
    {
        this.balance += depositamount;
    }
    public void withdrawal(double withdrawalamount)
    {
        this.balance -= withdrawalamount;
    }
}





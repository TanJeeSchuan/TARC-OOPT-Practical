/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p6q1;
import java.util.Scanner;

/**
 *
 * @author Tan Jee Schuan
 */
public class P6Q1 {

    
    public static void test(String[] args) {
        SavingsAccount sa = new SavingsAccount(0);
        CurrentAccount ca = new CurrentAccount(500);

        //CurrentAccount ca = new CurrentAccount(0);
        
        
        System.out.println("Default Savings Account Balance: " + sa.getBalance());
        
        sa.deposit(500.00);
        System.out.println("Savings Account Balance After Deposit: "+ sa.getBalance());
        
        sa.withdrawal(200.00);
        System.out.println("Savings Account Balance After Withdrawal: "+ sa.getBalance());
        
        double interestAmount = sa.calculateInterest(0.04);
        System.out.println("Savings Interest Amount: " + interestAmount);
        
        sa.addInterest(interestAmount);
        System.out.println("Savings Account Balance After Interest: "+ sa.getBalance());
        
        
        
        
        
        System.out.println("\n\nDefault Current Account Balance: " + ca.getBalance());
        
        ca.deposit(500.00);
        System.out.println("Current Account Balance After Deposit: "+ ca.getBalance());
        
        ca.withdrawal(200.00);
        System.out.println("Current Account Balance After Withdrawal: "+ ca.getBalance());
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        SavingsAccount sa = new SavingsAccount(0);
        CurrentAccount ca = new CurrentAccount(500);
        int selection = 4;
        do {
            System.out.println("\n1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Quit");
            System.out.print("Enter choice> ");
            selection = sc.nextInt();

            switch (selection) {

                case 1:
                    System.out.println("\nWITHDRAWAL");
                    System.out.println("----------");
                    System.out.printf("Current balance: RM%.2f\n", ca.getBalance());
                    System.out.print("Enter amount: RM");
                    double amount = sc.nextDouble();
                    if (ca.withdraw(amount)) {
                        //c.addTransactionCount();
                        if (ca.getTransactionCount() > CurrentAccount.getFreeTransaction()) {
                            ca.addTransactionFee();
                        }
                        System.out.printf("Updated balance: RM%.2f\n", ca.getBalance());
                    } else {
                        System.out.println("Transaction failed: Insufficient balance.");
                    }
                    break;

                case 2:
                    System.out.println("\nDEPOSIT");
                    System.out.println("-------");
                    System.out.printf("Current balance: RM%.2f\n", ca.getBalance());
                    System.out.print("Enter amount: RM");
                    amount = sc.nextDouble();
                    c.deposit(amount);
                    //c.addTransactionCount();
                    if (c.getTransactionCount() > CurrentAccount.getFreeTransaction()) {
                        c.addTransactionFee();
                    }
                    System.out.printf("Updated balance: RM%.2f\n", ca.getBalance());
                    break;

                case 3:
                    System.out.printf("Current balance: RM%.2f\n", ca.getBalance());
                    break;

                default:
                    System.out.println("\n\nTerminating program...");
            }
        } while (selection >= 1 && selection <= 3);
    }
}

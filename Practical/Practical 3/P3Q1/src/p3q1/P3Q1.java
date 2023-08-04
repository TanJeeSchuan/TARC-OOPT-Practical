/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3q1;

import java.util.Scanner;

/**
 *
 * @author Tan Jee Schuan
 */
public class P3Q1 {
    
    public static void main(String[] args) {
       double avg = 0;
       int sum = 0;
       int largerCount = 0;
       int smallerCount = 0;
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter number of quiz scores to process: ");
       int numQuiz = sc.nextInt();
       System.out.print("\n");
       
       int[] scoreArr = new int[numQuiz];
       
       for (int i = 0 ; i < scoreArr.length; i++)
       {
           System.out.print("Score " + (i+1) + ": ");
           scoreArr[i] = sc.nextInt();
           
           sum += scoreArr[i];
       }
       
       avg = (double)sum/numQuiz;
       
       
       for (int i = 0; i < scoreArr.length; i++)
       {
           if (scoreArr[i] >= avg)
               largerCount++;
           else if(scoreArr[i] < avg)
               smallerCount++;
       }
       
       System.out.print("Results\n=======\nAverage is " + avg + "\nNumber of scores above or equal to the average is " + largerCount + "\nNumber of scores below the average is " + smallerCount + "\n");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial;
import java.lang.math;

/**
 *
 * @author Tan Jee Schuan
 */
class exam
{
    public static int randomTestScores()
    {
        return Math.round(Math.random()*100);
    }

Public static double std_dev(int sum, int sum2, int n)
{
	Return Math.sqrt(sumSquare – (1/count * Math.pow(sum,2)/ (count - 1)));
}

Public static void main(String[] args)
{
	Int sum = 0;
	Int sum2 = 0;
	Int count = 0;
	
	For (int I = 0; I < 20; I++)
	{
		Sum += randomTestScores;
		Sum2 += randomTestScores * randomTestScores;
		Count++;
}

System.out.println(“Average: ” + sum/count);
System.out.println(“SD: ” + std_dev(sum,sum2,count));
}
}


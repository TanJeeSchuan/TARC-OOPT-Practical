/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p3q2;

/**
 *
 * @author Tan Jee Schuan
 */
public class P3Q2 {

    
    public static void main(String[] args) {
        int[] list = {1,2,4,5,10,100,2,-22};
        
        System.out.println(returnIndexOfSmallestInt(list));
    }
    
    static int returnIndexOfSmallestInt(int[] inputArr)
    {
        int smallestIndex = 0;
        for (int i = 0; i < inputArr.length ; i++)
        {
            if (inputArr[smallestIndex] > inputArr[i])
            {
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
}

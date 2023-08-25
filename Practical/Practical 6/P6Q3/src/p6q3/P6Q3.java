/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p6q3;

/**
 *
 * @author Tan Jee Schuan
 */
public class P6Q3 {
    public static void main(String[] args) {
        Employee[] empArray = {new Employee("Tan Test Name",2003,4000.00),
                               new CommissionEmployee("Yeoh Ming Zhe", 2010, 3500.00, 2000.00,0.2),
                               new Clerk("Yap Test Name",2018,2500,500,8)};
        
        printElements(empArray);
        
        for (Employee e:empArray)
        {
            for (Employee e2:empArray)
            {
                System.out.println("" +e.equals(e2));
            }
            System.out.println("\n");
        }
    }
    
    static void printElements(Employee[] arr){
        for (Employee e:arr)
        {
            System.out.println(e.toString());
        }
    }

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4q1;

/**
 *
 * @author Tan Jee Schuan
 */

public class P4Q1 {
    public static void main(String[] args) {
            //Employee e = new Employee("Tan Test Name", 3000.00);
            
            //System.out.println("Before raise: "+ e.getSalary());
            
            //e.raiseSalary(8);
            
            //System.out.println("After raise: "+ e.getSalary());
            
            Employee e1 = new Employee("Tan Test Name", 3000.00);
            Employee e2 = new Employee("Lee Test Name", 2000.0);
            
            if (e1.getSalary() > e2.getSalary())
                System.out.println("Name:" + e1.getName()+ "\nSalary: "+ e1.getSalary());
            
            else
                System.out.println("Name:" + e2.getName()+ "\nSalary: "+ e2.getSalary());
            
            System.out.printf("%s %.2f","Total salary: ", e1.getSalary()+e2.getSalary());

    }
    
}

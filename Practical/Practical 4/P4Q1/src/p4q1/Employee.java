/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4q1;

/**
 *
 * @author Tan Jee Schuan
 */
public class Employee
{ 
    private String name;
    private double salary;
    
    public Employee(String employeeName, double currentSalary) 
    { 
       name = employeeName;
       salary = currentSalary;
    }
    
    public Employee()
    {
        this.name = "";
        this.salary = 0.0;
    }
    
    public Employee(String name)
    {
        this.name = name;
        this.salary = 0.0;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void raiseSalary(double percent)
    {
        salary = salary + (salary * percent / 100.0);
    }
}

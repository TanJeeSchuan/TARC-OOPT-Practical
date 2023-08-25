package p6q3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tan Jee Schuan
 */
public class Employee {
    private String name;
    private int yearJoined;
    private double basicSalary;
    
    Employee(String name, int yearJoined, double basicSalary)
    {
        this.name = name;
        this.yearJoined = yearJoined;
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }
    
    public String toString() {
        String str = this.name + " " + this.yearJoined + " " + this.basicSalary;
        return str;
    }
    
    public double calculateSalary(){
        return basicSalary;
    }

    @Override
    public boolean equals(Object obj)
    {
        Employee e = (Employee) obj;
        return this.name.equals(e.getName());
    }
}

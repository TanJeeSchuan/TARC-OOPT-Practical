/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6q3;

/**
 *
 * @author Tan Jee Schuan
 */
public class CommissionEmployee extends Employee{
    private double grossSale;
    private double commissonRate;
    
    public CommissionEmployee(String name, int yearJoined, double basicSalary, double grossSale, double commissonRate) {
        super(name, yearJoined, basicSalary);   //call constructor of superclass
        this.grossSale = grossSale;
        this.commissonRate = commissonRate;
    }

    public double getCommissonRate() {
        return commissonRate;
    }

    public void setCommissonRate(double commissonRate) {
        this.commissonRate = commissonRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }
    
    public String toString() {
        String str = super.toString() + " " + commissonRate + " " + grossSale;
        return str;
    }
    
    public double calculateSalary()
    {
        double s = super.getBasicSalary() + grossSale * commissonRate;
        return s;
    }
}

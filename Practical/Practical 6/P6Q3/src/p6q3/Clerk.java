/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p6q3;

/**
 *
 * @author Tan Jee Schuan
 */
public class Clerk extends Employee{
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate;

    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    
    public String toString(){
        String str = super.toString() + " " + this.allowance + " " + this.overtimeHours + " " + this.overtimeRate;
        return str;
    }
    
    public double calculateSalary(){
        double overtimePay = this.overtimeHours * Clerk.overtimeRate;
        double s = super.getBasicSalary() + this.allowance + overtimePay;
        return s;
    }
}

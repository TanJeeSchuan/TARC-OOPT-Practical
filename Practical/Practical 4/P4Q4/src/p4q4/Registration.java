/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4q4;

/**
 *
 * @author Tan Jee Schuan
 */
public class Registration {
    private int regNo;
    private Owner owner;
    private Car car;
    private static int nextRegNo = 1001;
    
    public Registration(Owner owner, Car car)
    {
        regNo = nextRegNo++;
        this.owner = owner;
        this.car = car;
    }
    
    public static int getNextRegNo(){
        return nextRegNo;
    }
    
    public String toString()
    {
        return String.format("%-6s %-25s %-35s", regNo, owner, car);
    }
}

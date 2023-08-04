/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4q4;

/**
 *
 * @author Tan Jee Schuan
 */
public class CarType {
    private String make;
    private String model;
    private double capacity;
    
    public CarType(String make, String model, double capacity)
    {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }
    
    public String toString()
    {
        return String.format("%-10s %-10s %-3.1f",make,model,capacity);
    }
}

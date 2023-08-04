/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4q4;

/**
 *
 * @author Tan Jee Schuan
 */
public class Car {
    private String plateNo;
    private String color;
    private int year;
    private CarType carType;
    
    public Car(String plateNo, String color, int year, CarType carType)
    {
        this.plateNo = plateNo;
        this.color = color;
        this.year = year;
        this.carType = carType;
    }
    
    public String toString()
    {
        return String.format("%-10s %-7s %-5s %-15s", plateNo, color, year, carType);
    }
}

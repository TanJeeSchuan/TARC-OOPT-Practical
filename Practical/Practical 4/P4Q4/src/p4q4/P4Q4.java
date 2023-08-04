/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4q4;

/**
 *
 * @author Tan Jee Schuan
 */
import java.util.Scanner;
public class P4Q4 {
    public static void main(String[] args)
    {
        CarType[] carType = {new CarType("Toyota","Vios",1.5),
                             new CarType("Nissan","Teana",2.0),
                             new CarType("Honda","City",1.6)};
        
        Registration[] register = new Registration[6];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < register.length; i++)
        {
            System.out.println("Registeration No. : " + Registration.getNextRegNo());
            
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("IC No:");
            String ic = sc.nextLine();
            
            System.out.print("Enter car plate no.: ");
            String carPlate = sc.next();
            System.out.print("Enter Color: ");
            String color = sc.next();
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            
            //memu of car type
            for(int j = 0; j < carType.length; j++)
            {
                System.out.println((j+1) + ". " + carType[j].toString());
            }
            
            System.out.print("Enter choice(1-3): ");
            int choice = sc.nextInt();
            
            Owner owner = new Owner(name, ic);
            Car car = new Car(carPlate, color, year, carType[choice - 1]);
            
            register[i] = new Registration(owner, car);
            sc.nextLine();
        }
        
        System.out.printf("\n%s50\n", "Car Registration List");
        System.out.println("Reg No Name            IC No.     Plate No.  Color   Year  Make       Model      Capacity");
        for (Registration entry : register)
        {
            System.out.println(entry.toString());
        }
    }
    
}

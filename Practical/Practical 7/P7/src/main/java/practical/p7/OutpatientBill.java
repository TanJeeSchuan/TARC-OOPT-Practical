/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical.p7;

/**
 *
 * @author Tan Jee Schuan
 */
public class OutpatientBill extends PatientBill { //inheritance
    
    private static double registrationFee = 30.00;
    private double consultationFee;
    
    OutpatientBill(String name, double consultationFee)
    {
        super(name);
        this.consultationFee = consultationFee;
    }
    
    public double calTotalCharges()
    {
        return OutpatientBill.registrationFee + this.consultationFee;
    }

    @Override
    public String toString() {
        return super.toString() + "\nConsultation Fee: " + consultationFee;
    }
    
  
}

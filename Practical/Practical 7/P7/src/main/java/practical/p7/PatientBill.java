/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practical.p7;

/**
 *
 * @author Tan Jee Schuan
 */
abstract public class PatientBill { //abstract
    
    protected int visitId;
    protected String name;
    private static int incrementNo=1;
    public abstract double calTotalCharges();
    
    public PatientBill (String name)
    {
        this.visitId = incrementNo;
        this.name = name;
        incrementNo++;
    }

    @Override
    public String toString() {
        return "\nvisitId=" + visitId + ", name=" + name;
    }
    
    public int compareTo(Object obj)
    {
        PatientBill otherBill = (PatientBill) obj;
        return this.name.compareTo(otherBill.name);
    }
}

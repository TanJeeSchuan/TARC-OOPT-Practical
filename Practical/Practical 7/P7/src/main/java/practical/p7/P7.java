/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practical.p7;

/**
 *
 * @author Tan Jee Schuan
 */
public class P7 {

    public static void main(String[] args) {

        PatientBill[] bills = new PatientBill[4];
        bills[0] = new OutpatientBill("Ali",30.0);
        bills[1] = new OutpatientBill("May",50.0);
        bills[2] = new InpatientBill("Tan Test Name", 20.0,10.0,'S',3);
        bills[3] = new InpatientBill("Rome", 40.0, 20.0, 'P', 1);
        
        selectionSort(bills);
        
        for (PatientBill p: bills)
        {
            System.out.println(p.toString());
            System.out.println("Total charges: "+p.calTotalCharges());
        }
        
        System.out.println("\n\nTotal charges: " + computeTotalCollection(bills));
    }
    
    public static double computeTotalCollection(PatientBill[] bills)
    {
        double total = 0.0;
        for (PatientBill p: bills)
        {
            total += p.calTotalCharges();
        }
        
        return total;
    }
    
    public static PatientBill[] selectionSort(PatientBill[] arr) 
    {
            for (int i = 0; i < arr.length; ++i) {
                    int indexOfSmallest = i;	// assign the first index of the subarray as the initial indexOfSmallest
                    for (int j = i+1; j < arr.length; ++j) {
                            if (arr[j].compareTo(arr[indexOfSmallest]) < 0) // if the current array element is smaller than the
                                    indexOfSmallest = j;														// element at indexOfSmallest, update indexOfSmallest
                    }
                    // swap the element at indexOfSmallest with the current subarray's first element 																									
                    PatientBill tempArr = arr[indexOfSmallest];
                    arr[indexOfSmallest] = arr[i];
                    arr[i] = tempArr;
            }
            return arr;
    }
}


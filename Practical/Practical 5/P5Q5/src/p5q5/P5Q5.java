/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p5q5;

/**
 *
 * @author Tan Jee Schuan
 */
public class P5Q5 {
    public static void main(String[] args)
    {
        Student s1 = new Student("A12345","Tan Jee Schuan", "FASC");
        
        System.out.println(validateStudentID(s1));
    }
    
    public static boolean validateStudentID(Student student)
    {
        String id = student.getStudentID();
        
        char schoolCode = id.charAt(0);
        
        if (id.length() != 6)
            return false;
        
        //if 2nd character onwards is not digit return false
        for (int i = 1; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i)))
                return false;
        }
        
        //validate school
        if (schoolCode == 'A')
        {
            return student.getSchool().equals("FASC");
        }
        else if (schoolCode == 'B')
        {
            return student.getSchool().equals("FAFB");
        }
        
        return false;
    }
}

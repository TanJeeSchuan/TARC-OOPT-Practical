/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4q5;

/**
 *
 * @author Tan Jee Schuan
 */
public class Course
{

    /**
     * @return the noOfStudent
     */

    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudent = 0;
    private String[] studentNames = new String[100];
    private static int courseCount;
    
    public Course(String courseTitle ,double feesPerStudent)
    {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        
        courseCount++;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }
    
    public String getStudentNames(int index)
    {
        return studentNames[index];
    }
    
    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }
    
    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }
    
    public double calcFeeCollected()
    {
        return feesPerStudent * getNoOfStudent();
    }
    
    public void addStudent(String studName)
    {
        studentNames[getNoOfStudent()] = studName;
        noOfStudent++;
    }
    
    
    public String toString(){
        return String.format("Course Title: %s \n" +
                                "Fees per Student: %.2f \n" + 
                                "No. of student: %d\n",courseTitle, feesPerStudent, getNoOfStudent());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4q2;

/**
 *
 * @author Tan Jee Schuan
 */
public class P4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student.setContribution(0.2);
        
        Student s1 = new Student();
        Student s2 = new Student("ABC10160", "Tan Test Name");
        
        s2.addQuiz(5);
        s2.addQuiz(5);
        s2.addQuiz(10);
        s2.addQuiz(7);
        
        System.out.printf(" Student ID: %s \n Name: %s \n Quiz Num: %d \n Total Score: %d \n Average Score: %.2f\n Quiz mark obtained by student: %.2f\n\n", 
                s1.getStudentID(), s1.getStudentName(), s1.getQuizNum(),s1.getTotalScore(), s1.getAverageScore(), (s1.getAverageScore()/10.0 * Student.getContribution()) * 100);
        System.out.printf(" Student ID: %s \n Name: %s \n Quiz Num: %d \n Total Score: %d \n Average Score: %.2f\n Quiz mark obtained by student: %.2f\n\n", 
                s2.getStudentID(), s2.getStudentName(), s2.getQuizNum(),s2.getTotalScore(), s2.getAverageScore(), (s2.getAverageScore()/10.0 * Student.getContribution()) * 100);
    }
    
}

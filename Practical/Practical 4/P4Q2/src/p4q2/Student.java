/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p4q2;

/**
 *
 * @author Tan Jee Schuan
 */
public class Student {
    private String studentID;
    private String studentName;
    private int quizNum;
    private int totalScore;
    
    private static double contribution;
    
    public Student()
    {
        this("","");
    }
    
    public Student(String studentID, String studentName)
    {
        this.studentID = studentID;
        this.studentName = studentName;
        this.quizNum = 0;
        this.totalScore = 0;
    }
    
    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }
    
    public String getStudentID()
    {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getQuizNum() {
        return quizNum;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void addQuiz(int quizScore){
        this.totalScore += quizScore;
        quizNum++;
    }
    
    public double getAverageScore()
    {
        return totalScore/(Double.valueOf(quizNum));
    }
    
    public static void setContribution(double contribution)
    {
        Student.contribution = contribution;
    }
    
    public static double getContribution()
    {
        return Student.contribution;
    }
}

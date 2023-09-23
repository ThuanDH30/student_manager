/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Bravo
 */
public class Student {
    private String ID;
    private String Student_Name;
    private String Semester;
    private ArrayList<String> Course_Name;

    public Student() {
    }

    public Student(String ID, String Student_Name, String Semester, ArrayList<String> Course_Name) {
        this.ID = ID;
        this.Student_Name = Student_Name;
        this.Semester = Semester;
        this.Course_Name = Course_Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String Student_Name) {
        this.Student_Name = Student_Name;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public ArrayList<String> getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(ArrayList<String> Course_Name) {
        this.Course_Name = Course_Name;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", Student_Name=" + Student_Name + ", Semester=" + Semester + ", Course_Name=" + Course_Name + '}';
    }
    

}
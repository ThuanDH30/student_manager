/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.Student;
import view.Menu;

/**
 *
 * @author Bravo
 */
public class Student_Managerment {

    private List<Student> studentList;
    private Scanner sc = new Scanner(System.in);

    public Student_Managerment() {
        this.studentList = new ArrayList<>();
    }

    public void CreateStudent() {
        String choice;
        do {
            System.out.println("Enter student ID: ");
            String ID = sc.nextLine();
            System.out.println("Enter student Name: ");
            String Name = sc.nextLine();
            System.out.println("Enter Semester: ");
            String semester = sc.nextLine();
            String[] course = {"java "," .Net"," C/C++"};
            for(int i=0;i<course.length;i++){
                System.out.println(i + 1+ course[i]);
            }
            int choi =Integer.parseInt(sc.nextLine());
            ArrayList<String> courseName=new ArrayList<>();
            courseName.add(course[choi-1]);
            System.out.println("Enter the next course,Enter 0 to Skip: ");
            int cc=Integer.parseInt(sc.nextLine());
            if(cc!=0){
              courseName.add(course[cc-1]);
            }
            Student addSt = new Student(ID, Name, semester, courseName);
            studentList.add(addSt);
            System.out.println("you want add student more(Y/N)?");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
        if (choice == "N") {
            System.out.println("add student sucessfull!");
        }
    }

    public void SearchStudent(String name) {
        List<Student> SearchInF = new ArrayList<>();
        for (Student S : studentList) {
            if (S.getStudent_Name().equalsIgnoreCase(name)) {
                SearchInF.add(S);
            }
        }
        if (SearchInF.isEmpty()) {
            System.out.println("No Information!");
        } else {
            System.out.println("Students:");
            for (Student a : SearchInF) {
                System.out.println(a);
            }
        }
    }

    public void SortStudent() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getStudent_Name().compareTo(o1.getStudent_Name());
            }
        });
        System.out.println("Student List Sorted!!!");
        for (Student sorted : studentList) {
            System.out.println(sorted);
        }
    }

    public void updateStudent(String ID) {
    Student updateStudent = null;
    for (Student update : studentList) {
        if (update.getID().equalsIgnoreCase(ID)) {
            updateStudent = update;
            break;
        }
    }
    if (updateStudent != null) {
        System.out.println("Enter New Semester: ");
        String new_semester = sc.nextLine();
        updateStudent.setSemester(new_semester);
        
        // Menu for selecting a new course
        String[] courseOptions = {"Java", ".Net", "C/C++"};
        System.out.println("Select a new Course (Enter 1 for Java, 2 for .Net, 3 for C/C++): ");
        int choice = Integer.parseInt(sc.nextLine());
        
        if (choice >= 1 && choice <= courseOptions.length) {
            String newCourse = courseOptions[choice - 1];
            updateStudent.getCourse_Name().clear();
            updateStudent.getCourse_Name().add(newCourse);
            System.out.println("Updated Successfully");
        } else {
            System.out.println("Invalid choice. Course not updated.");
        }
    } else {
        System.out.println("Cannot Update! Student not found.");
    }
}



    public void deleteStudent(String ID) {
        Student rm = null;
        for (Student st : studentList) {
            if (st.getID().equalsIgnoreCase(ID)) {
                rm = st;
                break;
            }
        }
        if (rm != null) {
            studentList.remove(rm);
            System.out.println("Remove Succsessfully!!!");
        } else {
            System.out.println("Can't not removed!!!");
        }
    }
    public void reportStudent() {
    for (Student rp : studentList) {
        System.out.println("Name: " + rp.getStudent_Name() + ", Semester: " + rp.getCourse_Name());
    }
}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Student_Managerment;
import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class main {

    public static void main(String[] args) {
        Student_Managerment view = new Student_Managerment();
        Scanner sc = new Scanner(System.in);
        String[] options = {"Create", "Find and Sort", "Update/Delete", "Report", "Exit"};
        Menu menu = new Menu("Student Managerment", options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        view.CreateStudent();
                        break;
                    case 2:
                        System.out.println("Enter Name Search : ");
                        String name = sc.nextLine();
                        view.SearchStudent(name);
                        view.SortStudent();
                        break;
                    case 3:
                        System.out.println("Enter ID update : ");
                        String id = sc.nextLine();
                        view.updateStudent(id);
                        view.SortStudent();
                        break;
                    case 4:
                        view.reportStudent();
                        break;
                    case 5:
                        System.out.println("Exit");
                        break;
                }
            }
        };
        menu.run();
    }
}

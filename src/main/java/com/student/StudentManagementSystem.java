package com.student;

import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();
        students.add(new Student(id, name, department, cgpa));
        System.out.println("Student added successfully!");
    }
     public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        System.out.println("\nStudent List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void searchStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student Found:");
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void deleteStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        boolean removed = students.removeIf(
                student -> student.getId() == id
        );
        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
    public static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new department: ");
                String department = scanner.nextLine();
                System.out.print("Enter new CGPA: ");
                double cgpa = scanner.nextDouble();
                student.setName(name);
                student.setDepartment(department);
                student.setCgpa(cgpa);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n================================");
            System.out.println("    STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                	updateStudent();
                	break;
                case 6:
                    System.out.println("Exiting application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
package com.skillnext;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n====== STUDENT MENU ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        sc.nextLine(); // clear buffer
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();

                        Student s = new Student(name, email, marks);
                        dao.addStudent(s);
                        break;

                    case 2:
                        List<Student> list = dao.getAllStudents();
                        System.out.println("\nID | NAME | EMAIL | MARKS");
                        System.out.println("--------------------------------");
                        for (Student st : list) {
                            System.out.println(st);
                        }
                        break;

                    case 3:
                        System.out.print("Enter Student ID to delete: ");
                        int id = sc.nextInt();
                        dao.deleteStudent(id);
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
//java -cp target/student_jdbc-1.0-SNAPSHOT.jar;C:\Users\Meghana\.m2\repository\com\mysql\mysql-connector-j\8.2.0\mysql-connector-j-8.2.0.jar com.skillnext.App --to run
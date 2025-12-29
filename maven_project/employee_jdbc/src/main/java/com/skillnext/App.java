package com.skillnext;

import java.util.List;

public class App {
    public static void main(String[] args) {

        try {
            EmployeeDAO dao = new EmployeeDAO();

            // Add employee
            Employee e1 = new Employee("John Doe", "john@example.com", 50000);
            dao.addEmployee(e1);
            System.out.println("Employee Added Successfully!");

            // Fetch employees
            List<Employee> employees = dao.getAllEmployees();
            for (Employee e : employees) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//java -cp target/employee_jdbc-1.0-SNAPSHOT.jar;C:\Users\Meghana\.m2\repository\com\mysql\mysql-connector-j\8.2.0\mysql-connector-j-8.2.0.jar com.skillnext.App ---to run
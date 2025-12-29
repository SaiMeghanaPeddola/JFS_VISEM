package com.skillnext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private static final String URL =
        "jdbc:mysql://localhost:3306/skillnext_db";
    private static final String USER = "root";
    private static final String PASS = "root";

    // INSERT
    public void addStudent(Student s) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASS);
        String sql = "INSERT INTO student(name,email,marks) VALUES(?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, s.getName());
        ps.setString(2, s.getEmail());
        ps.setDouble(3, s.getMarks());

        ps.executeUpdate();
        con.close();

        System.out.println("Student Added Successfully");
    }

    // VIEW ALL
    public List<Student> getAllStudents() throws Exception {

        List<Student> list = new ArrayList<>();
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setMarks(rs.getDouble("marks"));
            list.add(s);
        }

        con.close();
        return list;
    }

    // DELETE
    public void deleteStudent(int id) throws Exception {

        Connection con = DriverManager.getConnection(URL, USER, PASS);
        String sql = "DELETE FROM student WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        int rows = ps.executeUpdate();
        con.close();

        if (rows > 0)
            System.out.println("Student Deleted Successfully");
        else
            System.out.println("Student Not Found");
    }
}

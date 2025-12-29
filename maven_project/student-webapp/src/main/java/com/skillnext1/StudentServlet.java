package com.skillnext1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        double marks = Double.parseDouble(req.getParameter("marks"));

        Student stu = new Student();
        stu.setName(name);
        stu.setEmail(email);
        stu.setMarks(marks);

        StudentDAO.save(stu);

        res.sendRedirect("success.jsp");
    }
}

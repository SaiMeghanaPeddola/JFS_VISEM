package com.skillnext;

public class Student {

    private int id;
    private String name;
    private String email;
    private double marks;

    public Student() {}

    public Student(String name, String email, double marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public double getMarks() { return marks; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + email + " | " + marks;
    }
}

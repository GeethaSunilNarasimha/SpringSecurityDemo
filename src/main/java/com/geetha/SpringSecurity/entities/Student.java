package com.geetha.SpringSecurity.entities;

public class Student {

    int sid;
    String studentName;
    String course;
    int marks;

    public Student(int sid, String studentName, String course, int marks) {
        this.sid = sid;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}

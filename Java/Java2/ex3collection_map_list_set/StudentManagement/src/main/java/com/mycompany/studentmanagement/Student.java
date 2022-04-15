/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

/**
 *
 * @author Phuong
 */
public class Student {
    private String studentID, name, major;
    private float mark;

    public Student() {
    }

    public Student(String studentID, String name, String major, float mark) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.mark = mark;
    }
    public String getCapacity(){
        if(mark > 9)
            return "Exelent";
        return "Good";
    }
    public boolean isBonus(){
        return mark >= 7.5;
    }
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swing;

import java.io.Serializable;

/**
 *
 * @author Phuong
 */
public class Student implements Serializable{
    private String StudentID;
    private String name;
 public Student() {
    }

    public Student(String StudentID, String name) {
        this.StudentID = StudentID;
        this.name = name;
    }
    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    
}

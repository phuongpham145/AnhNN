/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_assignment;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Phuong
 */
public class Validator {

    public static boolean checkEmpty(JTextField field, StringBuilder sb, String msg) {
        boolean ok = true;
        if (field.getText().equals("")) {
            sb.append(msg).append("\n");
            field.setBackground(Color.red);
            ok = false;
        } else {
            field.setBackground(Color.WHITE);
        }
        return ok;
    }
    public static  boolean checkAge(JTextField field, StringBuilder sb){
        boolean ok = true;
        if(!checkEmpty(field, sb, "Tuoi chua nhap\n")){
            return false;
        }
        try {
            int age = Integer.parseInt(field.getText());
            if(age < 18 || age > 55){
                sb.append("Tuoi khong hop le\n");
                field.setBackground(Color.red);
                ok = false;
            }
        } catch (Exception e) {
            sb.append("Tuoi phai la gia tri so\n");
            field.setBackground(Color.red);
            ok = false;
        }
        if(ok){
            field.setBackground(Color.white);
        }
        return  ok;
    }
    public static  boolean checkSalary(JTextField field, StringBuilder sb){
        boolean ok = true;
        if(!checkEmpty(field, sb, "Luong chua nhap\n")){
            return false;
        }
        try {
            double salary = Double.parseDouble(field.getText());
            if(salary < 5000000){
                sb.append("Luong khong hop le\n");
                field.setBackground(Color.red);
                ok = false;
            }
        } catch (Exception e) {
            sb.append("Luong phai la gia tri so\n");
            field.setBackground(Color.red);
            ok = false;
        }
        if(ok){
            field.setBackground(Color.white);
        }
        return  ok;
    }
    public static boolean checkEmail(JTextField field, StringBuilder sb){
        boolean ok = true;
        if(!checkEmpty(field, sb, "Email chua nhap")){
            return false;
        }
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(field.getText());
        if(!matcher.find()){
            sb.append("Email khong hop le");
            field.setBackground(Color.red);
            ok = false;
        }
        if(ok){
            field.setBackground(Color.white);
        }
        return ok;
    }
}

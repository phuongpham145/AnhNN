/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee_assignment;

import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Phuong
 */
public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<>();
    private String path = "D:\\AnhNN\\Java\\Java2\\ex6Multithreading\\EmployeeList.dat";
    public void saveToFile() throws Exception
    {
        XFile.writeObject(path, list);
    }
    public void loadFromFile() throws Exception {
        File file = new File(path);
        if(file.exists()){
        list = (ArrayList<Employee>) XFile.readObject(path);
        } else{
            initEmployeeData();
        }
    }
    private void initEmployeeData(){
        list.add(new Employee("E01", "Minh", "minh@gmail.com", 500, 20));
        list.add(new Employee("E02", "Phuong", "phuog@gmail.com", 1000, 22));
    }
    private int currentIndex = 0;
    public String getCurrentEmployeeInfo(){
        return "Record " + (currentIndex + 1) + " of " + list.size();
    }
    public void setCurrentEmployee(Employee employee){
        currentIndex = list.indexOf(employee);
    }
    public void first(){
        if(currentIndex > 0){
            currentIndex = 0;
        }
    }
    public void previous(){
        if(currentIndex > 0){
            currentIndex--;
        }
    }
    public void next(){
        if(currentIndex < list.size() - 1){
            currentIndex++;
        }
    }
    public void last(){
        currentIndex = list.size() - 1;
    }
    public int getCurrentEmployeeIndex(){
        return currentIndex;
    }
    public Employee getCurrentEmployee(){
        if(list.size()==0){
            return null;
        }
        return list.get(currentIndex);
    }
    public void add(Employee emp){
        list.add(emp);
    }
    public boolean update(Employee emp){
        Employee existedEmployee = findById(emp.getEmployeeId());
        boolean flag = false;
        if(existedEmployee != null){
            existedEmployee.setName(emp.getName());
            existedEmployee.setAge(emp.getAge());
            existedEmployee.setEmail(emp.getEmail());
            existedEmployee.setSalary(emp.getSalary());
            flag = true;
        }
        return flag;
    }
    public void renderToTable(DefaultTableModel tblModel){
        tblModel.setRowCount(0);
        for(Employee employee : list){
            Object[] row = new Object[]{
                employee.getEmployeeId(),
                employee.getName(),
                employee.getAge(),
                employee.getEmail(),
                employee.getSalary()
            };
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
        
    }
    public Employee findById(String employeeId){
        for(Employee employee : list){
            if(employee.getEmployeeId().equals(employeeId)){
                return employee;
            }
        }
        return null;
    }
    public boolean deleteById(String employeeId){
        for(Employee employee : list){
            if(employee.getEmployeeId().equals(employeeId)){
                list.remove(employee);
                return true;
            }
        }
        return false;
    }
}


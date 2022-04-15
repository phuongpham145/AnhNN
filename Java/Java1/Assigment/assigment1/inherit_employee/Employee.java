package inherit_employee;

import java.util.Scanner;

public abstract class Employee {
    String employeeCode, name, type;
    Double income;
    public abstract Double getSumIncome();
    public Employee() {

    }
    public Employee(String employeeCode, String name, Double income, String type) {
     this.employeeCode = employeeCode;
     this.name = name;
     this.income = income;
     this.type = type;
    }
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getincome() {
        return income;
    }
    public void setincome(Double income) {
        this.income = income;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void AddEmployee(Scanner scanner) {
        System.out.print("Employee Code : " + employeeCode);
        this.employeeCode = scanner.nextLine();
        System.out.print("Name : ");
        this.name = scanner.nextLine();
        System.out.print("Income : ");
        this.income = scanner.nextDouble();
        scanner.nextLine();
    }
    public void ExportEmployees(){
        System.out.printf("Employee Code : %s, Name: %s - Type: %s, - Income: %s  - SumIncome: %f", employeeCode, name, type, income, getSumIncome());
    }
}

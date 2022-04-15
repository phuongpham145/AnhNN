package inherit_employee;

import java.util.Scanner;

public class EmployeeMarketing extends Employee {
    private Double sales, poundage;
    public EmployeeMarketing() {

    }
    public EmployeeMarketing(String employeeCode, String name, Double income, String type, Double sales, Double poundage) {
        super(employeeCode, name, income, "Marketing");
        this.sales = sales;
        this.poundage = poundage;
    }
    public Double getSales() {
        return sales;
    }
    public void setSales(Double sales) {
        this.sales = sales;
    }
    public Double getPoundage() {
        return poundage;
    }
    public void setPoundage(Double poundage) {
        this.poundage = poundage;
    }
    @Override
    public void AddEmployee(Scanner scanner){
        super.AddEmployee(scanner);
        System.out.print("Sales: ");
        this.sales = scanner.nextDouble();
        System.out.print("Poundage : ");
        this.poundage = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public void ExportEmployees(){
        super.ExportEmployees();
        System.out.printf(" - Sales: %f - Poundage: %f", sales, poundage);
    }
    @Override
    public Double getSumIncome() {
        return getincome() + sales + poundage / 100;
    }
}

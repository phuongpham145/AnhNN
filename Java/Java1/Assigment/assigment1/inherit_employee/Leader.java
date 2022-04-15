package inherit_employee;

import java.util.Scanner;

public class Leader extends Employee {
    private Double responsible;
    public Leader() {

    }
    public Leader(String employeeCode, String name, Double income, String type, Double responsible) {
        super(employeeCode, name, income, "Leader");
        this.responsible = responsible;
    }
    public Double getresponsible() {
        return responsible;
    }
    public void setresponsible(Double responsible) {
        this.responsible = responsible;
    }
    @Override
    public void AddEmployee(Scanner scanner){
        super.AddEmployee(scanner);
        System.out.print("Responsible : ");
        responsible = scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public void ExportEmployees(){
        super.ExportEmployees();
        System.out.printf(" - Responsible: %f", responsible);
    }
    @Override
    public Double getSumIncome() {
        return getincome() + responsible;
    }
}

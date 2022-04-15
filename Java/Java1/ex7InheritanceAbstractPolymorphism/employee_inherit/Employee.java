package employee_inherit;

public class Employee {
    protected String name;
    protected Double income;
    public Employee(String name, Double income) {
        this.name = name;
        this.income = income;
    }
    public Double IncomeTax() {
        return income * 0.1;
    }
    public void Export() {
        System.out.printf("Name : %s  - Income : %f", name, income);
    }
    public Double IncomeCalculate() {
        return income;
    }
}

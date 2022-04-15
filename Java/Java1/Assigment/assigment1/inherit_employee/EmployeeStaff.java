package inherit_employee;

public class EmployeeStaff extends Employee {
    public EmployeeStaff(){
        
    }
    public EmployeeStaff(String employeeCode, String name, Double income, String type) {
        super(employeeCode, name, income, "Adminnistrative Staff");
    }
    @Override
    public Double getSumIncome() {
        
        return getincome();
    }
    
}

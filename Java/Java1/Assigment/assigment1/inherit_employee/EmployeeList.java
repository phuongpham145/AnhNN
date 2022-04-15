package inherit_employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeList {
    private ArrayList<Employee> employees = new ArrayList<>();
    public void AddEmployee(){
        Scanner scanner = new Scanner(System.in);
        employees.clear();
        do {
            System.out.print("Enter employee type: ( Space to escape, 1. Staff, 2. Leader, 3. Maketing :");
            String type = scanner.nextLine();
            if(type == null || type.equals(""))
            break;
            int iType = Integer.parseInt(type);
            switch( iType ){
                case 1:
                EmployeeStaff employeeStaff = new EmployeeStaff();
                employeeStaff.AddEmployee(scanner);
                employees.add(employeeStaff);
                break;
                case 2:
                Leader leader = new Leader();
                leader.AddEmployee(scanner);
                employees.add(leader);
                break;
                case 3:
                EmployeeMarketing employeeMarketing = new EmployeeMarketing();
                employeeMarketing.AddEmployee(scanner);
                employees.add(employeeMarketing);
                break;
            }
        } while (true);
    }
    public void ExportEmployees(){
        System.out.println("Employee List: ");
        for(Employee employee : employees){
            if(employee instanceof EmployeeStaff){
                ((EmployeeStaff)employee).ExportEmployees();
            } else if (employee instanceof EmployeeMarketing){
                ((EmployeeMarketing)employee).ExportEmployees();
            } else if (employee instanceof Leader){
                ((Leader)employee).ExportEmployees();
            }
            System.out.println("--------------");
        }
    }
    public void FindAndSearch(Scanner scanner){
        System.out.println("Enter Employee Code : ");
        String employeeCode = scanner.nextLine();
        Employee employeeFound = null;
        for(Employee employee : employees){
            if(employee.getEmployeeCode().equalsIgnoreCase(employeeCode)){
               employeeFound = employee;
               break;
            }
        }
        if(employeeFound != null){
            System.out.println("Employee has been found : ");
            employeeFound.ExportEmployees();
        } else {
            System.out.println("Not found " + employeeCode);
        }
    }
    public void DeleteEmployee(Scanner scanner){
        System.out.println("Delete employee for code ");
        System.out.println("Enter employee code is need deleted : ");
        String code = scanner.nextLine();
        Employee employeeFound = null;
        for(Employee employee : employees){
            if(employee.getEmployeeCode().equalsIgnoreCase(code)){
                employeeFound = employee;
                break;
            }
        }
        if (employeeFound != null){
            employees.remove(employeeFound);
            System.out.println("This employee has been deleted");
        } else {
            System.out.println("Not found " + code);
        }
    }
    public void UpdateEmployees(Scanner scanner){
        System.out.println("Update employees from code");
        System.out.println("Enter employee code : " );
        String employeeCode = scanner.nextLine();
        Employee employeeFound = null;
        for(Employee employee : employees){
            if(employee.getEmployeeCode().equalsIgnoreCase(employeeCode)){
                employeeFound = employee;
                break;
            }
        }
        if(employeeFound != null){
            if(employeeFound instanceof EmployeeStaff){
                ((EmployeeStaff)employeeFound).AddEmployee(scanner);
            } else if (employeeFound instanceof Leader){
                ((Leader) employeeFound).AddEmployee(scanner);
            } else if (employeeFound instanceof EmployeeMarketing){
                ((EmployeeMarketing) employeeFound).AddEmployee(scanner);
            }
        } else {
            System.out.println("Not found " + employeeCode);
        }
    }
    public void SearchIncome(Scanner scanner){
        System.out.println("Find employee in income");
        System.out.println("Enter lest : ");
        Double min = (Double)scanner.nextDouble();
        System.out.println("Highest : ");
        Double max = (Double)scanner.nextDouble();
        boolean found = false;
        for(Employee employee : employees){
            if(min <= employee.getincome() && employee.getincome() <= max){
                employee.ExportEmployees();
                System.out.println();
                found = true;
            }
        }
        if(found == false){
            System.out.println("Not found");
        }
    }
    public void SortNameEmployees(){
        Collections.sort(employees, (a, b) -> a.getName().compareTo(b.getName()));
    }
    public void SortSumIncome(){
        Collections.sort(employees, (a, b) -> (int)(a.getSumIncome() - b.getSumIncome()));
    }
    public void ExportTop5(){
        Collections.sort(employees, (a, b) -> (int)(b.getSumIncome() - a.getSumIncome()));
        System.out.println("Top 5 Sumincome : ");
        for(int i = 0; i < 5 && i < employees.size(); i++){
            employees.get(i).ExportEmployees();
        }
    }
}

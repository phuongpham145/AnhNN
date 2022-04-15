package inherit_employee;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice = 0;
            System.out.println("| Employee Program");
            System.out.println("| 1. Add Employee");
            System.out.println("| 2. Export Employee List");
            System.out.println("| 3. Export Top 5 Employee");
            System.out.println("| 4. Sort Employee SumIncome");
            System.out.println("| 0. Exit Program");
            System.out.println("| Your choice is : ");
            choice = scanner.nextInt();
            if (choice == 0) {
                System.exit(0);
            }
            switch (choice) {
                case 1:
                    list.AddEmployee();
                    break;
                case 2:
                    list.ExportEmployees();
                    break;
                case 3:
                    list.ExportTop5();
                    break;
                case 4:
                    list.SortSumIncome();
            }
            System.out.println("Enter to continue ");
            scanner.nextLine();
            try {
                Runtime.getRuntime().exec("cls");
            } catch (IOException ex) {
            }
            scanner.close();
        }
    }
}

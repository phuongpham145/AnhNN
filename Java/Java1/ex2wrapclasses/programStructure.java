package ex1wrapclasses;

import java.util.Scanner;

public class programStructure {
    public static void displayMenu() {
        System.out.println("--------------------------------");
        System.out.println(" - 1. Add two numbers");
        System.out.println(" - 2. Sub two numbers");
        System.out.println(" - 3. Excape two numbers");
        System.out.println("--------------------------------");
        System.out.println("Enter function : ");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                   add();
                   break;
            case 2:
                   sub();
                   break;
            default :
                   System.out.println("See you again");
                   System.exit(0);
                   
        }
        scanner.close();
    }
    public static void add() {
        System.out.println("Add");
    }
    public static void sub(){
        System.out.println("Sub");
    }
    public static void main(String[] args) {
        displayMenu();
        System.out.println("Complete !!!");
    }
}

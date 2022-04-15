package ex1wrapclasses;
import java.util.Scanner;
public class monthAndDate {
    public static void main(String[] args) {
        int month, year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year : ");
        year = scanner.nextInt();
        System.out.print("Enter month : ");
        month = scanner.nextInt();
        switch (month) {
            case 2: 
            if(year % 4 == 0 && year % 100 != 0) {
                System.out.println("The month have 29 days");
            } else {
                System.out.println("The month have 28 days");
            }
            break;
            case 4: 
            case 6:
            case 9:
            case 11:
                 System.out.println("The month have 31 days");
                 break;
            default:
                 System.out.println("The month have 30 days");
        }
        scanner.close();
    }
    
}

import java.util.Scanner;

public class StringNumbers {
    public static void main(String[] args) {
        String numbers;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string numbers: ");
        numbers = scanner.nextLine();
        String ars[] = numbers.split(",");
        for( String item : ars) {
            int num = Integer.parseInt(item);
            if(num % 2 == 0) {
                System.out.print(" " + num + " ");
            }
        }
        System.out.println("\nEnd");
        scanner.close();
    }
}

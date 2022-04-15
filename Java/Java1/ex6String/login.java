import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = scanner.nextLine();
        System.out.println("Enter password : ");
        String password = scanner.nextLine();
        if (username.equalsIgnoreCase("hello") && password.length() > 6)
            System.out.println("Login Successfully");
        else
            System.out.println("Login Failed");
        scanner.close();
    }
}
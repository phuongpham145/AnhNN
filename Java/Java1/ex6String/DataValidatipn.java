import java.util.Scanner;

public class DataValidatipn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email : ");
        String email = scanner.nextLine();
        System.out.print("Number Phone : ");
        String phone = scanner.nextLine();
        String reEmail = "\\w+@\\w+\\.\\w+";
        if (email.matches(reEmail))
            System.out.println("Email exactlly !");
        else
            System.out.println("Email failed!");

        String rePhone = "0543\\d{6}";
        if (phone.matches(rePhone))
            System.out.println("Phone in Hue");
        else
            System.out.println("Phone failed!");
        scanner.close();
    }
}

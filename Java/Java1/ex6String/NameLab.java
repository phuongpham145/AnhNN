import java.util.Scanner;

public class NameLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fullname : ");
        String fullname = scanner.nextLine();
        String[] ars = fullname.split(" ");
        String familyName = ars[0];
        String name = ars[ars.length-1];
        name = name.toUpperCase();
        familyName = familyName.toUpperCase();
        System.out.println("Name after : ");
        System.out.print(name + " " + familyName);
        for (int i = 1; i < ars.length - 1; i++) {
            System.out.print(ars[i] + " ");
        }
        scanner.close();
    }
}

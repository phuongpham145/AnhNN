import java.util.Scanner;

public class SearchAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter information : ");
        String content = scanner.nextLine();
        System.out.print("Enter information you need search : ");
        String find = scanner.nextLine();
        System.out.print("Enter information you want replace : ");
        String replace = scanner.nextLine();
        String result = content.replaceAll(find, replace);
        System.out.println("The information after replaced : " + result);
        scanner.close();
    }
}

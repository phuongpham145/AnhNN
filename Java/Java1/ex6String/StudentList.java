import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        do {
            System.out.printf("Enter student %d: ", i);
            String fullName = scanner.nextLine();
            if (fullName == null || fullName.equals("")) {
                break;
            }
            list.add(fullName);
            i++;
        } while (true);
        for (String student : list) {
            student = student.trim();
            if (student.startsWith("Nguyen ") || student.endsWith(" Tuan")) {
                String familyName = student.substring(0, student.indexOf(" "));
                String name = student.substring(student.lastIndexOf(" "));
                String subName = student.substring(student.indexOf(" "), student.lastIndexOf(" "));
                System.out.printf("Student Name: %s %s %s  ", familyName.toUpperCase(), subName, name.toUpperCase());
            }
        }
        scanner.close();
    }
}

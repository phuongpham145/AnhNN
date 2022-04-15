import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentArray {
    private ArrayList<String> students = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);

    public void AddStudent() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter Student Name : ");
            String studentName = scanner.nextLine();
            if (studentName.isEmpty())
                break;
            students.add(studentName);
        } while (true);
        scanner.nextLine();
        scanner.close();
    }

    public void DisplayStudent() {
        System.out.println("Student Name List : ");
        for (String student : students)
            System.out.println("Full Name : " + student);
    }

    public void RandomDisplayStudent() {
        Collections.shuffle(students);
        DisplayStudent();
    }

    public void SortStudent() {
        Collections.sort(students, (a, b) -> a.compareTo(b));
        DisplayStudent();
    }

    public void SearchDeleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten can xoa : ");
        String fullName = scanner.nextLine();
        for (String student : students) {
            if (student.equals(fullName)) {
                students.remove(student);
                break;
            }
        }
        scanner.nextLine();
        scanner.close();
    }

    public void DisplayMenu() {
        do {
            System.out.println("-----------------------");
            System.out.println("Programming Menu Function : ");
            System.out.println("1: Enter Students List");
            System.out.println("2: Display Students List");
            System.out.println("3: Sort Students List");
            System.out.println("4: RandomDisplay Students List");
            System.out.println("5: SearchDeleteStudent List");
            System.out.println("6: Exit");
            int choice = scanner.nextInt();
            switch (choice) {
            case 1:
                AddStudent();
                break;
            case 2:
                DisplayStudent();
                break;
            case 3:
                SortStudent();
                break;
            case 4:
                RandomDisplayStudent();
                break;
            case 5:
                SearchDeleteStudent();
                break;
            case 6:
                System.exit(0);
                break;
            }
            scanner.close();
        } while (true);
    }
}

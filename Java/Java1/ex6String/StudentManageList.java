import java.util.ArrayList;
import java.util.Scanner;

public class StudentManageList {
    private ArrayList<StudentManage> list = new ArrayList<>();

    public void AddStudent() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            StudentManage student = new StudentManage();
            student.AddStudent(scanner);
            list.add(student);
        }
    }

    public void ExportStudent() {
        System.out.println("--------------------------------");
        System.out.println("Student List: ");
        for (StudentManage student : list) {
            student.ExportStudent();
        }
    }
}

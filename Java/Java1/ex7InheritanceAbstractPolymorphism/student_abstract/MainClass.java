package student_abstract;

public class MainClass {
    public static void main(String[] args) {
        Student student;
        student = new StudentIT("Phuong", 10, 9);
        System.out.println("AvgPoint : " + student.AvgPoint());
        student = new StudentBiz("Daniel", 8, 9, 5);
        System.out.println("AvgPoint : " + student.AvgPoint());
    }
}

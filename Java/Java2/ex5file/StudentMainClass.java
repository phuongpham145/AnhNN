public class StudentMainClass {
    public static void main(String[] args) {
        try {
            Student student = new Student("Phuong", 10, "Programing");
            String path = "xfile.dat";
            XFile.writeObject(path, student);
            Student stud = (Student) XFile.readObject(path);
            System.out.println("Name : " + stud.getName());
            System.out.println("Mark : " +stud.getMark());
            System.out.println("Major : " +stud.getMajor());
            System.out.println("Grade : " +stud.getGrade());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.FileInputStream;
import java.io.DataInputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("Student.dat");
                DataInputStream dis = new DataInputStream(fin)) {
            String st = dis.readUTF();
            int age = dis.readInt();
            System.out.println("Read Data : ");
            System.out.println("Message : " + st);
            System.out.println("Age : " + age);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

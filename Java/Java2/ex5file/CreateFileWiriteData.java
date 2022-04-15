import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class CreateFileWiriteData {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("Student.dat");
                DataOutputStream dos = new DataOutputStream(fos);) {
            dos.writeUTF("Hello world");
            dos.writeInt(25);
            System.out.println("Successfully");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}

import java.io.IOException;

public class XFileMainClass {
    public static void main(String[] args) {
        try {
            String path = "xfile.dat";
            XFile.write(path, "Pham Van Phuong".getBytes());
            byte[] data = XFile.read(path);
            System.out.println("Read Data : " + new String(data));
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

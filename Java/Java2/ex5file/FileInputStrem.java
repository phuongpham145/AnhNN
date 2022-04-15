import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStrem {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("hello.dat");
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fin.read(buffer, 0, 1024)) > 0) {
                String st = new String(buffer, 0, length);
                System.out.println("Read String : " + st);
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
            }
        }
    }
}

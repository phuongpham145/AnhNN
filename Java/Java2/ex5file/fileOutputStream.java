import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("hello.dat");
            String st = "Hello Pham Van Phuong";
            fos.write(st.getBytes());
            fos.write(st.getBytes());
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
            }
        }
    }
}
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String args[]) {
        try (FileOutputStream fos = new FileOutputStream("Products.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Product pro = new Product("P01", "Marco");
            oos.writeObject(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

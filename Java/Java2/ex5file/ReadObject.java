import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Products.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Product pro = (Product) ois.readObject();
            System.out.println("Product ID : " + pro.getProductId());
            System.out.println("Product Name : " + pro.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

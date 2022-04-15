import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            Product product = new Product();
            product.AddProduct();
            list.add(product);
        }
        for(Product product : list) {
            if(product.getBrand().equalsIgnoreCase("Nokia")){
                product.ExportProduct();
                System.out.println("");
            }
        }
    }
}

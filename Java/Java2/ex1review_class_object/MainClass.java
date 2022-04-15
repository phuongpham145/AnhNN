import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            Product product = new Product();
            System.out.println("Product " + i);
            System.out.print("Name : ");
            String name = scanner.nextLine();
            product.setName(name);
            System.out.print("Price : ");
            float price = scanner.nextFloat();
            scanner.nextLine();
            product.setPrice(price);
            System.out.printf("Name : %s - Price : %.2f  - Tax : %.2f \n", product.getName(), product.getPrice(),
                    product.getImportTax());
        }
        scanner.close();
    }
}

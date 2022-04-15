import java.util.Scanner;

public class DAOMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Product product;
            if (i != 0) {
                product = new Product();
            } else {
                product = new NoTaxProduct();
            }
            System.out.print("Name : ");
            String name = scanner.nextLine();
            product.setName(name);
            System.out.print("Price : ");
            float price = scanner.nextFloat();
            scanner.nextLine();
            product.setPrice(price);
            System.out.printf("Name : %s - Price : %.2f - Tax : %.2f\n", product.getName(), product.getPrice(),
                    product.getImportTax());
            product.insert();
            product.update();
            product.delete();
            product.select();

        }
        scanner.close();
    }
}

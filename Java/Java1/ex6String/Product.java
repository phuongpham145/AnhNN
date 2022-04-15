import java.util.Scanner;

public class Product {
    private String productName;
    private Double price;
    private String brand;
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void AddProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        productName = scanner.nextLine();
        System.out.print("Enter product price : ");
        price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter brand : ");
        brand = scanner.nextLine();
    }
    public void ExportProduct(){
        System.out.printf("Name : %s  -  Price : %f  - Brand : %s", productName, price, brand);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductArrayList {
    private ArrayList<ProductArray> list = new ArrayList<>();

    public void AddProduct() {
        System.out.println("Enter Products List : ");
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        do {
            System.out.printf("Product Name %d :", i);
            String productName = scanner.nextLine();
            if (productName == null || productName.equals(""))
                break;
            System.out.print("Product Price : ");
            Double price = scanner.nextDouble();
            list.add(new ProductArray(productName, price));
            scanner.nextLine();
            i++;
        } while (true);
        scanner.close();
    }

    public void display() {
        System.out.println("Product Array List : ");
        System.out.println("Name\t\t|Price\t\t");
        for (ProductArray productArray : list) {
            System.out.printf("%20s | %.2f", productArray.getName(), productArray.getPrice());
        }
    }

    public void ProductSort() {
        Collections.sort(list, (a, b) -> (int) (a.getPrice() - b.getPrice()));
        System.out.println("Product List After Sorted : ");
        display();
    }

    public void ProductSearch() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Product Name Which you needed search : ");
        String nameSearch = scan.nextLine();
        ProductArray found = null;
        for (ProductArray productArray : list) {
            if (productArray.getName().equals(nameSearch)) {
                found = productArray;
                break;
            }
        }
        if (found != null) {
            list.remove(found);
            System.out.println("The product is deleted");
        } else {
            System.out.println("The product isn't have in list");
        }
        scan.close();
    }

    public void AveragePrice() {
        Double avg = (double) 0, sum = (double) 0;
        for (ProductArray productArray : list) {
            sum += productArray.getPrice();
        }
        avg = sum / list.size();
        System.out.println("Average Price : " + avg);
    }

    public void menu() {
        System.out.println("Program Menu");
        System.out.println("1. Product List : ");
        System.out.println("2. Export Product List : ");
        System.out.println("3. Product Sorted : ");
        System.out.println("4. Product Deleted : ");
        System.out.println("5. Product Average : ");
        System.out.println("6. Exit program ");
        System.out.print("Chose : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
        case 1:
            AddProduct();
            break;
        case 2:
            display();
            break;
        case 3:
            ProductSort();
            break;
        case 4:
            ProductSearch();
            break;
        case 5:
            AveragePrice();
            break;
        case 6:
            System.exit(0);
            break;
        default:
            System.out.println("Error value ");
        }
        scanner.close();
    }
}

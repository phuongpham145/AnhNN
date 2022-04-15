import java.util.Scanner;

public class DoubleArrayMainClass {
    public static void main(String[] args) {
        DoubleArray nums = new DoubleArray();
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu chuong trinh : ");
            System.out.println("1: Nhap danh sach");
            System.out.println("2: Hien thi danh sach");
            System.out.println("3: Tinh tong");
            System.out.println("0: Thoat chuong trinh");
            choice = scanner.nextInt();
            if (choice != 0) {
                switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    nums.AddNumbers();
                    break;
                case 2:
                    nums.Display();
                    break;
                case 3:
                    nums.SumNumbers();
                    break;
                default:
                    System.out.println("Nhap gia tri sai");
                }
            }
        } while (choice != 0);
        System.out.println("Program is ended");
        scanner.close();
    }
}

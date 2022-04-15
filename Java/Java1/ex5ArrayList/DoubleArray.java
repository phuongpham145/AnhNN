import java.util.ArrayList;
import java.util.Scanner;

public class DoubleArray {
    private ArrayList<Double> list = new ArrayList<Double>();

    public void AddNumbers() {
        System.out.println("Nhap danh sach cac so thuc : ");
        Scanner scanner = new Scanner(System.in);
        int yes = 1;
        list.clear();
        do {
            System.out.print("Nhap so : ");
            double num = scanner.nextDouble();
            list.add(num);
            System.out.print("Ban co muon nhap tiep (1: Tiep, 0: Thoat) : ");
            yes = scanner.nextInt();
        } while (yes == 1);
        scanner.close();
    }

    public void Display() {
        System.out.println("--------------------------------");
        for (Double num : list) {
            System.out.print(" " + num);
        }
        System.out.println();
    }

    public void SumNumbers() {
        Double sum = (double) 0;
        for (Double num : list)
            sum += num;
        System.out.println("Tong : " + sum);
    }
}

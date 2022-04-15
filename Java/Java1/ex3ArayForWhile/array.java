
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
         //Arrays
         System.out.println("Array :");
         Scanner scan = new Scanner(System.in);
         int sum =0;
         int[] mang = new int[10];
         for(int it = 0; it < 10; it++) {
             System.out.print("Nhap phan tu thu " + it + " = ");
             mang[it] = scan.nextInt();
         }
         for(int item : mang) {
             sum += item;
         }
         System.out.println("Sum :" + sum);
         float avgarray = (float) sum / 10;
         System.out.println("Avg array :" + avgarray);
         scan.close();
    }
}

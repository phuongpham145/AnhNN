import java.util.Arrays;
import java.util.Scanner;

public class minArray {
    public static void main(String[] args) {
        int mang[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < mang.length; i++) {
            System.out.printf("Nhap phan tu thu %d : ", i);
            mang[i] = scanner.nextInt();
        }
        System.out.println("Phan tu mang : " + Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println("Sau sap xep : " + Arrays.toString(mang));
        int min = mang[0];
        /*for (int i = 1; i < mang.length; i++) {
            if(min > mang[i]) min = mang[i];
        }*/
        for(int i = 1; i < mang.length; i++)
        min = Math.min(min, mang[i]);
        System.out.println("Min = " + min);
        scanner.close();
    }
}

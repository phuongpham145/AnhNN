import java.util.Scanner;

public class arrayForWhile {
    public static void main(String[] args) {
        System.out.println("Lenh  While");
        int a = 7, b = 1;
        while (b <= 10) {
            int c = a * b;
            System.out.printf("%d x %d = %d \n", a, b, c);
            b++;
        }
        System.out.println("Trung binh cong");
        int i = 27;
        int sum = 0, count = 0;
        while (i < 270) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
            i++;
        }
        float avg = (float) sum / count;
        System.out.printf("Trung binh cong : %f", avg);
        // Lenh do While
        System.out.println("\nLenh do While");
        float diem = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap diem : ");
            diem = scanner.nextFloat();
            if (diem < 0 || diem > 10) {
                System.out.println("Diem nhap sai, vui long nhap lai !");
            } else {
                System.out.printf("Diem cua ban la : %f", diem);
            }

        } while (diem < 0 || diem > 10);
        scanner.close();
        // Lenh for
        System.out.println("\nLenh for : \n");
        int d = 9;
        for(int it = 1; it <= 10; it++) {
        int c = d * it;
        System.out.printf("%2d x %2d = %2d \n", d, it, c);
        }
    }
}
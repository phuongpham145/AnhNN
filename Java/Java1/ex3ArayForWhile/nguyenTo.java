import java.util.Scanner;

public class nguyenTo {
    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);
        boolean ok = true;
        n = scanner.nextInt();
        for(int i = 2; i < n - 1; i++) {
            if(n % i == 0) {
                ok = false;
                break;
            }
        }
        if(ok) {
            System.out.printf("%d la so nguyen to \n", n);
        } else {
            System.out.printf("%d khong la so nguyen to \n", n);
        }
        scanner.close();
    }
}


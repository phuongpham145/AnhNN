import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        String svs[] = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap sinh vien thu %d : ", (i + 1));
            svs[i] = scanner.nextLine();
        }
        System.out.println("Mang sinh vien : " + Arrays.toString(svs));
        Arrays.sort(svs);
        System.out.println("Mang sinh vien sap xep : " + Arrays.toString(svs));
        float[] diems = new float[]{9, 3, 2, 4, 1};
        for(int i = 0; i < diems.length -1; i++) {
            for(int j = 0; j < diems.length; j++) {
                if(diems[i] < diems[j]) {
                    float temp = diems[j];
                    diems[j] = diems[i];
                    diems[i] = temp;
                }
            }
        }
        System.out.print("Diem sau sap xep : " + Arrays.toString(diems));
        scanner.close();
    }
}

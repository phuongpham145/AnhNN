package ex1wrapclasses;

import java.util.Scanner;

public class phuongTrinhBacHai {
    public static void giaPhuongTrinhBacNhat(float a, float b){
        if(a == 0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float nghiem = - b / a;
            System.out.println("Phuong trinh co nghiem : " + nghiem);
        }
    }
    public static void giaiphuongTrinhBacHai(float a, float b, float c){
       if(a==0){
           giaPhuongTrinhBacNhat(b, c);
       } else {
           float delta = (float) Math.pow(b, 2) - 4 * a * c;
           if(delta < 0) System.out.println("Phuong trinh vo nghiem");
           else if(delta == 0) System.out.printf("Phuong trinh co nghiem duy nhat : x = %.2f", -b / 2*a );
           else System.out.printf("Phuong trinh co hai nghiem : \nx1 = %.2f \nx2 = %.2f", (-b + (float)Math.sqrt(delta)) / 2*a, (-b - (float)Math.sqrt(delta)) / 2*a);
       }
    }
    public static void main(String[] args){
        float a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        giaiphuongTrinhBacHai(a, b, c);
        scan.close();
    }
    
}

package ex1wrapclasses;

import java.util.Scanner;

public class phuongTrinhBacNhat {
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
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       float a, b;
       System.out.print("Nhap a, b : ");
       a = scanner.nextInt();
       b = scanner.nextInt();
       giaPhuongTrinhBacNhat(a, b);
       System.out.println("Ket thuc chuong trinh");
       scanner.close();
    }
}

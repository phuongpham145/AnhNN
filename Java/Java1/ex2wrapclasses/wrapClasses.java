package ex1wrapclasses;

import java.util.Scanner;
public class wrapClasses{
    public static void main(String[] args) {
        int num;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so : ");
            num = scanner.nextInt();
            if(num>0){
            double sqrt = Math.sqrt(num);
            System.out.println("Square root :" + sqrt);
            } else {
                System.out.println("So am !");
            }
            scanner.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        System.out.println("Completed !!!");
    }
}
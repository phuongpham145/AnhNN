package ex1wrapclasses;

import java.util.Scanner;

public class tienDien {
    public static void main(String[] args) {
        float soDien, tienDien;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dien : ");
        soDien = scanner.nextFloat();
        if(soDien <= 50) tienDien = soDien * 1000;
        else{
            tienDien = 50*1000 + (soDien - 50) * 1200 ;
        }
        System.out.printf("Tien dien : %f", tienDien);
        scanner.close();
    }
}

import java.util.Scanner;

public class datatypes{
    public static void main(String[] args){
        String hoTen = "";
        byte tuoi = 0;
        float diem = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap tuoi : ");
        tuoi = scanner.nextByte();
        System.out.print("Nhap diem : ");
        diem = scanner.nextFloat(); 
        System.out.println("Ho ten : " + hoTen);
        System.out.println("Tuoi :" + tuoi);
        System.out.println("Diem :" + diem);

        
        //Dien tich hinh chu nhat
        System.out.println("Dien tich chu nhat :");
        float with = 0, height = 0;
        System.out.print("Nhap chieu dai, chieu rong : ");
        with = scanner.nextFloat();
        height = scanner.nextFloat();
        System.out.println("Dien tich : " + with * height);
        System.out.println("Chu vi : " + (with + height)*2);
        float min = Math.min(with, height);
        System.out.printf("Do dai nho nhat la %f", min);


        //Kiem tra tam giac
        System.out.println("\nKiem tra tam giac : ");
        float a, b, c;
        System.out.println("Nhap vao ba canh cua tam giac : ");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        boolean condition1 = a + b > c ? true : false;
        boolean condition2 = a + c > b ? true : false;
        boolean condition3 = b + c > a ? true : false;
        if(condition1 && condition2 && condition3) 
        System.out.println("Tam giac");
        else System.out.println("Khong la tam giac");


        //Ep kieu tinh gia tien 
        double price;
        int quantity;
        System.out.println("Enter price : ");
        price = scanner.nextDouble();
        System.out.println("Enter quantity : ");
        quantity = scanner.nextInt();
        double grand = price * quantity;
        System.out.println("Grand Total : " + grand);


        //The tich lap phuong
        System.out.println("The tich lap phuong : ");
        float clp;
        System.out.print("Nhap canh cua hinh lap phuong : ");
        clp = scanner.nextFloat();
        float theTich = (float) Math.pow(clp, 3);
        System.out.printf("The tich lap phuong la %f ", theTich);
        scanner.close();

    }
}
import java.util.Scanner;

public class student {
    String hoTen;
    double diemTb;
    public student(){
        hoTen = "PhuongPham";
        diemTb = 0;
    }
    public student(String hoTen, double diemTb){
        this.hoTen = hoTen;
        this.diemTb = diemTb;
    }
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten : ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap diem : ");
        diemTb = scanner.nextDouble();
        scanner.close();
    }

    public void Xuat() {
        System.out.println("\n------------------------");
        System.out.printf("Ho ten sinh vien: %s - diem tb: %f - Hoc luc: %s", hoTen, diemTb, xepLoai());
    }

    public String xepLoai() {
        if (diemTb >= 9)
            return "Xuat sac";
        else
            return "Gioi";
    }
}

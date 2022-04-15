import java.util.Scanner;

public class sanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public sanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public sanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.printf("Ten san pham : %s | Don Gia : %s | Giam Gia : %f | Thue Nhap Khau : %f ", tenSP, donGia,
                giamGia, getThueNhapKhau());
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham : ");
        tenSP = scanner.nextLine();
        System.out.print("Nha don gia : ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap giam gia : ");
        giamGia = scanner.nextDouble();
        scanner.close();
    }
}

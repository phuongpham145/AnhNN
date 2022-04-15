public class MainSanPham {
    public static void main(String[] args) {
        sanPham sp1 = new sanPham("SanPham1", 400, 20);
        // sp1.nhap();
        sp1.xuat();
        String ten = sp1.getTenSP();
        System.out.println("Ten SP : " + ten);
        sp1.setTenSP("New SP");
        sp1.xuat();
        System.out.println("--------------------------------");
        sanPham sp2 = new sanPham("SanPham2", 600);
        sp2.xuat();
    }
}

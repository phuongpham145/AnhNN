package ex1wrapclasses;

public class personalTax {
    public static void main(String[] args) {
        double luong = 30000000, thuong = 20;
        double thuNhap = luong + thuong;
        double thue = 0;
        if(thuNhap >= 30000000){
            thue = thuNhap * 0.3;
        } else if (thuNhap < 30000000 && thuNhap > 15000000){
            thue = thuNhap * 0.15;
        }  else if (thuNhap >= 9000000){
            thue = thuNhap * 0.1;
        } else thue = 0;
        System.out.printf("Tong thu nhap cua ban la %.2f", thuNhap);
        System.out.printf("Thue cua ban la %.2f", thue);
    }
}

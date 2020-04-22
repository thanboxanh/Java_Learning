package BienVaHang;

public class HangSo {

    static int bienso = 3;

    static void TinhTong(int a, int b) {
        a+=b;
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        final int hangso = 10;
        int a = 5, b= 6;
        TinhTong(bienso, b);
        System.out.println(bienso);
    }
}

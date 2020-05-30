package HuongDoiTuong;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LopHoc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ten hoc sinh");
        String tenHocSinh = scanner.next();
        
        System.out.println("Nhap tuoi Hoc Sinh");
        int tuoi = scanner.nextInt();
        
        HocSinh a = new HocSinh(tenHocSinh, tuoi);
        System.out.println("Thong tin la: Ten: " + tenHocSinh + " Tuoi: " + tuoi);
    }
}

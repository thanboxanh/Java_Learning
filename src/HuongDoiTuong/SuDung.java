package HuongDoiTuong;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class SuDung {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moi Ban Nhap ten con bo: ");
            String tenConBo = scanner.nextLine();
            System.out.println("Moi Ban Nhap can nang con bo: ");
            int cannang = scanner.nextInt();
            System.out.println("Moi Ban Nhap don vi: ");
            String donVi = scanner.next();
            System.out.println("Moi Ban Nhap chat luong thit: ");
            String chatLuongThit = scanner.next();

            conbo a = new conbo(tenConBo, cannang, chatLuongThit, donVi);
            a.KiemTraTheTrang();
        }
    }
}

package VongLap;

import java.util.Scanner;

/**
 *
 * @author ThanBoXanh
 */
public class TinhTongLap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("Hay nhhap so a: ");
            int a = scanner.nextInt();
            if(a == -1) {
                System.out.println("-1 khong hop le, hay nhap so khac: ");
                continue;
            }

            System.out.println("Hay nhhap so b: ");
            int b = scanner.nextInt();

            int tong = a + b;
            System.out.println("Tong cua 2 so a va b la: " + tong);
            
            i++;
        }

    }
}

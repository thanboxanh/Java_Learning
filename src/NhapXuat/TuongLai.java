/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhapXuat;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TuongLai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap tuoi: ");
        int tuoi = sc.nextInt();

        System.out.println("tuoi hien tai cua ban la: " + tuoi);

        System.out.println("nhap so nam sau: ");
        int soNam = sc.nextInt();
        int tuongLai = tuoi + soNam;

        System.out.println("tuoi tuong lai cua ban la: " + tuongLai);

    }
}

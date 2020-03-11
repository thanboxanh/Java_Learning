/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VongLap;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TinhTich {

    public static void main(String[] args) {
        Scanner FBI = new Scanner(System.in);
        int count = 0;
        while (true) {
            double ketqua = 1;
            System.out.println("nhap so: ");
            int b = FBI.nextInt();
            if (b >= 10) {
                count++;
                if (count >= 3) {
                    System.out.println("ban dang co gang hack get out");
                    return;
                }
                System.out.println("moi ban nhap lai: ");
                continue;
            }
            for (int i = b; i >= 1; i--) {
                ketqua *= i;

            }
            System.out.println(ketqua);

        }

    }
}

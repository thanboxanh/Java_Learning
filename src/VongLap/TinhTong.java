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
public class TinhTong {

    public static void main(String[] args) {
        int ketqua = 0;
        Scanner haudaden = new Scanner(System.in);
        System.out.println("nhap so; ");
        int b = haudaden.nextInt();
        for (int i = 1; i <= b; i++) {
            //if (i % 2 == 0) {
                ketqua += i; // ketqua = ketqua + i;
            //}
        }
        System.out.println(ketqua);
    }
}

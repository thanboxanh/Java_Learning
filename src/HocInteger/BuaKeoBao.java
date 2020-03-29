/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocInteger;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BuaKeoBao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Moi nguoi choi 1 nhap: (Bua: 0, Keo: 1, Bao: 2): ");
            int N1 = scan.nextInt();
            System.out.println("Moi nguoi choi 2 nhap: (Bua: 0, Keo: 1, Bao: 2): ");
            int N2 = scan.nextInt();

            if (N1 == 0) {
                if (N2 == 0) {
                    System.out.println("hoa");
                } else if (N2 == 1) {
                    System.out.println("N1 thang");
                } else {
                    System.out.println("N2 thang");
                }
            } else if (N1 == 1) {
                if (N2 == 0) {
                    System.out.println("N2 thang");
                } else if (N2 == 1) {
                    System.out.println("hoa");
                } else {
                    System.out.println("N1 thang");
                }
            } else {
                if (N2 == 0) {
                    System.out.println("N1 thang");
                } else if (N2 == 1) {
                    System.out.println("N2 thang");
                } else {
                    System.out.println("hoa");
                }
            }

        }
    }
}

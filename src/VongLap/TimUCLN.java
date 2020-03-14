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
public class TimUCLN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Moi ban nhap so: ");
//            int n = sc.nextInt();
//            int ketqua = 1;
//
//            for (int i = 1; i <= n /2; i++) {
//                if (n % i == 0) {
//                    ketqua = i;
//                }
//            }
//            System.out.println(ketqua);
//        }

        while (true) {
            System.out.println("Moi ban nhap so: ");
            int n = sc.nextInt();

            for (int i = n/2; i >= 1; i--) {
                if (n % i == 0) {
                    System.out.println(i);
                    break;
                }
                
            } 
        }
    }
}

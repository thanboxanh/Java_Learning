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
public class Demso {

    public static void main(String[] args) {
        Scanner cb = new Scanner(System.in);
        int dem = 0;
        System.out.println("moi ban nhap so: ");
        int b = cb.nextInt();
        for (int i = 0; i <= b; i++) {
            if (i % 2 == 0) {
                dem++;
            }
        }
        System.out.println(dem + " so chan");
    }
}

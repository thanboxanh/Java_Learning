/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocInteger;

import java.util.Random;

/**
 *
 * @author PC
 */
public class baokeobua {

    public static void main(String[] args) {
        Random a = new Random();
        int N1 = a.nextInt(3);
        int N2 = a.nextInt(3);
        System.out.println("N1: " + N1);
        System.out.println("N2: " + N2);

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
    } // bua = 0 keo = 1 bao = 2
    
    
    
}

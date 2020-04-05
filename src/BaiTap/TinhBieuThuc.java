/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TinhBieuThuc {

    static void phepCong(int a, int b, int d, int c, int e) {
        int h = ((a * b) + (c * d));
        int z = h / e;
        int v = h % e;
        System.out.println("tinh tong: " + z  + " so du la: " + v);
    }
    
    static int phepCong2(int a, int b, int d, int c) {
        int h = ((a * b) + (c * d));
        return h;
    }

    public static void main(String[] args) {
//        int h = phepCong2(2, 4, 5, 6);
//        int e = 3;
//        int z = h / e;
//        int v = h % e;
//        System.out.println("tinh tong: " + z  + " so du la: " + v);
//        
//        int k = 10;
//        z = h / k;
//        v = h % k;
//        System.out.println("tinh tong: " + z  + " so du la: " + v);

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so a = ");
        int a = sc.nextInt();
        System.out.println("Moi ban nhap so b = ");
        int b = sc.nextInt();
        System.out.println("Moi ban nhap so c = ");
        int c = sc.nextInt();
        System.out.println("Moi ban nhap so d = ");
        int d = sc.nextInt();
        System.out.println("Moi ban nhap so e = ");
        int e = sc.nextInt();
        phepCong(a, b, d, c, e);
    }
}

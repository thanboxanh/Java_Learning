/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPackage;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TimSoLonNhat {

//    public static void main(String[] args) {
//        int a = 2, b = 5, c = 1, d = 9;
//
//        int kq = a;
//        if (b > kq) {
//            kq = b;
//        }
//        if (c > kq) {
//            kq = c;
//        }
//        if (d > kq) {
//            kq = d;
//        }
//        System.out.println(kq);
//    }
    
    public static void main(String[] args) {
        //Tim so nho nhat trong mang
        Scanner lo = new Scanner(System.in);
        System.out.println("nhap chieu dai mang: ");
        int m = lo.nextInt();
        int[] n = new int[m];
        for (int b = 0; b < m; b++) {
            System.out.println("nhap phan tu " + b);
            n[b] = lo.nextInt();
        }
        
        int kq = n[0];
        for (int i = 0; i < n.length; i++) {
//            if (n[i] < kq) {
//                kq = n[i];
//                if (kq % 2 == 0) {
//                    kq = n[i];
//                }
//            }
            if(n[i] < kq && n[i] % 2 == 0) {
                 kq = n[i];
            }
        }
        System.out.println("so chan nho nhat la: " + kq);
    }
}

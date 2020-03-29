/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPackage;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TinhTongmang {

    public static void main(String[] args) {
        Scanner lo = new Scanner(System.in);
        System.out.println("nhap chieu dai mang: ");
        int m = lo.nextInt();
        int[] n = new int[m];
        Random v = new Random();
        for (int b = 0; b < m; b++) {
            System.out.println("nhap phan tu " + b);
            n[b] = v.nextInt(-1);
            System.out.println(n[b]);
        }
         
        int kq = 0;
        for (int i = 0; i < n.length; i++) {
            kq += n[i];
        }
        System.out.println(kq);
    }
}

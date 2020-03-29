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
public class TimSoTrongMang {
    
    public static void main(String[] args) {
        int ketqua = 4;
        Scanner lo = new Scanner(System.in);
        System.out.println("nhap chieu dai mang: ");
        int m = lo.nextInt();
        int[] a = new int[m];
        for (int b = 0; b < m; b++) {
            System.out.println("nhap phan tu " + b);
            a[b] = lo.nextInt();
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 5) {
                ketqua = i;
            }
        }
        if(ketqua == 4) {
            System.out.println("Khong Tim thay ");
        } else {
            System.out.println("Tim thay tai vi tri thu: " + ketqua);
        }
        
    }
}

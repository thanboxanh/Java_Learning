/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhapXuat;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DienTichHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        int d = sc.nextInt();
        
        System.out.println("nhap chieu rong: ");
        int r = sc.nextInt();
        int dt = d * r;
        System.out.println("dien tich hinh chu nhat la: " + dt);
    }
}

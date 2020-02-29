package NhapXuat;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class NhapXuat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.println("ban vua nhap so a = " + a);

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        double c = a + b;
        System.out.println("tong cua hai so la: " + a + b);
    }
}
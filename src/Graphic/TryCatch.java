/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TryCatch {

    public static void main(String[] args) {
        
//        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Moi ban nhap so nguyen");
            try {
                int a = scanner.nextInt();
                System.out.println(a);
            } catch (Exception e) {
                System.out.println("ban da nhap sai");
            } finally {
                System.out.println("Chuong trinh ket thuc");
            }
//        }

    }
}

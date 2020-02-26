/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condition;

/**
 *
 * @author PC
 */
public class IfStatement {

    public static void main(String[] args) {
        int d = 32;
        int r = 2;
        int z = d * r;
        String a = "diện tích hình chữ nhật là: ";
        System.out.println(a + z);

        int c = 8;
        int h = c * c;
        String b = "diện tích hình vuông là: ";
        System.out.println(b + h);

        if (z > h) {
            System.out.println("dien tich hinh CN lon hon dien tich vuong");
        } else {
            if (z < h) {
                System.out.println("dien tich hinh CN nho hon dien tich vuong");
            } else {
                System.out.println("dien tich hinh CN bang dien tich vuong");
            }
        }
    }
}

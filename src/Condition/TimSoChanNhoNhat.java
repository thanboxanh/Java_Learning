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
public class TimSoChanNhoNhat {

    public static void main(String[] args) {
        int a = 8, b = 6, c = 7;

        int d;

        String z = "chan ";

        if (a > b && b > c && c % 2 == 0) {
            d = c;
        } else if (a % 2 == 0 && a < b && b < c) {
            d = a;
        } else if (a > b && b % 2 == 0 && b < c) {
            d = b;
            System.out.println("so " + z + "nho nhat la: " + d);
        } else {
            System.out.println(0);
        }

    }
}

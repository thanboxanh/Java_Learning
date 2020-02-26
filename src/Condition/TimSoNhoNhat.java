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
public class TimSoNhoNhat {

//    public static void main(String[] args) {
//        int a = 8, b = 7, c = 10;
//
//        int d;
//        
//        if (a < b) {
//            if (b < c) {
//                d = a;
//            } else { // b > c
//                if (a > c) {
//                    d = c;
//                } else {
//                    d = a;
//                }
//            }
//        } else { // a > b
//            if (b > c){
//                d = c;
//            } else {
//                d = b;
//            }
//        }
//        System.out.println("so nho nhat la " + d);
//    }
    public static void main(String[] args) {
        int a = 8, b = 7, c = 1;

        int d;

        if (a < b) {
            if (b < c) {
                d = a;
            } else { // b > c
                d = a > c ? c: a;
            }
        } else { // a > b
            d = b > c ? c: b;
            
        }
        System.out.println("so nho nhat la " + d);
    }
}

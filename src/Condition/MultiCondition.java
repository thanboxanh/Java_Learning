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
public class MultiCondition {

//    public static void main(String[] args) {
//        int a = 11;
//        int b = 100;
//        int c = 12;
//
//        int d;
//        if (a < b) {
//            if (b < c) {
//                d = c;
//            } else {
//                d = b;
//            }
//        } else {  //a > b
//            if (b < c) {
//                if (a > c) {
//                    d = a;
//                } else {
//                    d = c;
//                }
//            } else { // b > c
//                d = a;
//            }
//        }
//
//        System.out.println("So lon nhat trong ba so la: " + d);
//    }
//    
    public static void main(String[] args) {
        int a = 110;
        int b = 100;
        int c = 12;

        int d;
        if (a < b) {
            d = b < c ? c: b;
        } else {  //a > b
            if (b < c) {
                d = a > c ? a: c;
            } else { // b > c
                d = a;
            }
        }

        System.out.println("So lon nhat trong ba so la: " + d);
    }
    
}

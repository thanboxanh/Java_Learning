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
public class XepHangHocSinh {

    public static void main(String[] args) {

        int diem = 4;

        if (diem >= 8) {
            System.out.println("G");
        } else if (diem >= 7) {
            System.out.println("K");
        } else if (diem >= 5) {
            System.out.println("TB");
        } else {
            System.out.println("Y");
        }
    }
}

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
public class SwichCase {

    public static void main(String[] args) {
        int thang = 12;
        int soNgay = 0;

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;
            case 2:
                soNgay = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
        }
        System.out.println(soNgay);

    }
}

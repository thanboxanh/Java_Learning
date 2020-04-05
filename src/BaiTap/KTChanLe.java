/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

/**
 *
 * @author PC
 */
public class KTChanLe {
    
    static void chanLe(int a) {
        if (a % 2 == 0) {
            System.out.println("so chan");
        } else {
            System.out.println("so le");
        }
    }
    
    public static void main(String[] args) {
        chanLe(5);
    }
}
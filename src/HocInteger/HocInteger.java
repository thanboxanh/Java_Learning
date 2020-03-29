/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HocInteger;

import java.util.Random;

/**
 *
 * @author PC
 */
public class HocInteger {

    public static void main(String[] args) {
        Random baoXauTrai = new Random();
        
        for (int i = 1; i < 10; i++) {
            int a = baoXauTrai.nextInt(5);
            System.out.println(a);
        }
        
        
    }
}

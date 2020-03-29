/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPackage;

import java.util.Random;

/**
 *
 * @author PC
 */
public class ArrayRandom {
    
    public static void main(String[] args) {
//        Random a = new Random();
//        int[] b = new int[5];
//        for (int i = 0; i < b.length; i++ ) {
//            b[i] = a.nextInt(6);
//            System.out.println(i + ": " + b[i]); 
//        }
//        
//        
//        
//        for (int i = 0; i < b.length; i++ ) {
//            if(b[i] == 5) {
//                System.out.println(i);
//            }
//        }
           
        int[] a = {2,1,5,6};
       
        for (int i = a.length - 1; i >= 5; i--) {
            System.out.println(a[i]);
        }
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VongLap;

/**
 *
 * @author PC
 */
public class WhileLoop {
    
    public static void main(String[] args) {
        int i = 0;
        while(i <= 10) {
             if (i % 2 == 0) {
                System.out.println(i + " chan");
            } else {
                System.out.println(i + " le");
            }
            i++;
        }
    }
}

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
public class ShortIf {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        //If a > b -> c = a, else c = b
        int c = a > b? a: b;
        
        System.out.println(c);
    }
}

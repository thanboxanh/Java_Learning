/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

/**
 *
 * @author PC
 */
public class Time {
    
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i <= 10000; i++) {
            System.out.println(i);
            Thread.sleep(1);
        }
    }
}

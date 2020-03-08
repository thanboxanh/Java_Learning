/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuoi;

/**
 *
 * @author PC
 */
public class Function {
    
    static void phepTru(int a, int b, int c) {
        System.out.println("Ket qua phep tru: " + (a - b - c));
    }
    
    static void phepCong(int a, int b, int c) {
        System.out.println("Ket qua phep cong: " + (a + b + c));
    }
    
    public static void main(String[] args) {
        int a = 10, b = 3, c = 1;
        phepCong(a, b, c);
        phepTru(9, 1, 2);
    }
}

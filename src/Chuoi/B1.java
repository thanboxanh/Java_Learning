/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuoi;

import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author nguoi vu han bi corona
 */
public class B1 {
    static void soSanh(String a, String b) {
         if (a.equalsIgnoreCase(b)) {
            System.out.println("bang nhau");
        } else {
            System.out.println("khong bang nhau");
        }
    }
    
    static void hackString(String a) {
        String b = a.toUpperCase();
        System.out.println(b);
    }
    
    public static void main(String[] args) {
        hackString("sfdaaaaaas");
    }
}

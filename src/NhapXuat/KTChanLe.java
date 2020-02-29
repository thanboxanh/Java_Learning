/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhapXuat;

import java.util.Scanner;

/**
 *
 * @author ThanBoXanh
 */
public class KTChanLe {
    
    public static void main(String[] args) {
        Scanner thanboxanh = new Scanner(System.in);
        System.out.println("nhap so: ");
        int a = thanboxanh.nextInt();
        
        if (a % 2 == 0) {
            System.out.println("so chan"); 
        } else {
            System.out.println("so le");
        }
    }
}

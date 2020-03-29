/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayPackage;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Mang2Chieu {

    public static void main(String[] args) {
//        int[][] array = {
//            {2, 4, 5, 6},
//            {3, 1, 6, 8},
//            {1, 0, 1, 2}
//        };
//        System.out.println(array.length);
//        System.out.println(array[1][2]);

        int[][] array = new int[3][4]; // 3 -> do dai cua array
        //System.out.println(array[4][2]);
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.println("Moi ban nhap so: " + i + " " + j);
                array[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Sau day la ket qua");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

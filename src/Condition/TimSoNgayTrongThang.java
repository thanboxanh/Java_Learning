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
public class TimSoNgayTrongThang {
    
    public static void main(String[] args) {
        int thang = 2;
        int soNgay = 0;
        
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            soNgay = 31;
        } 
        if (thang == 2) {
            soNgay = 28;
        } 
        if (thang == 4 || thang == 6 || thang == 9 || thang == 11 ) {
            soNgay = 30;
        }
        
        if (soNgay == 0) {
            System.out.println("thang ko hop");
        } else {
            System.out.println(soNgay);
        }
        
    }
}

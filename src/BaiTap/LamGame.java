/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap;

/**
 *
 * @author PC
 */
public class LamGame {
    
    static String thietKeGame() {
        String a = "Nhân vật a";
        return a;
    }
    
    static void lapTrinhGame(String thietKeGame) {
        System.out.println(thietKeGame);
        
//        String a = "Bắt đầu lập trình game";
//        return a;
    }
    
    static String keimThuGame() {
        String a = "Bắt đầu kiem thu game";
        return a;
    }
    
    
    //Dung de lam game
    public static void main(String[] args) {
        String thietKenhanvat = thietKeGame();
        lapTrinhGame(thietKenhanvat);
//        System.out.println(thietke);
    }
}

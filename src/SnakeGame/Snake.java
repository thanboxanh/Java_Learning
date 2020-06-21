package SnakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

/**
 *
 * @author PC
 */
public class Snake {

    Hinh[] mangHinh = new Hinh[100];
    int dai = 30;
    int rong = 30;

    public Snake() {
        mangHinh[0] = new Hinh(20, 20);
        mangHinh[1] = new Hinh(20 + dai, 20);
    }

    void veHinh(Graphics g2d) throws IOException {
        for (int i = 0; i < mangHinh.length; i++) {
            g2d.fill3DRect(mangHinh[i].x, mangHinh[0].y, dai, rong, true);
        }
    }

    void moveRight(int chieuDaiPanel) {
        for (int i = 0; i < mangHinh.length; i++) {
            if (mangHinh[i] == null) {
                break;
            }
            mangHinh[i].x += dai;
        }
        if(mangHinh[0].x >= chieuDaiPanel) {
            resetVitri(chieuDaiPanel);
        }
    }
    void moveXuong(int chieuDaiPanel) {
        for (int i = 0; i < mangHinh.length; i++) {
            if (mangHinh[i] == null) {
                break;
            }
            mangHinh[i].y += dai;
        }
        if(mangHinh[0].y >= chieuDaiPanel) {
            resetVitri(chieuDaiPanel);
        }
    }
    
    void resetVitri(int chieuDaiPanel) {
        for (int i = 0; i < mangHinh.length; i++) {
            if (mangHinh[i] == null) {
                return;
            }
            mangHinh[i].x -= chieuDaiPanel;
        }
    }
}

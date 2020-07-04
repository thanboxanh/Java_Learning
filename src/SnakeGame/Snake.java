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
    int soLuongHinh = 2;

    public Snake() {
        mangHinh[0] = new Hinh(30, 30);
        mangHinh[1] = new Hinh(30 + dai, 30);
    }

    void veHinh(Graphics g2d) throws IOException {
        for (int i = 0; i < soLuongHinh; i++) {
            g2d.fill3DRect(mangHinh[i].x, mangHinh[i].y, dai, rong, true);
        }
    }

    void moveRight(int chieuDaiPanel) {
        Hinh tam = new Hinh(mangHinh[soLuongHinh - 1].x, mangHinh[soLuongHinh - 1].y);
        mangHinh[soLuongHinh - 1].x += rong;
        mangHinh[0] = new Hinh(tam.x, tam.y);
        resetVitri(chieuDaiPanel);
    }

    void moveXuong(int chieuDaiPanel) {
        Hinh tam = new Hinh(mangHinh[soLuongHinh - 1].x, mangHinh[soLuongHinh - 1].y);
        mangHinh[soLuongHinh - 1].y += dai;
        mangHinh[0] = new Hinh(tam.x, tam.y);
        resetVitri(chieuDaiPanel);
    }

    void moveTrai(int chieuDaiPanel) {
        Hinh tam = new Hinh(mangHinh[soLuongHinh - 1].x, mangHinh[soLuongHinh - 1].y);
        mangHinh[soLuongHinh - 1].x -= rong;
        mangHinh[0] = new Hinh(tam.x, tam.y);
        resetVitri(chieuDaiPanel);
    }

    void moveLen(int chieuDaiPanel) {
        Hinh tam = new Hinh(mangHinh[soLuongHinh - 1].x, mangHinh[soLuongHinh - 1].y);
        mangHinh[soLuongHinh - 1].y -= dai;
        mangHinh[0] = new Hinh(tam.x, tam.y);
        resetVitri(chieuDaiPanel);
    }

    void resetVitri(int chieuDaiPanel) {
        for (int i = 0; i < soLuongHinh; i++) {
            if (mangHinh[i].y == chieuDaiPanel) {
                mangHinh[i].y -= chieuDaiPanel;
                continue;
            }
            if (mangHinh[i].x == chieuDaiPanel) {
                mangHinh[i].x -= chieuDaiPanel;
                continue;
            }

            if (mangHinh[i].y == 0) {
                mangHinh[i].y += chieuDaiPanel;
                continue;
            }
            if (mangHinh[i].x == 0) {
                mangHinh[i].x += chieuDaiPanel;
                continue;
            }
        }
    }

    void eatPrey(Prey a, int huongdi) {
        if (mangHinh[soLuongHinh - 1].x == a.x && mangHinh[soLuongHinh - 1].y == a.y) {
            Hinh dauRan = mangHinh[soLuongHinh - 1];
            if (huongdi == 37) {
                mangHinh[soLuongHinh] = new Hinh(dauRan.x - dai, dauRan.y);
            } else if (huongdi == 38) {
                mangHinh[soLuongHinh] = new Hinh(dauRan.x, dauRan.y - dai);
            } else if (huongdi == 39) {
                mangHinh[soLuongHinh] = new Hinh(dauRan.x + dai, dauRan.y);
            } else {
                mangHinh[soLuongHinh] = new Hinh(dauRan.x, dauRan.y + dai);
            }

            soLuongHinh++;
        }
    }
}

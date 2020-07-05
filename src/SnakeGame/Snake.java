package SnakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

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
        for (int i = 0; i < soLuongHinh - 1; i++) {
            g2d.fill3DRect(mangHinh[i].x, mangHinh[i].y, dai, rong, true);
        }
        BufferedImage image = ImageIO.read(new File("head.png"));
        g2d.drawImage(image, mangHinh[soLuongHinh - 1].x, mangHinh[soLuongHinh - 1].y, dai, rong, null);
    }

    void moveRight(int chieuDaiPanel) {
        Hinh hinhMoi = new Hinh(mangHinh[soLuongHinh - 1].x + dai, mangHinh[soLuongHinh - 1].y);
        for(int i = soLuongHinh - 1; i >= 0; i--){
            hoanDoi(mangHinh[i], hinhMoi);
        }
        resetVitri(chieuDaiPanel);
    }
    
    void hoanDoi(Hinh h1, Hinh h2) {
        Hinh tam = new Hinh(h1.x, h1.y);
        h1.x = h2.x;
        h1.y = h2.y;
        
        h2.x = tam.x;
        h2.y = tam.y;
    }

    void moveXuong(int chieuDaiPanel) {
         Hinh hinhMoi = new Hinh(mangHinh[soLuongHinh - 1].x, mangHinh[soLuongHinh - 1].y + dai);
        for(int i = soLuongHinh - 1; i >= 0; i--){
            hoanDoi(mangHinh[i], hinhMoi);
        }
        resetVitri(chieuDaiPanel);
    }

    void moveTrai(int chieuDaiPanel) {
         Hinh hinhMoi = new Hinh(mangHinh[soLuongHinh - 1].x - dai, mangHinh[soLuongHinh - 1].y);
        for(int i = soLuongHinh - 1; i >= 0; i--){
            hoanDoi(mangHinh[i], hinhMoi);
        }
        resetVitri(chieuDaiPanel);
    }

    void moveLen(int chieuDaiPanel) {
        Hinh hinhMoi = new Hinh(mangHinh[soLuongHinh - 1].x, mangHinh[soLuongHinh - 1].y - dai);
        for(int i = soLuongHinh - 1; i >= 0; i--){
            hoanDoi(mangHinh[i], hinhMoi);
        }
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
            a.lamMoi = true;
        }
    }
}

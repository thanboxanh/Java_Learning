package SnakeGame;

import Graphic.ChuongNgaiVat;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Than Bo Xanh
 */
public class Prey {

    int dai = 50;
    int rong = 40 ;
    int x = 150, y = 30;
    boolean lamMoi = true;

    void veHinh(Graphics g2d, Snake snake) {
        Random random = new Random();
        if (lamMoi) {
            x = (random.nextInt(19) + 1) * 30;
            y = (random.nextInt(19) + 1) * 30;
            for (int i = 0; i < snake.soLuongHinh - 1; i++) {
                Hinh hinh = snake.mangHinh[i];
                if (x == hinh.x && y == hinh.y) {
                    x = (random.nextInt(19) + 1) * 30;
                    y = (random.nextInt(19) + 1) * 30;
                }
            }
            
            lamMoi = false;
        }
        BufferedImage image;
        try {
            int randomHinh = random.nextInt(10)+1;
            image = ImageIO.read(new File("prey" + randomHinh + ".png"));
            g2d.drawImage(image, x, y, dai, rong, null);
        } catch (IOException ex) {
            System.out.println("Không thể vẽ con mồi, vui lòng kiểm tra lại");
        }

    }
}

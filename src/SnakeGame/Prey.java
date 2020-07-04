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
 * @author PC
 */
public class Prey {

    int dai = 30;
    int rong = 30;
    int x = 150, y = 150;

    void veHinh(Graphics g2d, boolean drawPrey) throws IOException {
        Random random = new Random();
//        if (drawPrey) {
//            x = random.nextInt(21) * 30;
//            y = random.nextInt(21) * 30;
//        }
        BufferedImage image;
        try {
            image = ImageIO.read(new File("prey.png"));
            g2d.drawImage(image, x, y, dai, rong, null);
        } catch (IOException ex) {
            Logger.getLogger(ChuongNgaiVat.class.getName()).log(Level.SEVERE, null, ex);
        }
//        g2d.fill3DRect(x, y, dai, rong, true);
    }
}

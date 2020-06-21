package SnakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author PC
 */
public class Prey {

    int dai = 30;
    int rong = 30;
    int x = 0, y = 0;

    void veHinh(Graphics g2d, boolean drawPrey) throws IOException {
        Random random = new Random();
        if (drawPrey) {
            x = random.nextInt(700);
            y = random.nextInt(700);
        }
        g2d.fill3DRect(x, y, dai, rong, true);
    }
}

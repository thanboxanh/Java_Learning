package SnakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class ManHinhGame extends JPanel implements KeyListener {

    Snake snake = new Snake();
    Prey prey = new Prey();
    boolean drawPrey = true;
    int huongdi = 0, dem = 0;
    Timer timer;
    int chieuDaiPanel = 600;

    public ManHinhGame() {
        timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(huongdi == 39) {
                    snake.moveRight(chieuDaiPanel);
                } else if(huongdi == 40) {
                    snake.moveXuong(chieuDaiPanel);
                } else if(huongdi == 37) {
                    snake.moveTrai(chieuDaiPanel);
                } else if(huongdi == 38) {
                    snake.moveLen(chieuDaiPanel);
                }
                snake.eatPrey(prey, huongdi);
                dem++;
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g2d) {
        super.paintComponent(g2d);
        try {
            g2d.setColor(Color.GREEN);
            snake.veHinh(g2d);
            prey.veHinh(g2d, drawPrey);
            if(dem == 20){
                drawPrey = true;
//                dem = 0;
            } else {
                drawPrey = false;
            }
        } catch (Exception ex) {
                System.out.println("asdsadadad");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        huongdi = e.getKeyCode();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}

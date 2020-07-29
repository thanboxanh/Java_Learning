package SnakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    int huongdi = 0;
    Timer timer;
    int chieuDaiPanel = 600;
    int diem = 0;

    public ManHinhGame(JLabel jLabel) {
        timer = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (huongdi == 39) {
                    snake.moveRight(chieuDaiPanel);
                } else if (huongdi == 40) {
                    snake.moveXuong(chieuDaiPanel);
                } else if (huongdi == 37) {
                    snake.moveTrai(chieuDaiPanel);
                } else if (huongdi == 38) {
                    snake.moveLen(chieuDaiPanel);
                }
                if(snake.eatPrey(prey, huongdi)) {
                    diem++;
                }
                
                jLabel.setText("Score: " + diem);
                if(snake.XuLyThangThua()) {
                    JOptionPane.showMessageDialog(null, "Game over. \nYour score: " + diem);
                    timer.stop();
                }
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
            prey.veHinh(g2d, snake);
        } catch (Exception ex) {
            System.out.println("asdsadadad");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if ((huongdi == 37 && e.getKeyCode( ) == 39)
                || (huongdi == 39 && e.getKeyCode() == 37)
                || (huongdi == 38 && e.getKeyCode() == 40)
                || (huongdi == 40 && e.getKeyCode() == 38)) {
            return;
        }
        if (e.getKeyCode() <= 40 && e.getKeyCode() >= 37) {
            huongdi = e.getKeyCode();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

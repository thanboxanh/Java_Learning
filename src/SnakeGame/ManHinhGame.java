package SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author PC
 */
public class ManHinhGame extends JPanel implements KeyListener {

    Snake snake = new Snake();
    Prey prey = new Prey();
    boolean drawPrey = true;
    int direction = 0;
    Timer timer;
    int widthPanel = 600;
    int diem = 0;
    int dem = 0;
    boolean losed = false;
    Color[] colorLife = {Color.green, Color.WHITE, Color.orange, Color.yellow, Color.pink};

    public void reset() {
        snake = new Snake();
        snake.reset();
        repaint();
        if (dem == 4) {
            dem = 0;
            diem = 0;
        } else {
            dem++;
        }
    }

    public ManHinhGame(JLabel jLabel) {
        timer = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (direction == 39) {
                    snake.moveRight(widthPanel);
                } else if (direction == 40) {
                    snake.moveDown(widthPanel);
                } else if (direction == 37) {
                    snake.moveLeft(widthPanel);
                } else if (direction == 38) {
                    snake.moveUp(widthPanel);
                }
                if (snake.eatPrey(prey, direction)) {
                    diem++;
                }

                jLabel.setText("Score: " + diem);
                if (snake.XuLyThangThua()) {
                    JOptionPane.showMessageDialog(null, "Game over. \nYour score: " + diem);
                    timer.stop();
                    losed = true;
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
            g2d.setColor(colorLife[dem]);
            snake.veHinh(g2d, colorLife, dem);
            prey.veHinh(g2d, snake);
        } catch (Exception ex) {
            System.out.println("Bạn đã code sai, vui lòng kiểm tra lại");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if ((direction == 37 && e.getKeyCode() == 39)
                || (direction == 39 && e.getKeyCode() == 37)
                || (direction == 38 && e.getKeyCode() == 40)
                || (direction == 40 && e.getKeyCode() == 38)) {
            return;
        }
        if (e.getKeyCode() <= 40 && e.getKeyCode() >= 37) {
            direction = e.getKeyCode();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
class Surface extends JPanel {

    int x = 1000, y = 10;

    public Surface() {
        Timer timer = new Timer(1, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(x > 900) {
                    x--;
//                    repaint();
                } else if(x == 0) {
                    x++;
//                    ((Timer) (e.getSource())).restart();
                } else if (x > 100) {
                    x--;
                }
                repaint();
            }
        });
        timer.setInitialDelay(10);
        timer.start();
    }

    private void doDrawing(Graphics g2d) {
        try {
            veHinh(g2d);

//        Graphics2D g2d = (Graphics2D) g;
//        g2d.drawLine(100, 100, 100, 400);
//        g2d.drawLine(300, 100, 300, 400);
//        g2d.drawLine(100, 400, 300, 400);
//        g2d.drawLine(100, 100, 300, 100);
//        g2d.drawLine(100, 100, 300, 400);
//        g2d.drawLine(300, 100, 100, 400);
//        g2d.setColor(Color.RED);
//        g2d.fillRect(0, 0, 300, 1000);
//        
//        g2d.setColor(Color.ORANGE);
//        g2d.fillRect(300, 0, 300, 1000);
//        
//        g2d.setColor(Color.YELLOW);
//        g2d.fillRect(600, 0, 300, 1000);
//        
//        g2d.setColor(Color.YELLOW);
//        g2d.fillRect(900, 0, 300, 1000);
//        g2d.setBackground(Color.red);
        } catch (IOException ex) {
            Logger.getLogger(Surface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void ve7SacCauVong(Graphics g2d) {
        Color[] array = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, new Color(0, 0, 255), new Color(75, 0, 130), new Color(102, 0, 153)};
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            g2d.setColor(array[i]);
            g2d.fillRect(x, 0, 300, 1200);
            x = x + 300;
        }
    }

    void veHinhTron(Graphics g2d) {
        g2d.setColor(Color.RED);
        g2d.drawOval(300, 100, 300, 300);
        g2d.fillOval(900, 100, 300, 300);
    }

    void veHinh(Graphics g2d) throws IOException {
        final BufferedImage images = ImageIO.read(new File("player.png"));
        g2d.drawImage(images, x, y, 30, 30, null);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
        g.dispose();
    }
}

public class BasicEx extends JFrame {

    public BasicEx() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Simple Java 2D example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                BasicEx ex = new BasicEx();
                ex.setVisible(true);
            }
        });
    }
}

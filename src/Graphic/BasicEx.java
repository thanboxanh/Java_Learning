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
import java.util.Random;
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

    int x1 = 10, x2 = 10, y = 150;
    int tocdo1 = 10, tocdo2 = 10;
    boolean meo1Tien, meo2Tien = true;
    Random rand = new Random();
    String hinhTien1 = "meo.png", hinhTien2 = "meo1.png", hinhLui1 = "meo2.png", hinhLui2 = "meo3.png";
    String hinhHienTaiMeo1 = hinhTien1, hinhHienTaiMeo2 = hinhTien2;

    public Surface() throws InterruptedException {
        Thread.sleep(5000);
        Timer timer = new Timer(50, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                randomTocDo();
                if (meo1Tien) {
                    x1 += tocdo1;
                    if(hinhHienTaiMeo1.equals(hinhTien1)) {
                        hinhHienTaiMeo1 = hinhTien2;
                    } else {
                        hinhHienTaiMeo1 = hinhTien1;
                    }
                } else {
                    x1 -= tocdo1;
                    if(hinhHienTaiMeo1.equals(hinhLui1)) {
                        hinhHienTaiMeo1 = hinhLui2;
                    } else {
                        hinhHienTaiMeo1 = hinhLui1;
                    }
                }

                if (meo2Tien) {
                    x2 += tocdo2;
                    if(hinhHienTaiMeo2.equals(hinhTien1)) {
                        hinhHienTaiMeo2 = hinhTien2;
                    } else {
                        hinhHienTaiMeo2 = hinhTien1;
                    }
                } else {
                    x2 -= tocdo2;
                    if(hinhHienTaiMeo2.equals(hinhLui1)) {
                        hinhHienTaiMeo2 = hinhLui2;
                    } else {
                        hinhHienTaiMeo2 = hinhLui1;
                    }
                }

                if (x1 >= 1600) {
                    meo1Tien = false;
                } else if (x1 <= 10) {
                    meo1Tien = true;
                }
                if (x2 >= 1600) {
                    meo2Tien = false;
                } else if (x2 <= 10) {
                    meo2Tien = true;
                }

                repaint();
            }
        });
        timer.setInitialDelay(10);
        timer.start();
    }

    void randomTocDo() {
        tocdo1 = rand.nextInt(10) + 30;
        tocdo2 = rand.nextInt(10) + 30;
    }

    void run(Graphics g2d) throws IOException {
        veHinh(g2d, hinhHienTaiMeo1, x1, y);
        veHinh(g2d, hinhHienTaiMeo2,  x2, y + 150);
    }

    private void doDrawing(Graphics g2d) throws InterruptedException {
        try {
            run(g2d);

//            Thread.sleep(50);
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

    void veHinh(Graphics g2d, String hinh, int xs, int ys) throws IOException {
        final BufferedImage images = ImageIO.read(new File(hinh));
        g2d.drawImage(images, xs, ys, 100, 100, null);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        try {
            ve7SacCauVong(g);
            doDrawing(g);
            g.drawLine(1500, y, 1500, y + 150);
        } catch (InterruptedException ex) {
            Logger.getLogger(Surface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

public class BasicEx extends JFrame {

    public BasicEx() {

        try {
            initUI();
        } catch (InterruptedException ex) {
            Logger.getLogger(BasicEx.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initUI() throws InterruptedException {

        add(new Surface());

        setTitle("Simple Java 2D example");
        setSize(2000, 1500);
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
